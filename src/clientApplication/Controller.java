package clientApplication;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.Arrays;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.tempuri.*;

import tableModels.BuildingTableModel;
import tableModels.OfficeTableModel;

public class Controller {
	//Instance variables
		private JavaClientGUI client;
		private WebService1Soap proxy;
		
		public JavaClientGUI getClient() {
			return client;
		}

		public void setClient(JavaClientGUI client) {
			this.client = client;
		}

		public WebService1Soap getProxy() {
			return proxy;
		}

		public void setProxy(WebService1Soap proxy) {
			this.proxy = proxy;
		}

		//Constructor
		public Controller(JavaClientGUI client) {
			this.client = client;
			proxy = new WebService1SoapProxy();
			this.initialize();
		}
		
		public void initialize() {
			client.getBtnSearch().addActionListener(this.onSearchAction());
		}

		public void updateOfficeTable(JTable table) throws RemoteException {
			Office[] offices = proxy.showOffices();
			
			//Cast the office array from the proxy class into a List which is compatible with the table model class.
		    List<Office> officeList = Arrays.asList(offices);          
			OfficeTableModel dataModel = new OfficeTableModel(officeList);
			table.setModel(dataModel);
		}
		public void updateBuildingTable(JTable table) throws RemoteException {
			Building[] buildings = proxy.showBuildings();
			
			//Cast the building array from the proxy class into a List which is compatible with the table model class.
		    List<Building> buildingList = Arrays.asList(buildings);          
			BuildingTableModel dataModel = new BuildingTableModel(buildingList);
			table.setModel(dataModel);
		}
		
		public ActionListener onSearchAction() {
			return new ActionListener() {
				public void actionPerformed(ActionEvent arg){
					client.getLblFeedback().setText("");
					try {
						if(client.getRdbtnOffices().isSelected()) {
							updateOfficeTable(client.getTableOffices());
							client.getLblFeedback().setText("Updated offices.");
						} else {
							updateBuildingTable(client.getTableOffices());
							client.getLblFeedback().setText("Updated buildings.");
						}
					} catch (RemoteException e1) {
						String fullMessage = e1.getMessage();
						String partOfMessage = fullMessage.split(":")[1];
						int indexToTruncateAt = partOfMessage.indexOf('.');
						String message = partOfMessage.substring(0, indexToTruncateAt);
						
						client.getLblFeedback().setText(message);
					}
				}
			};
		}
		
}
