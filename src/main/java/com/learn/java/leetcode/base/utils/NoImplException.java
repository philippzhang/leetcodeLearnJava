package com.learn.java.leetcode.base.utils;

public class NoImplException extends RuntimeException {
	public NoImplException(String message) {
		super(message);
	}

	public NoImplException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoImplException(Throwable cause) {
		super(cause);
	}

	public NoImplException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
