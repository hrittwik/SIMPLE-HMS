import java.awt.GridLayout;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTable;

import org.com.model.Patient;

public class ShowAllRegisteredPatient extends JFrame{
	
	public ShowAllRegisteredPatient(List<Patient> list2){
	
	int col=9;
	int row=list2.size();
	//System.out.println("row is " + row);
	
	setLayout(new GridLayout(row, col));
	
	for (Patient patient : list2) {
		add(new JLabel(new Integer(patient.getPatientId()).toString()));
		add(new JLabel(patient.getPatientName()));
		add(new JLabel(patient.getFatherName()));
		add(new JLabel(patient.getPatientEmail()));
		add(new JLabel(patient.getPatientContactNo()));
		add(new JLabel(new Integer(patient.getPatientAge()).toString()));
		add(new JLabel(patient.getPatientGender()));
		add(new JLabel(patient.getPatientBloodGroup()));
		add(new JLabel(patient.getPatientAddress()));
	}

	setVisible(true);
	pack();
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	setLocationRelativeTo(null);
    setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
}
