/**
 * 
 */
package com.qhit.lh.g4.xjl.t3.bean;

/**
 * @author 许金来
 *2017年12月13日下午4:27:48
 * TODO
 */
public class Dept {

	private int deptId;
	private String deptName;
	private String address;
	/**
	 * @param deptId
	 * @param deptName
	 * @param address
	 */
	public Dept(int deptId, String deptName, String address) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.address = address;
	}
	/**
	 * 
	 */
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
