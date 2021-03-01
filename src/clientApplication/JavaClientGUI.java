package clientApplication;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

public class JavaClientGUI extends JFrame {
	private JPanel contentPane;
	private JTable tableOffices;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblFeedback;
	private JRadioButton rdbtnOffices;
	private JRadioButton rdbtnBuildings;
	private JButton btnSearch;
	
	public JButton getBtnSearch() {
		return btnSearch;
	}
	
	public JTable getTableOffices() {
		return tableOffices;
	}

	public JLabel getLblFeedback() {
		return lblFeedback;
	}



	public JRadioButton getRdbtnOffices() {
		return rdbtnOffices;
	}




	public JRadioButton getRdbtnBuildings() {
		return rdbtnBuildings;
	}


	/**
	 * Create the frame.
	 */
	public JavaClientGUI() {		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 717, 359);
		contentPane.add(contentPane_1);
		
		rdbtnOffices = new JRadioButton("Offices");
		buttonGroup.add(rdbtnOffices);
		rdbtnOffices.setBounds(6, 37, 109, 23);
		contentPane_1.add(rdbtnOffices);
		
		rdbtnBuildings = new JRadioButton("Buildings");
		buttonGroup.add(rdbtnBuildings);
		rdbtnBuildings.setBounds(6, 11, 109, 23);
		contentPane_1.add(rdbtnBuildings);
		
		btnSearch = new JButton("Search");
		
		btnSearch.setBounds(10, 67, 89, 23);
		contentPane_1.add(btnSearch);
		
		lblFeedback = new JLabel("");
		lblFeedback.setBounds(10, 345, 707, 14);
		contentPane_1.add(lblFeedback);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(202, 11, 515, 310);
		contentPane_1.add(scrollPane);
		
		tableOffices = new JTable();
		scrollPane.setViewportView(tableOffices);
		tableOffices.setFillsViewportHeight(true);
	}
}
