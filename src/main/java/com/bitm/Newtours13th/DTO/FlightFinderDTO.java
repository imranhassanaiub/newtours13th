package com.bitm.Newtours13th.DTO;

public class FlightFinderDTO {

	private String passengercount;
	private String departingfrom;
	private String departingOnMonth;
	private String departingOnDate;
	private String ArrivingIn;
	private String returningOnMonth;
	private String returningOnDate;
	private String airline;
	
	public String getPassengercount() {
		return passengercount;
	}
	public void setPassengercount(String passengercount) {
		this.passengercount = passengercount;
	}
	public String getDepartingfrom() {
		return departingfrom;
	}
	public void setDepartingfrom(String departingfrom) {
		this.departingfrom = departingfrom;
	}
	public String getDepartingOnMonth() {
		return departingOnMonth;
	}
	public void setDepartingOnMonth(String departingOnMonth) {
		this.departingOnMonth = departingOnMonth;
	}
	public String getDepartingOnDate() {
		return departingOnDate;
	}
	public void setDepartingOnDate(String departingOnDate) {
		this.departingOnDate = departingOnDate;
	}
	public String getArrivingIn() {
		return ArrivingIn;
	}
	public void setArrivingIn(String arrivingIn) {
		ArrivingIn = arrivingIn;
	}
	public String getReturningOnMonth() {
		return returningOnMonth;
	}
	public void setReturningOnMonth(String returningOnMonth) {
		this.returningOnMonth = returningOnMonth;
	}
	public String getReturningOnDate() {
		return returningOnDate;
	}
	public void setReturningOnDate(String returningOnDate) {
		this.returningOnDate = returningOnDate;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	@Override
	public String toString() {
		return "FlightFinderDTO [passengercount=" + passengercount + ", departingfrom=" + departingfrom
				+ ", departingOnMonth=" + departingOnMonth + ", departingOnDate=" + departingOnDate + ", ArrivingIn="
				+ ArrivingIn + ", returningOnMonth=" + returningOnMonth + ", returningOnDate=" + returningOnDate
				+ ", airline=" + airline + "]";
	}
	
	
}
