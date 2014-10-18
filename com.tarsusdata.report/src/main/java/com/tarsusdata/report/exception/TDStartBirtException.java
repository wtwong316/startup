package com.tarsusdata.report.exception;

public class TDStartBirtException extends RuntimeException{
	private static final long serialVersionUID = 3852979831589131283L;
	public TDStartBirtException() {}
	public TDStartBirtException(String message) {
		super(message);
	}
	
	public TDStartBirtException(String message, Throwable e) {
		super(message, e);
	}
}
