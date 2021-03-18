package com.lti.entity;

public class TicketDto {
	long busId;
    long customerId;
    String psgName;
    int psgAge;
    int seat=40;
	public long getBusId() {
		return busId;
	}
	public void setBusId(long busId) {
		this.busId = busId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public String getPsgName() {
		return psgName;
	}
	public void setPsgName(String psgName) {
		this.psgName = psgName;
	}
	public int getPsgAge() {
		return psgAge;
	}
	public void setPsgAge(int psgAge) {
		this.psgAge = psgAge;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "TicketDto [busId=" + busId + ", customerId=" + customerId + ", psgName=" + psgName + ", psgAge="
				+ psgAge + ", seat=" + seat + "]";
	}
    
    

}
