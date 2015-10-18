/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kornelia
 */
public class PersonalModel extends AbstractTableModel{
    private Personal[] person = new Personal[12];
    public PersonalModel() {
        person[0] = new Personal("Mieciu","Mężczyzna",24,true);
        person[1] = new Personal("Grażyna","Kobieta",23,true);
        person[2] = new Personal("Zdzisiu","Mężczyzna",24,false);
    }
    
    @Override
    public int getRowCount() {
       int len = person.length;
       return len;
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       if(person[rowIndex] == null) {
           return "";
       }
        switch(columnIndex){
            case 0:
                return person[rowIndex].getName();
            case 1:
                return person[rowIndex].getSex();
            case 2:
                return person[rowIndex].getAge();
            case 3:
                return person[rowIndex].getGames();
        }
        return "unknown";
    }
    
    @Override
    public String getColumnName(int column){
        switch (column) {
            case 0:
                return "Imię";
            case 1:
                return "Płeć";
            case 2:
                return "Wiek";
            case 3:
                return "Planszówki";
        }
        return "Unknown";
    }

    public Personal getPerson(int row) {
        
        return person[row];
    }

    public void setPerson(Personal personal, int row) {
       
            person[row] = personal;
            fireTableDataChanged();
        
    }
    
}
