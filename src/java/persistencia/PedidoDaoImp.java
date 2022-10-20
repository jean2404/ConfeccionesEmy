/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import negocio.Articulo;
import negocio.Cliente;
import negocio.Empleado;
import negocio.Pedido;

/**
 *
 * @author sagit
 */
public class PedidoDaoImp implements PedidoDao {

    @Override
    public String grabar(Pedido ped) {

        String sql = "insert into pedido values('" + ped.getNum() + "','" + ped.getFec() + "'," + ped.getTot() + ",'" + ped.getCli().getDni() + "','" + ped.getEmp().getCod() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Object[] buscarUltimo() {
        String sql = "SELECT * FROM pedido ORDER BY numPed DESC LIMIT 0, 1";
        return Operacion.buscar(sql);
    }

    public String getNum(String c) {
        /*
        char[] c_div = c.toCharArray();
        String n = "";
        for (int i = 0; i < c_div.length; i++) {
            if (Character.isDigit(c_div[i])) {
                n += c_div[i];
            }
        }
        
        return n;
         */
        int n;
        if (c == null || c.equals("")) {
            n = 111111;
        } else {
            n = Integer.parseInt(c) + 1;
        }
        return String.valueOf(n);
    }

    @Override
    public String grabarDetalle(String codPed, String codPro, String can) {
        String sql = "insert into detallepedido values('" + codPed + "','" + codPro + "','" + can + "')";
        return Operacion.ejecutar(sql);
    }
}
