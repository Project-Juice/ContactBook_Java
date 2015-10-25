/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personal;

import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;


/**
 *
 * @author kornelia
 */
public class PersonalModel extends AbstractTableModel{
    private int rows = 1;
    private Personal[] person = new Personal[rows];
   
    Path p = Paths.get("~/plik.txt"); 
    
    @Override
    public int getRowCount() {
       int len = person.length;
       return len;
    }
    
    @Override
    public int getColumnCount() {
        return 5;
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
            case 4:
                return person[rowIndex].getContact();
        }
        return "unknown";
    }
    
    
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return false;
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
            case 4:
                return "Kontakt";
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
