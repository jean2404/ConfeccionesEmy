package servicio;

import java.util.List;

public interface ClienteServicio {

    public Object[] buscarCliente(String cod);
    public String grabarCliente(String dni, String nom, String dir, String tel, String cor);
    public String eliminarCliente(String dni);
    public List listarCliente();
    public String modificarCliente(String dni, String nom, String dir, String tel, String cor);
}
