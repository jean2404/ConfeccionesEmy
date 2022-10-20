package servicio;

import java.util.List;
import negocio.Articulo;
import persistencia.ArticuloDao;
import persistencia.ArticuloDaoImp;

public class ProductoServicioImp implements ProductoServicio {

    @Override
    public Object[] buscarProducto(String codPro) {
        ArticuloDao artDao = new ArticuloDaoImp();
        return artDao.buscarProducto(codPro);
    }

    @Override
    public String grabarProducto(String codPro, String nom, String pre, String sto, String codCateg, String mar, String tal, String col) {
        Articulo art = new Articulo(codPro, nom, Double.parseDouble(pre), Integer.parseInt(sto), codCateg, mar, tal, col);
        ArticuloDao artDao = new ArticuloDaoImp();
        String msg = artDao.grabarArticulo(art);
        if (msg == null) {
            msg = "Producto Registrado";
        }
        return msg;
    }

    @Override
    public String modificarProducto(String codPro, String nom, String pre, String sto, String codCateg, String mar, String tal, String col) {
        Articulo art = new Articulo(codPro, nom, Double.parseDouble(pre), Integer.parseInt(sto), codCateg, mar, tal, col);
        ArticuloDao artDao = new ArticuloDaoImp();
        String msg = artDao.actualizarArticulo(art);
        if (msg == null) {
            msg = "Producto Modificado";
        }
        return msg;
    }

    @Override
    public String eliminarProducto(String codPro) {
        ArticuloDao artDao = new ArticuloDaoImp();
        String msg = artDao.eliminarArticulo(codPro);
        if (msg == null) {
            msg = "Producto eliminado";
        }
        return msg;
    }

    @Override
    public List listarProducto() {
        ArticuloDao artDao = new ArticuloDaoImp();
        return artDao.listar();
    }

}
