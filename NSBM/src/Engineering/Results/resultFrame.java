/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Engineering.Results;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author USER
 */
public class resultFrame extends AbstractTableModel{
    
    private static final String[] COLUMN_NAMES={"Reg ID","Name","Year","Semester"};
    private static ArrayList<Eresult> bs;
    
    

    resultFrame(ArrayList<Eresult> bslist) {
        bs=bslist;
    }

    

    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public int getRowCount() {
        return bs.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return bs.get(rowIndex).getRegid();
            case 1:return bs.get(rowIndex).getStname();
            case 2:return bs.get(rowIndex).getYear();
            case 3:return bs.get(rowIndex).getSemester();
            default:return "Error";
        }
    }
    
}
