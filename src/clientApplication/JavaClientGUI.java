package clientApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.ButtonGroup;

public class JavaClientGUI extends JFrame {

	private JPanel contentPane;
	private JTable tableOffices;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaClientGUI frame = new JavaClientGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JavaClientGUI() {
		Controller controller = new Controller(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 737, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBounds(0, 0, 717, 359);
		contentPane.add(contentPane_1);
		
		JRadioButton rdbtnOffices = new JRadioButton("Offices");
		buttonGroup.add(rdbtnOffices);
		rdbtnOffices.setBounds(6, 75, 109, 23);
		contentPane_1.add(rdbtnOffices);
		
		JRadioButton rdbtnBuildings = new JRadioButton("Buildings");
		buttonGroup.add(rdbtnBuildings);
		rdbtnBuildings.setBounds(6, 49, 109, 23);
		contentPane_1.add(rdbtnBuildings);
		
		JButton btnSearch = new JButton("Search");
		
		btnSearch.setBounds(10, 105, 89, 23);
		contentPane_1.add(btnSearch);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(210, 49, 425, 284);
		contentPane_1.add(scrollPane);
		
		tableOffices = new JTable();
		tableOffices.setFillsViewportHeight(true);
		scrollPane.setViewportView(tableOffices);
		
		JLabel lblFeedback = new JLabel("feedback");
		lblFeedback.setBounds(10, 345, 213, 14);
		contentPane_1.add(lblFeedback);
		
		btnSearch.addActionListener(controller.showOffices(rdbtnOffices, rdbtnBuildings, tableOffices, lblFeedback));
	}
}
