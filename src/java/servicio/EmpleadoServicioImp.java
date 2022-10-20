/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Empleado;
import persistencia.*;

/**
 *
 * @author sagit
 */
public class EmpleadoServicioImp implements EmpleadoServicio {

    @Override
    public String grabar(String cod, String nom, String dir, String tip, String usu, String pas) {
        Empleado emp = new Empleado(cod, nom, dir, tip, usu, pas);
        EmpleadoDao empDao = new EmpleadoDaoImp();
        String msg = empDao.grabar(emp);
        if (msg == null) {
            msg = "Empleado Registrado";
        }
        return msg;
    }

    @Override
    public Object[] validar(String usu, String pas) {
        EmpleadoDao empDao = new EmpleadoDaoImp();
        Empleado emp = empDao.validar(usu, pas);
        if (emp != null) {
            Object[] fil = new Object[2];
            fil[0] = emp.getCod();
            fil[1] = emp.getNom();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String cod) {
        Empleado emp = new EmpleadoDaoImp().buscar(cod);
        if (emp != null) {
            Object[] f = new Object[6];
            f[0] = emp.getCod();
            f[1] = emp.getNom();
            f[2] = emp.getDir();
            f[3] = emp.getTip();
            f[4] = emp.getUsu();
            f[5] = emp.getPas();
            return f;
        }
        return null;
    }

    @Override
    public List listar() {
        return new EmpleadoDaoImp().listar();
    }

    public static void main(String[] args) {
        EmpleadoServicio es = new EmpleadoServicioImp();
        Object[] f = es.buscar("E003");
        System.out.println(f[1]);
    }

    @Override
    public String modificar(String cod, String nom, String dir, String tip, String usu, String pas) {

        Empleado emp = new Empleado(cod, nom, dir, tip, usu, pas);
        EmpleadoDao empDao = new EmpleadoDaoImp();
        String msg = empDao.actualizar(emp);
        if (msg == null) {
            msg = "Datos modificados con exito";
        }
        return msg;
    }

}
