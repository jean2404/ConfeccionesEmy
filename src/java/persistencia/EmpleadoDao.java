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
public interface EmpleadoDao {

    public String grabar(Empleado emp);

    public String actualizar(Empleado emp);

    public String eliminar(Empleado emp);

    public Empleado buscar(String cod);

    public List listar();

    public Empleado validar(String usu, String pas);
}
