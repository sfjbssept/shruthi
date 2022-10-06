package com.flight.Admin.entity;

import java.util.List;

public class AdminEntity {

	public String flightNumber;
	public String airlines;
	public String from;
	public String to;
	public String startTime;
	public String endTime;
	public List<String> scheduledDays;
	public List<String> instrumentUsed;
	public Integer totalNumberOfBusinessClass;
	public Integer totalNumberOfNonBusinessClass;
	public float ticketCost;
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirlines() {
		return airlines;
	}
	public void setAirlines(String airlines) {
		this.airlines = airlines;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public List<String> getScheduledDays() {
		return scheduledDays;
	}
	public void setScheduledDays(List<String> scheduledDays) {
		this.scheduledDays = scheduledDays;
	}
	public List<String> getInstrumentUsed() {
		return instrumentUsed;
	}
	public void setInstrumentUsed(List<String> instrumentUsed) {
		this.instrumentUsed = instrumentUsed;
	}
	public Integer getTotalNumberOfBusinessClass() {
		return totalNumberOfBusinessClass;
	}
	public void setTotalNumberOfBusinessClass(Integer totalNumberOfBusinessClass) {
		this.totalNumberOfBusinessClass = totalNumberOfBusinessClass;
	}
	public Integer getTotalNumberOfNonBusinessClass() {
		return totalNumberOfNonBusinessClass;
	}
	public void setTotalNumberOfNonBusinessClass(Integer totalNumberOfNonBusinessClass) {
		this.totalNumberOfNonBusinessClass = totalNumberOfNonBusinessClass;
	}
	public float getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(float ticketCost) {
		this.ticketCost = ticketCost;
	}
	public AdminEntity(String flightNumber, String airlines, String from, String to, String startTime, String endTime,
			List<String> scheduledDays, List<String> instrumentUsed, Integer totalNumberOfBusinessClass,
			Integer totalNumberOfNonBusinessClass, float ticketCost) {
		super();
		this.flightNumber = flightNumber;
		this.airlines = airlines;
		this.from = from;
		this.to = to;
		this.startTime = startTime;
		this.endTime = endTime;
		this.scheduledDays = scheduledDays;
		this.instrumentUsed = instrumentUsed;
		this.totalNumberOfBusinessClass = totalNumberOfBusinessClass;
		this.totalNumberOfNonBusinessClass = totalNumberOfNonBusinessClass;
		this.ticketCost = ticketCost;
	}
	public AdminEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
