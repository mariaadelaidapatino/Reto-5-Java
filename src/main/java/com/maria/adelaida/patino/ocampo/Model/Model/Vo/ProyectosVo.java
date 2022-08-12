package com.maria.adelaida.patino.ocampo.Model.Model.Vo;

public class ProyectosVo {
    Integer id;
    String constructora;
    Integer habitaciones;
    String banco;
    String ciudad;
    
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getConstructora() {
        return constructora;
    }
    public void setConstructora(String constructora) {
        this.constructora = constructora;
    }
    public Integer getHabitaciones() {
        return habitaciones;
    }
    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }    
    @Override
    public String toString() {
        return String.format("%3d %-25s %7d %-20s %-15s", id, constructora, habitaciones, banco, ciudad);
    }
    

}
