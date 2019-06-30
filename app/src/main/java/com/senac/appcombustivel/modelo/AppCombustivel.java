package com.senac.appcombustivel.modelo;

public class AppCombustivel {
    private int id;
    private String km_atual;
    private String tipo;
    private String lts_combustivel;
  

    public int getId() {
        return id;
    }

    public void setId_abastecimento(int id) {
        this.id = id;
    }

    public String getKm_atual() {
        return km_atual;
    }

    public void setKm_atual(String km_atual) {
        this.km_atual = km_atual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLts_combustivel() {
        return lts_combustivel;
    }

    public void setLts_combustivel(String lts_combustivel) {
        this.lts_combustivel = lts_combustivel;
    }

   

    public AppCombustivel (int id, String km_atual, String tipo, String lts_combustivel) {
        this.id = id;
        this.km_atual = km_atual;
        this.tipo = tipo;
        this.lts_combustivel = lts_combustivel;

    }


}
