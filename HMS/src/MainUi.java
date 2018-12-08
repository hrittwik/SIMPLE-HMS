import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import org.com.dao.PatientDao;
import org.com.model.Patient;
 
public class MainUi extends JFrame implements ActionListener {
	JButton jb1, jb2, jb3, jb4, jb5, jbAdmitPatient, jbShowAdmitPatient, jbDischargePatient, jbShowDischargePatient, jbBill, jbShowAllBill,jbBillHistory;
	JTextField jt1, jt2, jt3, jt4, jt5, jt6, jt7, jt8, jt9, jtAdmitID, jtPatientID, jtDisease, jtRoomID, jtDoctorID, jtServiceID, jtDischargeID, jtAdmitId, jtBillID, jtBDischargeID, JtBRoomID, JtBServiceID, JtBNoOfDays, JtBTotalRoomCharge, jtBTotalCharges,jtBChargesPaid, jtBDueCharges, jtBPaymentMode;
	PatientDao dao;
	Patient p1;
	
    public MainUi() throws SQLException {
    	dao = new PatientDao();
        setTitle("Hospital Management System");
        JTabbedPane jtp = new JTabbedPane();
        getContentPane().add(jtp);
        GridLayout layout = new GridLayout();
        setLayout(layout);
        JPanel jp1 = new JPanel(new GridLayout(11, 2, 15, 15));
        JPanel jp2 = new JPanel(new GridLayout(7, 2, 15, 15));
        JPanel jp3 = new JPanel(new GridLayout(3, 2, 15, 15));
        JPanel jp4 = new JPanel(new GridLayout(13, 2, 15, 15));
        // Patient Registration Tab
        JLabel jl9 = new JLabel("ID");
        jl9.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
		JLabel jl1 = new JLabel("Name");
		//jl1.setBounds(5, 10, 60, 30);
		jl1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		JLabel jl2 = new JLabel("Father Name");
		//jl2.setBounds(5, 30, 60, 30);
		jl2.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		JLabel jl3 = new JLabel("Email");
		//jl3.setBounds(5, 50, 60, 30);
		jl3.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		JLabel jl4 = new JLabel("Contact No");
		jl4.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		JLabel jl5 = new JLabel("Age");
		jl5.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		JLabel jl6 = new JLabel("Gender");
		jl6.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		JLabel jl7 = new JLabel("Blood Group");
		jl7.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		JLabel jl8 = new JLabel("Address");
		jl8.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
		
		jt1 = new JTextField();
		//jt1.setBounds(100, 20, 150, 20);

		jt2 = new JTextField();
		//jt2.setBounds(100, 40, 150, 20);

		jt3 = new JTextField();
		//jt3.setBounds(100, 60, 150, 20);
		
		jt4 = new JTextField();
		jt5 = new JTextField();
		jt6 = new JTextField();
		jt7 = new JTextField();
		jt8 = new JTextField();
		jt9 = new JTextField();
		
		jb1 = new JButton("PatientRegistration");
		//jb1.setBounds(40, 100, 90, 40);

		jb2 = new JButton("Delete");
		//jb2.setBounds(150, 100, 90, 40);

		jb3 = new JButton("SearchPatient");
		//jb3.setBounds(250, 100, 90, 40);

		jb4 = new JButton("Show All Registered Patient");
		//jb4.setBounds(40, 200, 90, 40);

		//jb5 = new JButton("Search By name");
		//jb5.setBounds(140, 200, 90, 40);

		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		//jb5.addActionListener(this);
		
		jp1.add(jl9);
		jp1.add(jt9);
		
		jp1.add(jl1);
		jp1.add(jt1);
		
		jp1.add(jl2);
		jp1.add(jt2);
		
		jp1.add(jl3);
		jp1.add(jt3);
		
		jp1.add(jl4);
		jp1.add(jt4);
		
		jp1.add(jl5);
		jp1.add(jt5);
		
		jp1.add(jl6);
		jp1.add(jt6);
		
		jp1.add(jl7);
		jp1.add(jt7);
		
		jp1.add(jl8);
		jp1.add(jt8);
		
        jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		//jp1.add(jb5);
		
		//admit patient tab
        
		JLabel labelAdmitID = new JLabel();
        labelAdmitID.setText("AdmitID");
        labelAdmitID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        

        JLabel labelPatientID = new JLabel();
        labelPatientID.setText("PatientID");
        labelPatientID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        

        JLabel labelDisease = new JLabel();
        labelDisease.setText("Disease");
        labelDisease.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel labelRoomID = new JLabel();
        labelRoomID.setText("RoomID");
        labelRoomID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        

        JLabel labelDoctorID = new JLabel();
        labelDoctorID.setText("DoctorID");
        labelDoctorID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        

        JLabel labelServiceID = new JLabel();
        labelServiceID.setText("ServiceID");
        labelServiceID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        
        jtAdmitID = new JTextField();
		//jt1.setBounds(100, 20, 150, 20);

		jtPatientID = new JTextField();
		//jt2.setBounds(100, 40, 150, 20);

		jtDisease = new JTextField();
		//jt3.setBounds(100, 60, 150, 20);
		
		jtRoomID = new JTextField();
		jtDoctorID = new JTextField();
		jtServiceID = new JTextField();
		
		jbAdmitPatient = new JButton("AdmitPatient");
		jbAdmitPatient.addActionListener(this);
		
		jbShowAdmitPatient = new JButton("ShowAllAdmitPatient");
		jbShowAdmitPatient.addActionListener(this);
		
        jp2.add(labelAdmitID);
        jp2.add(jtAdmitID);
        
        jp2.add(labelPatientID);
        jp2.add(jtPatientID);
        
        jp2.add(labelDisease);
        jp2.add(jtDisease);
        
        jp2.add(labelRoomID);
        jp2.add(jtRoomID);
        
        jp2.add(labelDoctorID);
        jp2.add(jtDoctorID);
        
        jp2.add(labelServiceID);
        jp2.add(jtServiceID);
        
        jp2.add(jbAdmitPatient);
        jp2.add(jbShowAdmitPatient);
        
        //Discharge Patient
        JLabel jlDischargeID = new JLabel("DichargeID");
        jlDischargeID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel jlAdmitID = new JLabel("AdmitID");
        jlAdmitID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        jtAdmitId = new JTextField();
        jtDischargeID = new JTextField();
        
        jbDischargePatient = new JButton("DischargePatient");
        jbDischargePatient.addActionListener(this);
        
		jbShowDischargePatient = new JButton("ShowDischargePatient");
		jbShowDischargePatient.addActionListener(this);
		
        jp3.add(jlDischargeID);
        jp3.add(jtDischargeID);
        jp3.add(jlAdmitID);
        jp3.add(jtAdmitId);
        jp3.add(jbDischargePatient);
        jp3.add(jbShowDischargePatient);
        
        
        //Bill
        JLabel BillID= new JLabel("Bill ID");
        BillID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel BDischargeID = new JLabel("Discharge ID");
        BDischargeID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel BRoomID = new JLabel("Room ID");
        BRoomID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel ServiceID = new JLabel("Service ID");
        ServiceID.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel NoOfDays = new JLabel("No Of Days");
        NoOfDays.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel TotalRoomCharges = new JLabel("Total Room Charges");
        TotalRoomCharges.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel TotalCharges = new JLabel("Total Charges");
        TotalCharges.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel ChargesPaid = new JLabel("Charges Paid");
        ChargesPaid.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel DueCharges= new JLabel("Due Charges");
        DueCharges.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        JLabel PaymentMode = new JLabel("Payment Mode");
        PaymentMode.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
        
        
        
        
        jtBillID = new JTextField();
        jtBDischargeID = new JTextField();
        JtBRoomID = new JTextField();
        JtBServiceID= new JTextField();
        JtBNoOfDays = new JTextField();
        JtBTotalRoomCharge = new JTextField();
        jtBTotalCharges = new JTextField();
        jtBChargesPaid = new JTextField();
        jtBDueCharges = new JTextField();
        jtBPaymentMode = new JTextField();
        
        jbBill = new JButton("BillInvoice");
        jbBill.addActionListener(this);
        
        jbBillHistory = new JButton("BillHistory");
        jbBillHistory.addActionListener(this);
        
        
        
		
        jp4.add(BillID);
        jp4.add(jtBillID);
        
        jp4.add(BDischargeID);
        jp4.add(jtBDischargeID);
        
        jp4.add(BRoomID);
        jp4.add(JtBRoomID);
        
       
        jp4.add(ServiceID);
        jp4.add(JtBServiceID);
        

        jp4.add(NoOfDays);
        jp4.add(JtBNoOfDays);
        
        jp4.add(TotalRoomCharges);
        jp4.add(JtBTotalRoomCharge);
        
        jp4.add(TotalCharges);
        jp4.add(jtBTotalCharges);
        
        
        jp4.add(ChargesPaid);
        jp4.add(jtBChargesPaid);
        
        jp4.add(DueCharges);
        jp4.add(jtBDueCharges);
        
        jp4.add(PaymentMode);
        jp4.add(jtBPaymentMode);
        
        jp4.add(jbBill);
        jp4.add(jbBillHistory);
        
        jtp.addTab("Patient Registration", jp1);
        jtp.addTab("Admit Patient", jp2);
        jtp.addTab("Discharge Patient", jp3);
        jtp.addTab("Billing Tab", jp4);
    }
    
