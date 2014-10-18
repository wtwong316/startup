package com.tarsusdata.common.exception;

public class TDFileNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 3852979831589131283L;
	public TDFileNotFoundException() {}
	public TDFileNotFoundException(String message) {
		super(message);
	}
	
	public TDFileNotFoundException(String message, Throwable e) {
		super(message, e);
	}
}
