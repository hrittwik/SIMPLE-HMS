package org.com.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import org.com.model.Patient;
import org.com.util.DatabaseUtil;

public class PatientDao {
	Connection con;
	Statement st;
	PreparedStatement pst;
	ResultSet rs;
	ResultSetMetaData rsmd;
	Patient p1;
	
	public PatientDao() throws SQLException{
		con = DatabaseUtil.retrieveConnection(); 
	}
	
	public Patient searchPatient(Patient p) throws SQLException{ 
    	p1 = null;
		pst = con.prepareStatement("select * from patientregistration where PatientID=?");
		pst.setInt(1, p.getPatientId()); 
		rs = pst.executeQuery(); 
		 
		if (rs.next()) {
			p1 = new Patient(); 
			p1.setPatientId(rs.getInt(1));
			p1.setPatientName(rs.getString(2)); 
			p1.setPatientAge(rs.getInt(6)); 
		} 
		return p1;
	}
	
	boolean status = false;

	public boolean AddPatient(Patient p) throws SQLException {
		p1 = null;
		status = false;
		p1 = searchPatient(p);
		if (p1 == null) {
			pst = con.prepareStatement("INSERT INTO patientregistration VALUES (?,?,?,?,?,?,?,?,?)");
			pst.setInt(1, p.getPatientId());
			pst.setString(2, p.getPatientName());
			pst.setString(3, p.getFatherName());
			pst.setString(4, p.getPatientEmail());
			pst.setString(5, p.getPatientContactNo());
			pst.setInt(6, p.getPatientAge());
			pst.setString(7, p.getPatientGender());
			pst.setString(8, p.getPatientBloodGroup());
			pst.setString(9, p.getPatientAddress());
			
			int x = pst.executeUpdate();
			if (x == 1)
				status = true;
		}
		return status;
	}
	
	public Patient searchAdmitPatient(Patient p) throws SQLException{ 
    	p1 = null;
		pst = con.prepareStatement("select * from admitpatient where AdmitID=?");
		pst.setInt(1, p.getAdmitID()); 
		rs = pst.executeQuery(); 
		 
		if (rs.next()) {
			p1 = new Patient(); 
			p1.setAdmitID(rs.getInt(1));
			p1.setPatientId(rs.getInt(2)); 
			p1.setDisease(rs.getString(3));
			
		} 
		return p1;
	}
	
	boolean addStatus = false;

	public boolean AddAdmitPatient(Patient p) throws SQLException {
		p1 = null;
		addStatus = false;
		p1 = searchAdmitPatient(p);
		if (p1 == null) {
			pst = con.prepareStatement("INSERT INTO admitpatient VALUES (?,?,?,now(),?,?,?)");
			pst.setInt(1, p.getAdmitID());
			pst.setInt(2, p.getPatientId());
			pst.setString(3, p.getDisease());
			pst.setInt(4, p.getRoomID());
			pst.setInt(5, p.getDoctorID());
			pst.setInt(6, p.getServiceID());
			
			int x = pst.executeUpdate();
			if (x == 1)
				addStatus = true;
		}
		return addStatus;
	}
	
	public Patient searchDischargePatient(Patient p) throws SQLException{ 
    	p1 = null;
		pst = con.prepareStatement("select * from dischargepatient where dischargeid=?");
		pst.setInt(1, p.getDischargeID()); 
		rs = pst.executeQuery(); 
		 
		if (rs.next()) {
			p1 = new Patient(); 
			p1.setDischargeID(rs.getInt(1));
			p1.setAdmitID(rs.getInt(2)); 
			
		} 
		return p1;
	}
	
	
	boolean dischargeStatus = false;
	
	public boolean DischargePatient(Patient p) throws SQLException {
		p1 = null;
		dischargeStatus = false;
		p1 = searchDischargePatient(p);
		if (p1 == null) {
			pst = con.prepareStatement("INSERT INTO dischargepatient VALUES (?,?,now())");
			pst.setInt(1, p.getDischargeID());
			pst.setInt(2, p.getAdmitID());
			
			int x = pst.executeUpdate();
			if (x == 1)
				addStatus = true;
		}
		return dischargeStatus;
	}
	
	public Patient searchBillPatient(Patient p) throws SQLException{ 
    	p1 = null;
		pst = con.prepareStatement("select * from bill where billid=?");
		pst.setInt(1, p.getBillID()); 
		rs = pst.executeQuery(); 
		 
		if (rs.next()) {
			p1 = new Patient(); 
			p1.setBillID(rs.getInt(1));
			p1.setDischargeID(rs.getInt(2)); 
			
		} 
		return p1;
	}
	
	
	boolean billStatus = false;
	
