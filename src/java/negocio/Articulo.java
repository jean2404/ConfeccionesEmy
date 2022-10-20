/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author sagit
 */
public class Articulo {

    private String cod, nom;
    private double pre;
    private int sto;
    private String codCateg, marca, talla, color;

    public Articulo() {
    }

    public Articulo(String cod, String nom, double pre) {
        this.cod = cod;
        this.nom = nom;
        this.pre = pre;
    }

    public Articulo(String cod, String nom, double pre, String codCateg, String marca, String talla, String color) {
        this.cod = cod;
        this.nom = nom;
        this.pre = pre;
        this.codCateg = codCateg;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public Articulo(String cod, String nom, double pre, int sto, String codCateg, String marca, String talla, String color) {
        this.cod = cod;
        this.nom = nom;
        this.pre = pre;
        this.sto = sto;
        this.codCateg = codCateg;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getSto() {
        return sto;
    }

    public void setSto(int sto) {
        this.sto = sto;
    }

    public String getCodCateg() {
        return codCateg;
    }

    public void setCodCateg(String codCateg) {
        this.codCateg = codCateg;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    
}
