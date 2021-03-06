/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engineering.View;

import Engineering.Students.EStudent;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class EStudentDetails4 extends AbstractTableModel{
    private static final String[] COLUME_NAMES = {"RegNO","NIC","First Name","Last Name","Email"};
    private static ArrayList<EStudent> list;
    
    EStudentDetails4(ArrayList<EStudent> stList){
        list=stList;
    }
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list.size();
    }

    public String getColumnName(int columnIndex){
        return COLUME_NAMES[columnIndex];
    }
    
    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return COLUME_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex){
            case 0:return list.get(rowIndex).getRegID();
            case 1:return list.get(rowIndex).getNic();
            case 2:return list.get(rowIndex).getFirstName();
            case 3:return list.get(rowIndex).getLastName();
            case 4:return list.get(rowIndex).getEmail();
            //case 3:return list.get(rowIndex).getFaculty();
            //case 4:return list.get(rowIndex).getDepartment();
            default:return "Error";
        }
    }
}
