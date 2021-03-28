package com.learn.java.leetcode.test001;

public class Test3 {

	public static String add(String n1,String n2){
		if(n1== null||n1.length()==0){
			return n2;
		}
		if(n2 == null||n2.length()==0){
			return n1;
		}

		char[] chs1 = n1.toCharArray();
		char[] chs2 = n2.toCharArray();

		StringBuffer stringBuffer = new StringBuffer();
		int i = 0;
		int r = 0;
		int s = 0;//进位
		while (i<chs1.length||i<chs2.length){
			int x = i<chs1.length ? (chs1[chs1.length-i-1]-'0') :0;
			int y = i<chs2.length ? (chs2[chs2.length-i-1]-'0') :0;
			r = x+y+s;
			s = r/10;
			r = r%10;
			stringBuffer.insert(0,r);
			i++;
		}

		if(s>0){
			stringBuffer.insert(0,1);
		}
		return stringBuffer.toString();
	}

	public static void main(String[] args) {
		System.out.println(add("123","2371"));
		System.out.println(add("133","2371"));

		System.out.println(add("1111133","11112371"));

		System.out.println(add("9999999999","9999999999"));
	}

}
