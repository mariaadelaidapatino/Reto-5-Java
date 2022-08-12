package com.maria.adelaida.patino.ocampo.Model.Model.Vo;

public class ComprasVo {
    Integer id;
    String constructora;
    String banco;

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
    public String getBanco() {
        return banco;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }

    @Override
    public String toString() {
        return String.format("%3d %-25s %-20s", id, constructora, banco);
    }
      

}
