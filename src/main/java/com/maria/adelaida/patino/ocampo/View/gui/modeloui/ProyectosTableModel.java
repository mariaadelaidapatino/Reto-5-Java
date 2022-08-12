/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.maria.adelaida.patino.ocampo.View.gui.modeloui;

import com.maria.adelaida.patino.ocampo.Model.Model.Vo.ProyectosVo;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author maria
 */
public class ProyectosTableModel extends AbstractTableModel {
    
    private List<ProyectosVo> datos;
    
    public ProyectosTableModel(){
        this.datos =new ArrayList<>();
    }
    
    public void setDatos(List<ProyectosVo> datos){
        this.datos = datos;
        fireTableDataChanged();
    }
    
    public void addDato(ProyectosVo proyecto){
        this.datos.add(proyecto);
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
                return dato.getConstructora();
            case 2:
                return dato.getHabitaciones();
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
                return "Constructora";
            case 2:
                return "Habitaciones";
            case 3:
                return "Ciudad";                
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
                return Integer.class;
            case 3:
                return String.class;                
        }
        return super.getColumnClass(columnIndex);
    }
    
}
