import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import org.com.model.Patient;

public class ShowAllDischargePatient extends JFrame{
	
	public ShowAllDischargePatient(List<Patient> list3){
	
	int col=3;
	int row=list3.size()+1;
	//System.out.println("row is " + row);
	Patient p2 = new Patient();
	setLayout(new GridLayout(row, col));
	//add(new JLabel(p2.getColumnName1()));
	add(new JLabel(p2.getColumnName2()));
	add(new JLabel(p2.getColumnName3()));
	p2.getColumnName1();
	
	for (Patient patient : list3) {
		add(new JLabel(new Integer(patient.getDischargeID()).toString()));
		add(new JLabel(new Integer(patient.getAdmitID()).toString()));
		add(new JLabel(new Integer(patient.getDischargeDate()).toString()));
	}

	setVisible(true);
	pack();
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setLocationRelativeTo(null);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
