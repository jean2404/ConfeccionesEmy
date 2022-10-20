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
public class LineaPedido {

    private Articulo art;
    int can;

    public double getImp() {
        double imp = 0;
        imp = art.getPre() * can;
        return imp;
    }

    public LineaPedido() {
    }

    public LineaPedido(Articulo art, int can) {
        this.art = art;
        this.can = can;
    }

    public Articulo getArt() {
        return art;
    }

    public void setArt(Articulo art) {
        this.art = art;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
    
    
}
