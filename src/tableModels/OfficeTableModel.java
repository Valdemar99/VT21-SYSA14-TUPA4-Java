package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.tempuri.Office;

public class OfficeTableModel extends AbstractTableModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Office> items;

	public OfficeTableModel(List<Office> items) {
		this.items = items;
	}

	@Override
	public int getRowCount() {
		return items.size();
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch (columnIndex) {
		case 0: 
		case 1: 
		case 2: 
		case 3: return Integer.class;
		}
		return Object.class;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0: return "Office Number";
		case 1: return "Building Address";
		case 2: return "Ventilation Setting";
		case 3: return "Temperature Setting";
		}
		return null;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Office item = items.get(rowIndex);
		switch (columnIndex) {
		case 0: return item.getOfficeNumber();
		case 1: return item.getBuildingAddress();
		case 2: return item.getVentilationSetting();
		case 3: return item.getTemperatureSetting();
		}
		return null;

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 4;
	}

}