	public boolean billPatient(Patient p) throws SQLException {
		p1 = null;
		billStatus = false;
		p1 = searchBillPatient(p);
		if (p1 == null) {
			pst = con.prepareStatement("INSERT INTO bill VALUES (?,?,now(),?,?,?,?,?,?,?,?)");
			pst.setInt(1, p.getBillID());
			pst.setInt(2, p.getDischargeID());
			pst.setInt(3, p.getRoomID());
			pst.setInt(4, p.getServiceID());
			pst.setInt(5, p.getNoOfDays());
			pst.setInt(6, p.getTotalRoomCharges());
			pst.setInt(7, p.getTotalCharges());
			pst.setInt(8, p.getChargesPaid());
			pst.setInt(9, p.getDueCharges());
			pst.setString(10, p.getPaymentMode());
			
			int x = pst.executeUpdate();
			if (x == 1)
				addStatus = true;
		}
		return billStatus;
	}
	
	public List<Patient> ShowAllAdmitPatient() throws SQLException {
		List<Patient> list1 = new ArrayList<Patient>();
		st = con.createStatement();
		rs = st.executeQuery("select * from admitpatient where admitid not in(select admitid from dischargepatient);");
		p1 = null;
		
		while (rs.next()) {
			p1 = new Patient();
			p1.setAdmitID(rs.getInt(1));
			p1.setPatientId(rs.getInt(2));
			p1.setDisease(rs.getString(3));
			p1.setAdmitDate(rs.getInt(4));
			p1.setRoomID(rs.getInt(5));
			p1.setDoctorID(rs.getInt(6));
			p1.setServiceID(rs.getInt(7));
			list1.add(p1);
		}
		//System.out.println("list size is " + list1.size());
		return list1;
	}
	
	public List<Patient> ShowAllRegisteredPatient() throws SQLException {
		List<Patient> list2 = new ArrayList<Patient>();
		st = con.createStatement();
		rs = st.executeQuery("select * from patientregistration");
		p1 = null;
		
		while (rs.next()) {
			p1 = new Patient();
			
			p1.setPatientId(rs.getInt(1));
			p1.setPatientName(rs.getString(2));
			p1.setFatherName(rs.getString(3));
			p1.setPatientEmail(rs.getString(4));
			p1.setPatientContactNo(rs.getString(5));
			p1.setPatientAge(rs.getInt(6));
			p1.setPatientGender(rs.getString(7));
			p1.setPatientBloodGroup(rs.getString(8));
			p1.setPatientAddress(rs.getString(9));
			list2.add(p1);
		}
		//System.out.println("list size is " + list1.size());
		return list2;
	}
	
	public List<Patient> ShowAllDischargePatient() throws SQLException {
		List<Patient> list3 = new ArrayList<Patient>();
		st = con.createStatement();
		rs = st.executeQuery("select * from dischargepatient");
		p1 = null;
		
		while (rs.next()) {
			p1 = new Patient();
			
			p1.setDischargeID(rs.getInt(1));
			p1.setAdmitID(rs.getInt(2));
			p1.setDischargeDate(rs.getInt(3));
			list3.add(p1);
		}
		//System.out.println("list size is " + list1.size());
		return list3;
	}
	
	public List<Patient> ShowBillHistory() throws SQLException {
		List<Patient> list4 = new ArrayList<Patient>();
		st = con.createStatement();
		rs = st.executeQuery("select * from Bill");
		p1 = null;
		
		while (rs.next()) {
			p1 = new Patient();
			
			p1.setBillID(rs.getInt(1));
			p1.setDischargeID(rs.getInt(2));
			p1.setDischargeDate(rs.getInt(3));
			p1.setRoomID(rs.getInt(4));
			p1.setServiceID(rs.getInt(5));
			p1.setNoOfDays(rs.getInt(6));
			p1.setTotalRoomCharges(rs.getInt(7));
			p1.setTotalCharges(rs.getInt(8));
			p1.setChargesPaid(rs.getInt(9));
			p1.setDueCharges(rs.getInt(10));
			p1.setPaymentMode(rs.getString(11));
			
			list4.add(p1);
		}
		//System.out.println("list size is " + list1.size());
		return list4;
	}
	
	public void getColumnNames() throws SQLException {
	    
		st = con.createStatement();
		rs = st.executeQuery("select * from Bill");
		rsmd = rs.getMetaData();
		
		p1 = new Patient();
		p1.setColumnName1(rsmd.getColumnName(1));
		p1.setColumnName2(rsmd.getColumnName(2));
		p1.setColumnName3(rsmd.getColumnName(3));
		System.out.println(rsmd.getColumnName(3));

	}
	
	
	
}