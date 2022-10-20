package servicio;

import java.util.List;
import negocio.Cliente;
import persistencia.ClienteDao;
import persistencia.ClienteDaoImp;

public class ClienteServicioImp implements ClienteServicio {

    @Override
    public Object[] buscarCliente(String cod) {
        ClienteDao cliDao = new ClienteDaoImp();
        return cliDao.buscarCliente(cod);
    }

    @Override
    public String grabarCliente(String dni, String nom, String dir, String tel, String cor) {
        Cliente cli = new Cliente(dni, nom, dir, tel, cor);
        ClienteDao cliDao = new ClienteDaoImp();
        String msg = cliDao.grabar(cli);
        if (msg == null) {
            msg = "Cliente Registrado";
        }
        return msg;
    }

    @Override
    public String eliminarCliente(String dni) {
        ClienteDao cliDao = new ClienteDaoImp();
        String msg = cliDao.eliminar(dni);
        if (msg == null) {
            msg = "Cliente eliminado";
        }
        return msg;
    }

    @Override
    public List listarCliente() {
        ClienteDao cliDao = new ClienteDaoImp();
        return cliDao.listar();
    }

    @Override
    public String modificarCliente(String dni, String nom, String dir, String tel, String cor) {
        Cliente cli = new Cliente(dni, nom, dir, tel, cor);
        ClienteDao cliDao = new ClienteDaoImp();
        String msg = cliDao.actualizar(cli);
        if (msg == null) {
            msg = "Cliente Modificado";
        }
        return msg;
    }

}
