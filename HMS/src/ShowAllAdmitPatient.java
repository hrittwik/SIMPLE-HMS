import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import org.com.model.Patient;

public class ShowAllAdmitPatient extends JFrame{
	
	public ShowAllAdmitPatient(List<Patient> list1){
	
	int col=7;
	int row=list1.size();
	//System.out.println("row is " + row);
	
	setLayout(new GridLayout(row, col));
	
	for (Patient patient : list1) {
		add(new JLabel(new Integer(patient.getAdmitID()).toString()));
		add(new JLabel(new Integer(patient.getPatientId()).toString()));
		add(new JLabel(patient.getDisease()));
		add(new JLabel(new Integer(patient.getAdmitDate()).toString()));
		add(new JLabel(new Integer(patient.getRoomID()).toString()));
		add(new JLabel(new Integer(patient.getDoctorID()).toString()));
		add(new JLabel(new Integer(patient.getServiceID()).toString()));
	}

	setVisible(true);
	pack();
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setLocationRelativeTo(null);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
