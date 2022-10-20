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
public interface ArticuloDao {

    public List listar();

    public List listar(String cod);

    public Object[] buscarProducto(String codPro);

    public String grabarArticulo(Articulo art);

    public String actualizarArticulo(Articulo art);
    
    public String eliminarArticulo(String codPro);
}
