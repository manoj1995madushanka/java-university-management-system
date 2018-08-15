
package Business.Results;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class loadtbl2 extends AbstractTableModel{

    private static final String[] COLUMN_NAMES={"RegID","Name"};
    private static ArrayList<BSubjects> list;
    
    loadtbl2(ArrayList <BSubjects> bs){
        list=bs;
    }
    
    
    @Override
    public int getRowCount() {
        return list.size();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getColumnName(int columnIndex){
        return COLUMN_NAMES[columnIndex];
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;

//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:return list.get(rowIndex).getRegid();
            case 1:return list.get(rowIndex).getStname();
            default:return "ERROR";
        }
        
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
