package models;
public class Produtos {

    private String tipo;
    private String modelo;
    private String marca;
    private int id;

    public Produtos(String tipo, String modelo, String marca, int id) {
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getId() {
        return id;
    }

}
