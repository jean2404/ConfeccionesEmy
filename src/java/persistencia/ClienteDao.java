package persistencia;

import java.util.List;
import negocio.Cliente;

public interface ClienteDao {

    public Object[] buscarCliente(String cod); //otra forma de buscar al cliente

    public String grabar(Cliente cli);

    public String eliminar(String dni);

    public List listar();

    public String actualizar(Cliente cli);
}
