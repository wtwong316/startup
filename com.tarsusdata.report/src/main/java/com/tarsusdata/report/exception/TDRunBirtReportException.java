package com.tarsusdata.report.exception;

public class TDRunBirtReportException extends RuntimeException{
	private static final long serialVersionUID = 3852979831589131283L;
	public TDRunBirtReportException() {}
	public TDRunBirtReportException(String message) {
		super(message);
	}
	
	public TDRunBirtReportException(String message, Throwable e) {
		super(message, e);
	}
	
	public TDRunBirtReportException(Throwable e) {
		super(e);
	}
}
