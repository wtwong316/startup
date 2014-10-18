package com.tarsusdata.common.exception;

public class TDFileIOException extends RuntimeException{
	private static final long serialVersionUID = 3852979831589131283L;
	public TDFileIOException() {}
	public TDFileIOException(String message) {
		super(message);
	}
	
	public TDFileIOException(String message, Throwable e) {
		super(message, e);
	}
}
