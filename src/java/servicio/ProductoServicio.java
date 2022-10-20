/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;

/**
 *
 * @author sagit
 */
public interface ProductoServicio {

    public Object[] buscarProducto(String codPro);

    public String grabarProducto(String codPro, String nom, String pre, String sto, String codCateg, String mar, String tal, String col);

    public String modificarProducto(String codPro, String nom, String pre, String sto, String codCateg, String mar, String tal, String col);

    public String eliminarProducto(String codPro);

    public List listarProducto();
}
