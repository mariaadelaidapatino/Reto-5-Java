/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maria.adelaida.patino.ocampo.View.gui.modeloui;

import com.maria.adelaida.patino.ocampo.Model.Model.Vo.LiderVo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author maria
 */
public class LideresTableModel extends AbstractTableModel{
     private List<LiderVo> datos;
    
    public LideresTableModel(){
        this.datos =new ArrayList<>();
    }
    
    public void setDatos(List<LiderVo> datos){
        this.datos = datos;
        fireTableDataChanged();
    }
    
    public void addDato(LiderVo lider){
        this.datos.add(lider);
        var row = getRowCount() -1;
        fireTableRowsInserted(row,row);
    }
    
    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;       
    }

    @Override
    public Object getValueAt(int row, int column) {
        var dato = datos.get(row);
        switch (column){
            case 0:
                return dato.getId();
            case 1:
                return dato.getNombre();
            case 2:
                return dato.getPrimer_apellido();
            case 3:
                return dato.getCiudad();                
        }
        return null;
    }    
    
    @Override
    public String getColumnName(int column) {
            switch (column){
            case 0:
                return "Id";
            case 1:
                return "Nombre";
            case 2:
                return "Primer Apellido";
            case 3:
                return "Ciudad de Residencia";                
        }
        return null;
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
            switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;                
        }
        return super.getColumnClass(columnIndex);
    }
}
