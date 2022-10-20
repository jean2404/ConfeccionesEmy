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
public interface EmpleadoServicio {

    public String grabar(String cod, String nom, String dir, String tip, String usu, String pas);

    public Object[] validar(String usu, String pas);

    public Object[] buscar(String cod);

    public List listar();
    
    public String modificar(String cod, String nom, String dir, String tip, String usu, String pas);
}
