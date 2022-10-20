/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import negocio.Empleado;

/**
 *
 * @author sagit
 */
public class EmpleadoDaoImp implements EmpleadoDao {

    @Override
    public String grabar(Empleado emp) {
        String sql = "insert into empleado values('" + emp.getCod() + "','" + emp.getNom() + "','" + emp.getDir() + "','"+ emp.getTip() + "','" + emp.getUsu() + "','" + emp.getPas() + "')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String actualizar(Empleado emp) {
        String sql = "update empleado set nom='"+emp.getNom()+"', dir='"+emp.getDir()+"', tip='" + emp.getTip() + "' , usu='" + emp.getUsu()+ "' , pas='" + emp.getPas() + "' where codEmp='" + emp.getCod() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(Empleado emp) {
        String sql = "delete from empleado where codEmp='" + emp.getCod() + "'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Empleado buscar(String cod) {
        String sql = "select * from empleado where codEmp='" + cod + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Empleado emp = new Empleado();
            emp.setCod(fil[0].toString());
            emp.setNom(fil[1].toString());
            emp.setDir(fil[2].toString());
            emp.setTip(fil[3].toString());
            emp.setUsu(fil[4].toString());
            emp.setPas(fil[5].toString());
            return emp;
        }
        return null;
    }

    @Override
    public List listar() {
        String sql = "select * from empleado";
        List lis = Operacion.listar(sql);
        if (lis != null) {
            return lis;
        }
        return null;
    }

    @Override
    public Empleado validar(String usu, String pas) {
        String sql = "select * from empleado where usu like '" + usu + "' and pas like '" + pas + "'";
        Object[] fil = Operacion.buscar(sql);
        if (fil != null) {
            Empleado emp = new Empleado();
            emp.setCod(fil[0].toString());
            emp.setNom(fil[1].toString());
            emp.setDir(fil[2].toString());
            emp.setTip(fil[3].toString());
            emp.setUsu(fil[4].toString());
            emp.setPas(fil[5].toString());
            return emp;
        }
        return null;
    }
    
    public static void main(String[] args) {
        EmpleadoDao ed = new EmpleadoDaoImp();
        Empleado e = ed.buscar("E003");
        System.out.println(e.getNom());
    }

}
