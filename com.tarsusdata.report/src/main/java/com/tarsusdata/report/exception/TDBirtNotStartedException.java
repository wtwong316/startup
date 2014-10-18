package com.tarsusdata.report.exception;

public class TDBirtNotStartedException extends RuntimeException{
	private static final long serialVersionUID = 3852979831589131283L;
	public TDBirtNotStartedException() {}
	public TDBirtNotStartedException(String message) {
		super(message);
	}
	
	public TDBirtNotStartedException(String message, Throwable e) {
		super(message, e);
	}
}
