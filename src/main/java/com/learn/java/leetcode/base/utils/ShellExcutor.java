package com.learn.java.leetcode.base.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class ShellExcutor {
	/**
	 * Java执行shell脚本入口
	 * @param clazz 脚本文件名
	 * @throws Exception
	 */
	public static void service(Class clazz) {
		String shellDir = "";
		String shellPath = "";

		String packageName = clazz.getPackage().getName();
		shellPath= "/" + packageName.replaceAll("\\.", "/") + "/main.sh";

		try {
			//获取脚本所在的目录
			String configFilePath = Thread.currentThread().getContextClassLoader().getResource("leetCode.properties").getPath();
			File f = new File(configFilePath);
			shellDir = f.getParent();
			//log.info("shell dir = " + shellDir);

			//拼接完整的脚本目录
			shellPath = shellDir + shellPath;
			//log.info("shell path = " + shellPath);

			f  = new File(shellPath);
			String param = f.getParent();
			//执行脚本
			callScript(shellPath,param);

		} catch (Exception e) {
			e.printStackTrace();
			//log.error("ShellExcutor异常" + e.getMessage(), e);
			//throw e;
		}
	}

	/**
	 * 脚本文件具体执行及脚本执行过程探测
	 * @param script 脚本文件绝对路径
	 * @throws Exception
	 */
	private static void callScript(String script,String param) throws Exception{
		try {
			String cmd = "sh " + script+" "+param;

			//启动独立线程等待process执行完成
			CommandWaitForThread commandThread = new CommandWaitForThread(cmd);
			commandThread.start();

			while (!commandThread.isFinish()) {
				//System.out.println("shell " + script + " 还未执行完毕,10s后重新探测");
				Thread.sleep(100);
			}

			//检查脚本执行结果状态码
			if(commandThread.getExitValue() != 0){
				throw new Exception("shell " + script + "执行失败,exitValue = " + commandThread.getExitValue());
			}
			System.out.println("执行成功,返回 " + commandThread.getExitValue());
		}
		catch (Exception e){
			throw new Exception("执行脚本发生异常,脚本路径" + script, e);
		}
	}

	/**
	 * 脚本函数执行线程
	 */
	static class CommandWaitForThread extends Thread {

		private String cmd;
		private boolean finish = false;
		private int exitValue = -1;

		public CommandWaitForThread(String cmd) {
			this.cmd = cmd;
		}

		@Override
		public void run(){
			try {
				//执行脚本并等待脚本执行完成
				Process process = Runtime.getRuntime().exec(cmd);

				//写出脚本执行中的过程信息
				BufferedReader infoInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
				BufferedReader errorInput = new BufferedReader(new InputStreamReader(process.getErrorStream()));
				String line = "";
				while ((line = infoInput.readLine()) != null) {
					System.out.println(line);
				}
				while ((line = errorInput.readLine()) != null) {
					System.err.println(line);
				}
				infoInput.close();
				errorInput.close();

				//阻塞执行线程直至脚本执行完成后返回
				this.exitValue = process.waitFor();
			} catch (Throwable e) {
				e.printStackTrace();
				//log.error("CommandWaitForThread accure exception,shell " + cmd, e);
				exitValue = 110;
			} finally {
				finish = true;
			}
		}

		public boolean isFinish() {
			return finish;
		}

		public void setFinish(boolean finish) {
			this.finish = finish;
		}

		public int getExitValue() {
			return exitValue;
		}
	}
}

