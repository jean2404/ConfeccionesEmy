/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Cliente;

/**
 *
 * @author sagit
 */
public class ClienteDaoImp implements ClienteDao {

    @Override
    public Object[] buscarCliente(String cod) {
        String sql = "select * from cliente where dni='" + cod + "'";
        return Operacion.buscar(sql);
    }

    @Override
    public String grabar(Cliente cli) {
        String sql = "insert into cliente values('" + cli.getDni() + "','" + cli.getNom() + "','" + cli.getDir() + "','" + cli.getTel() + "','" + cli.getCor() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(String dni) {
        String sql = "delete from cliente where dni='" + dni + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        String sql = "select * from cliente";
        List lis = Operacion.listar(sql);
        if (lis != null) {
            return lis;
        }
        return null;
    }

    @Override
    public String actualizar(Cliente cli) {
        String sql = "update cliente set nom='" + cli.getNom() + "' , dir='" + cli.getDir() + "', tel='" + cli.getTel() + "' , cor='" + cli.getCor() + "' where dni='" + cli.getDni() + "'";
        return Operacion.ejecutar(sql);
    }

}