    public static void main(String[] args) {
        
    	try{
	        MainUi tp = new MainUi();
	        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        tp.setSize(500, 500);
	        tp.setVisible(true);
	        tp.setLocationRelativeTo(null);
	        tp.setExtendedState(JFrame.MAXIMIZED_BOTH);
    	} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
        
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getActionCommand().equals("SearchPatient")) {
			System.out.println("search clicked");
			p1 = new Patient();
			p1.setPatientId(Integer.parseInt(jt9.getText()));
			try {
				
				Patient p2 = dao.searchPatient(p1);
				if (p2 != null) {
					JOptionPane.showMessageDialog(null,
					"id found \nId is " + p2.getPatientId() + "\nName is " + p2.getPatientName() + "\nAge is " + p2.getPatientAge());
				} else
					JOptionPane.showMessageDialog(null, "id not available");
			} catch (SQLException e2) {
				System.out.println("error");
				JOptionPane.showMessageDialog(null, e2.getMessage());
				e2.printStackTrace();
			}
		}
		
		
		
		if (e.getActionCommand().equals("PatientRegistration")) {
			System.out.println("Patient Registration clicked");
			p1 = new Patient();
			
			p1.setPatientId(Integer.parseInt(jt9.getText()));
			p1.setPatientName(jt1.getText());
			p1.setFatherName(jt2.getText());
			p1.setPatientEmail(jt3.getText());
			p1.setPatientContactNo(jt4.getText());
			p1.setPatientAge(Integer.parseInt(jt5.getText()));
			p1.setPatientGender(jt6.getText());
			p1.setPatientBloodGroup(jt7.getText());
			p1.setPatientAddress(jt8.getText());
			
			try {
				boolean status = dao.AddPatient(p1);
				//System.out.println(status);
				if (status) {
					JOptionPane.showMessageDialog(null, "Record added");
				} else
					JOptionPane.showMessageDialog(null, "Id already available");
			} catch (SQLException e3) {
				  JOptionPane.showMessageDialog(null, e3.getMessage());
				  e3.printStackTrace();
			}
		}
		
