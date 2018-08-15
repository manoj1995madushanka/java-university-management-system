/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computing.lecturers;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class CLecturerDetails extends AbstractTableModel{
    
    private static final String[] COLUMN_NAMES={"RegNO","NIC","Name","Email"};
    private static ArrayList<CLecturer> list;
    
    CLecturerDetails(ArrayList<CLecturer> BList){
        list=BList;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list.size();
    }

    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }
    
    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex){
            case 0:return list.get(rowIndex).getLecid();
            case 1:return list.get(rowIndex).getName();
            case 2:return list.get(rowIndex).getDegree();
            case 3:return list.get(rowIndex).getSubject();
            //case 4:return list.get(rowIndex).getEmail();
            //case 3:return list.get(rowIndex).getFaculty();
            //case 4:return list.get(rowIndex).getDepartment();
            default:return "Error";
        }
    }
}
