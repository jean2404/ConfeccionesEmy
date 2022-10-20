/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import negocio.Pedido;

/**
 *
 * @author sagit
 */
public interface PedidoDao {
    public String grabar(Pedido ped);
    public Object[]buscarUltimo();
    public String grabarDetalle(String codPed,String codPro,String can);
}