		if (e.getActionCommand().equals("AdmitPatient")) {
			System.out.println("Admit Patient clicked");
			p1 = new Patient();
			
			p1.setAdmitID(Integer.parseInt(jtAdmitID.getText()));
			p1.setPatientId(Integer.parseInt(jtPatientID.getText()));
			p1.setDisease(jtDisease.getText());
			p1.setRoomID(Integer.parseInt(jtRoomID.getText()));
			p1.setDoctorID(Integer.parseInt(jtDoctorID.getText()));
			p1.setServiceID(Integer.parseInt(jtServiceID.getText()));
			
			try {
				boolean addStatus = dao.AddAdmitPatient(p1);
				//System.out.println(status);
				if (addStatus) {
					JOptionPane.showMessageDialog(null, "Record added");
				} else
					JOptionPane.showMessageDialog(null, "Id already available");
			} catch (SQLException e4) {
				  JOptionPane.showMessageDialog(null, e4.getMessage());
				  e4.printStackTrace();
			}
		}
		
		if (e.getActionCommand().equals("DischargePatient")) {
			System.out.println("Discharge Patient clicked");
			p1 = new Patient();
			
			p1.setBillID(Integer.parseInt(jtDischargeID.getText()));
			p1.setAdmitID(Integer.parseInt(jtAdmitId.getText()));
			
			try {
				boolean dischargeStatus = dao.DischargePatient(p1);
				//System.out.println(status);
				if (dischargeStatus) {
					JOptionPane.showMessageDialog(null, "Record added");
				} else
					JOptionPane.showMessageDialog(null, "Id already available");
			} catch (SQLException e5) {
				  JOptionPane.showMessageDialog(null, e5.getMessage());
				  e5.printStackTrace();
			}
		}
		
