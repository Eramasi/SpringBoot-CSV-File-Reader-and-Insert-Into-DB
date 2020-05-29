package com.app.CSVFileReader.Model;

import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int pid;
	private String pname;
	private long pcost;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public long getPcost() {
		return pcost;
	}
	public void setPcost(long pcost) {
		this.pcost = pcost;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	
	

}
