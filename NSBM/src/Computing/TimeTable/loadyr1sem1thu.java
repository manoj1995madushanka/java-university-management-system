
package Computing.TimeTable;

import Business.TimeTable.*;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class loadyr1sem1thu extends AbstractTableModel{
    private static final String[] COLUME_NAMES = {"Time","Subject","Location"};
    private static ArrayList<timetable> list;
    
    loadyr1sem1thu(ArrayList<timetable> LList){
        list=LList;
    }

    @Override
    public int getRowCount() {
        return list.size();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getColumnName(int columnIndex){
        return COLUME_NAMES[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return COLUME_NAMES.length;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return list.get(rowIndex).getTime();
            case 1:return list.get(rowIndex).getSubname();
            case 2:return list.get(rowIndex).getLocation();
            
            default:return "Error";
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
