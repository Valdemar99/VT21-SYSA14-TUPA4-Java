package clientApplication;

import java.awt.EventQueue;

public class Application {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaClientGUI client = new JavaClientGUI();
					Controller controller = new Controller(client);
					client.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
