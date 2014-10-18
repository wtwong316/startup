package com.tarsusdata.mongo;

public class AggregateCategory {
	public String getCatN() {
		return catN;
	}
	public void setCatN(String catN) {
		this.catN = catN;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	private String catN;
	private int count;
}
