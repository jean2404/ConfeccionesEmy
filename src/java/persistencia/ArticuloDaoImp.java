/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Articulo;

/**
 *
 * @author sagit
 */
public class ArticuloDaoImp implements ArticuloDao {

    @Override
    public List listar() {
        return Operacion.listar("select * from producto");
    }

    @Override
    public List listar(String cod) {
        return Operacion.listar("select * from producto where codCateg='" + cod + "'");
    }

    @Override
    public Object[] buscarProducto(String codPro) {
        String sql = "select * from producto where codPro='" + codPro + "'";
        return Operacion.buscar(sql);
    }

    @Override
    public String grabarArticulo(Articulo art) {
        String sql = "insert into producto values('" + art.getCod() + "','" + art.getNom() + "'," + art.getPre() + ","
                + art.getSto() + ",'" + art.getCodCateg() + "','" + art.getMarca() + "','" + art.getTalla() + "','" + art.getColor() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizarArticulo(Articulo art) {
        String sql = "update producto set nom='" + art.getNom() + "' , pre=" + art.getPre() + ", sto=" + art.getSto()
                + " , codCateg='" + art.getCodCateg() + "', marca='" + art.getMarca() + "', talla='" + art.getTalla() + "', color='" + art.getColor() + "' where codPro='" + art.getCod() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminarArticulo(String codPro) {
        String sql = "delete from producto where codPro='" + codPro + "'";
        return Operacion.ejecutar(sql);
    }

}
