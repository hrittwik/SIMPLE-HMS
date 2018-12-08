import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import org.com.model.Patient;

public class ShowBillHistory extends JFrame{
	
	public ShowBillHistory(List<Patient> list4){
	
	int col=11;
	int row=list4.size();
	//System.out.println("row is " + row);
	
	setLayout(new GridLayout(row, col));
	
	for (Patient patient : list4) {
		add(new JLabel(new Integer(patient.getBillID()).toString()));
		add(new JLabel(new Integer(patient.getDischargeID()).toString()));
		add(new JLabel(new Integer(patient.getDischargeDate()).toString()));
		add(new JLabel(new Integer(patient.getRoomID()).toString()));
		add(new JLabel(new Integer(patient.getServiceID()).toString()));
		add(new JLabel(new Integer(patient.getNoOfDays()).toString()));
		add(new JLabel(new Integer(patient.getTotalRoomCharges()).toString()));
		add(new JLabel(new Integer(patient.getTotalCharges()).toString()));
		add(new JLabel(new Integer(patient.getChargesPaid()).toString()));
		add(new JLabel(new Integer(patient.getDueCharges()).toString()));
		add(new JLabel(patient.getPaymentMode()));
	}

	setVisible(true);
	pack();
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setLocationRelativeTo(null);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