		if (e.getActionCommand().equals("BillInvoice")) {
			System.out.println("BillInvoice clicked");
			p1 = new Patient();
			
			p1.setBillID(Integer.parseInt(jtBillID.getText()));
			p1.setDischargeID(Integer.parseInt(jtBDischargeID.getText()));
			p1.setRoomID(Integer.parseInt(JtBRoomID.getText()));
			p1.setServiceID(Integer.parseInt(JtBServiceID.getText()));
			p1.setNoOfDays(Integer.parseInt(JtBNoOfDays.getText()));
			p1.setTotalRoomCharges(Integer.parseInt(JtBTotalRoomCharge.getText()));
			p1.setTotalCharges(Integer.parseInt(jtBTotalCharges.getText()));
			p1.setChargesPaid(Integer.parseInt(jtBChargesPaid.getText()));
			p1.setDueCharges(Integer.parseInt(jtBDueCharges.getText()));
			p1.setPaymentMode(jtBPaymentMode.getText());
			
			
			try {
				boolean billStatus = dao.billPatient(p1);
				//System.out.println(status);
				if (billStatus) {
					JOptionPane.showMessageDialog(null, "Record added");
				} else
					JOptionPane.showMessageDialog(null, "Id already available");
			} catch (SQLException e6) {
				  JOptionPane.showMessageDialog(null, e6.getMessage());
				  e6.printStackTrace();
			}
		}
		
		if (e.getActionCommand().equals("ShowAllAdmitPatient")) {
			try {
				List<Patient> list1 = dao.ShowAllAdmitPatient();
				{
					new ShowAllAdmitPatient(list1);
				}
			} catch (SQLException e7) {
				JOptionPane.showMessageDialog(null, e7.getMessage());
				e7.printStackTrace();
			}
		}
		
		if (e.getActionCommand().equals("Show All Registered Patient")) {
			try {
				List<Patient> list2 = dao.ShowAllRegisteredPatient();
				{
					new ShowAllRegisteredPatient(list2);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		if (e.getActionCommand().equals("ShowDischargePatient")) {
			try {
				List<Patient> list3 = dao.ShowAllDischargePatient();
				dao.getColumnNames();
				{
					new ShowAllDischargePatient(list3);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
		if (e.getActionCommand().equals("BillHistory")) {
			try {
				List<Patient> list4 = dao.ShowBillHistory();
				{
					new ShowBillHistory(list4);
				}
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		
	}
}