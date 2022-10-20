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
public interface PedidoServicio {

    public Object[] nuevoPedido(String cod);

    public List agregarArticulo(String cod, String nom, String pre, String codCateg, String mar, String tal, String col, String can);

    public List quitarArticulo(String cod);

    public List listarArticulo(String codCateg);
    public List listarCategoria();

    public Object[] buscarCliente(String cod);

    public String grabarPedido(String cod);
    public String grabarDetallePedido(String codPed,String codPro,String can);
}
