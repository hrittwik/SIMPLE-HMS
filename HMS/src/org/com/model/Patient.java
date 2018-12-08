package org.com.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.ResultSetMetaData;

public class Patient{
	
	private int patientId;
	private String patientName;
	private String patientFatherName;
	private String patientEmail;
	private String contactNo;
	private int patientAge;
	private String patientGender;
	private String patientBloodGroup;
	private String patientAddress;
	private int admitID;
	private int roomId;
	private int doctorId;
	private int serviceId;
	private String disease;
	private int dischargeId;
	private int billId;
	private int noOfDays;
	private int totalRoomCharges;
	private int totalCharges;
	private int chargesPaid;
	private int dueCharges;
	private String paymentMode;
	private int admitDate;
	private int dischargeDate;
	private String columnName1;
	private String columnName2;
	private String columnName3;
	
	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int age) {
		this.patientAge = age;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int id) {
		this.patientId = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String name) {
		this.patientName = name;
	}
	
	public void setFatherName(String fatherName){
		this.patientFatherName = fatherName;
	}
	
	public String getFatherName(){
		return patientFatherName;
	}
	
	public void setPatientEmail(String email){
		this.patientEmail = email;
	}
	
	public String getPatientEmail(){
		return patientEmail;
	}
	
	public void setPatientContactNo(String contactNo){
		this.contactNo = contactNo;
	}
	
	public String getPatientContactNo(){
		return contactNo;
	}
	
	public void setPatientGender(String patientGender){
		this.patientGender = patientGender;
	}
	
	public String getPatientGender(){
		return patientGender;
	}
	
	public void setPatientBloodGroup(String patientBloodGroup){
		this.patientBloodGroup = patientBloodGroup;
	}
	
	public String getPatientBloodGroup(){
		return patientBloodGroup;
	}
	
	public void setPatientAddress(String patientAddress){
		this.patientAddress = patientAddress;
	}
	
	public String getPatientAddress(){
		return patientAddress;
	}
	
	public void setAdmitID(int admitID){
		this.admitID = admitID;
	}
	
	public int getAdmitID(){
		return admitID;
	}

	public void setDisease(String disease){
		this.disease = disease;
	}
	
	public String getDisease(){
		return disease;
	}

	public void setRoomID(int roomID){
		this.roomId = roomID;
	}
	
	public int getRoomID(){
		return roomId;
	}
	
	public void setDoctorID(int doctorID){
		this.doctorId = doctorID;
	}
	
	public int getDoctorID(){
		return doctorId;
	}
	
	public void setServiceID(int serviceID){
		this.serviceId = serviceID;
	}
	
	public int getServiceID(){
		return serviceId;
	}
	
	public void setDischargeID(int dischargeID){
		this.dischargeId = dischargeID;
	}
	
	public int getDischargeID(){
		return dischargeId;
	}
	
	public void setBillID(int billID){
		this.billId = billID;
	}
	
	public int getBillID(){
		return billId;
	}
	
	public void setNoOfDays(int noOfDays){
		this.noOfDays = noOfDays;
	}
	
	public int getNoOfDays(){
		return noOfDays;
	}
	
	public void setTotalRoomCharges(int totalRoomCharges){
		this.totalRoomCharges = totalRoomCharges;
	}
	
	public int getTotalRoomCharges(){
		return totalRoomCharges;
	}
	
	public void setTotalCharges(int totalCharges){
		this.totalCharges = totalCharges;
	}
	
	public int getTotalCharges(){
		return totalCharges;
	}
	
	public void setChargesPaid(int chargesPaid){
		this.chargesPaid = chargesPaid;
	}
	
	public int getChargesPaid(){
		return chargesPaid;
	}
	
	public void setDueCharges(int dueCharges){
		this.dueCharges = dueCharges;
	}
	
	public int getDueCharges(){
		return dueCharges;
	}
	
	public void setPaymentMode(String paymentMode){
		this.paymentMode = paymentMode;
	}
	
	public String getPaymentMode(){
		return paymentMode;
	}
	
	public void setAdmitDate(int admitDate){
		this.admitDate = admitDate;
	}
	
	public int getAdmitDate(){
		return admitDate;
	}
	
	public void setDischargeDate(int dischargeDate){
		this.dischargeDate = dischargeDate;
	}
	
	public int getDischargeDate(){
		return dischargeDate;
	}
	
	public void setColumnName1(String columnName){
		this.columnName1 = columnName;
	}
	
	public void getColumnName1(){
		System.out.println( columnName1);
	}
	
	public void setColumnName2(String columnName){
		this.columnName2 = columnName;
	}
	
	public String getColumnName2(){
		return columnName2;
	}
	
	public void setColumnName3(String columnName){
		this.columnName3 = columnName;
	}
	
	public String getColumnName3(){
		return columnName3;
	}
	
}
