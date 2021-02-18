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
		private WebService1SoapProxy proxy;
		
		public JavaClientGUI getClient() {
			return client;
		}

		public void setClient(JavaClientGUI client) {
			this.client = client;
		}

		public WebService1SoapProxy getProxy() {
			return proxy;
		}

		public void setProxy(WebService1SoapProxy proxy) {
			this.proxy = proxy;
		}

		public Controller(JavaClientGUI client) {
			this.client = client;
			proxy = new WebService1SoapProxy();
		}
		
		public void updateOfficeTable(JTable table) throws RemoteException {
			Office[] offices = proxy.showOffices();
		    List<Office> officeList = Arrays.asList(offices);          
			OfficeTableModel dataModel = new OfficeTableModel(officeList);
			table.setModel(dataModel);
		}
		public void updateBuildingTable(JTable table) throws RemoteException {
			Building[] buildings = proxy.showBuildings();
		    List<Building> buildingList = Arrays.asList(buildings);          
			BuildingTableModel dataModel = new BuildingTableModel(buildingList);
			table.setModel(dataModel);
		}
		
		public ActionListener showOffices(JRadioButton rdbtnOffices, JRadioButton rdbtnBuildings, JTable tableOffices, JLabel lblFeedback) {
			return new ActionListener() {
				public void actionPerformed(ActionEvent arg){
					lblFeedback.setText("Executing");
					try {
						if(rdbtnOffices.isSelected()) {
							updateOfficeTable(tableOffices);
							lblFeedback.setText("Updated offices.");
						} else {
							updateBuildingTable(tableOffices);
							lblFeedback.setText("Updated buildings.");
						}
					} catch (RemoteException e1) {
						lblFeedback.setText("Error");
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			};
		}
		
}
