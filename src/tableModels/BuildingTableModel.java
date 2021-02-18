package tableModels;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import org.tempuri.Building;

public class BuildingTableModel extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Building> items;

	public BuildingTableModel(List<Building> items) {
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
		}
		return Object.class;
	}

	@Override
	public String getColumnName(int column) {
		switch (column) {
		case 0: return "Address";
		}
		return null;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Building item = items.get(rowIndex);
		switch (columnIndex) {
		case 0: return item.getAddress();
		}
		return null;

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return 1;
	}
}
