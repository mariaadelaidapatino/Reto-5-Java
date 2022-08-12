package com.maria.adelaida.patino.ocampo.Model.Model.Vo;

public class LiderVo {
    Integer id;
    String nombre;
    String primer_apellido;
    String ciudad;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPrimer_apellido() {
        return primer_apellido;
    }
    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return String.format("%3d %-25s %-20s %-15s ", id, nombre, primer_apellido, ciudad);
    }
    
}
