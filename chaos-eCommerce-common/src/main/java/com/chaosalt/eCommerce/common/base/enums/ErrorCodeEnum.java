package com.chaosalt.eCommerce.common.base.enums;

public enum ErrorCodeEnum {
	/**
	 * 
	 */
	OR1001000(1001000, "参数异常"),
	/**
	 * 
	 */
	PR1002000(1001000, "参数异常"),
	/**
	 * 
	 */
	UC1003000(1001000, "参数异常"),;

	private int code;
	private String msg;

	ErrorCodeEnum(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int code() {
		return code;
	}

	public String msg() {
		return msg;
	}

	public static ErrorCodeEnum getEnum(int code) {
		for (ErrorCodeEnum element : ErrorCodeEnum.values()) {
			if (element.code() == code) {
				return element;
			}
		}
		return null;
	}
}
