package com.nt.bo;

import lombok.Getter;
import lombok.Setter;

public class CustomerBO {
	private String custName;
	private String custAddrs;
	private Float pAmt;
	private Float time;
	private Float rate;
	private Float IntrestAmount;

	// setters and getters
	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustAddrs() {
		return custAddrs;
	}

	public void setCustAddrs(String custAddrs) {
		this.custAddrs = custAddrs;
	}

	public Float getpAmt() {
		return pAmt;
	}

	public void setpAmt(Float pAmt) {
		this.pAmt = pAmt;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Float getIntrestAmount() {
		return IntrestAmount;
	}

	public void setIntrestAmount(Float intrestAmount) {
		IntrestAmount = intrestAmount;
	}

	// to String()
	@Override
	public String toString() {
		return "CustomerBO [custName=" + custName + ", custAddrs=" + custAddrs + ", pAmt=" + pAmt + ", time=" + time
				+ ", rate=" + rate + ", IntrestAmount=" + IntrestAmount + "]";
	}

}
