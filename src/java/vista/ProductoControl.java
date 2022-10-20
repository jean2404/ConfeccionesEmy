package vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import servicio.ProductoServicio;
import servicio.ProductoServicioImp;

/**
 *
 * @author sagit
 */
@WebServlet(name = "ProductoControl", urlPatterns = {"/ProductoControl"})
public class ProductoControl extends HttpServlet {

    ProductoPresentador pp;
    ProductoServicio proSer;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc = request.getParameter("acc");

        if (acc.equals("Gestionar Productos")) {
            pp = new ProductoPresentador();
            proSer = new ProductoServicioImp();
            request.getSession().setAttribute("pp", pp);
        }

        if (acc.equals("Buscar")) {
            String cod = request.getParameter("codPro");
            Object[] fil = proSer.buscarProducto(cod);
            if (fil != null) {
                pp.setFil(fil);
            } else {
                pp.setMsg("No existe el Producto");
            }
        }

        if (acc.equals("Limpiar")) {
            pp.setMsg("");
            Object[] fil = {"", "", "", "", "", "", "", ""};
            pp.setFil(fil);
            List lis = new ArrayList();
            lis.add(fil);
            pp.setLis(lis);
        }

        if (acc.equals("Grabar")) {
            String codPro = request.getParameter("codPro");
            String nom = request.getParameter("nom");
            String pre = request.getParameter("pre");
            String sto = request.getParameter("sto");
            String codCateg = request.getParameter("codCateg");
            String mar = request.getParameter("mar");
            String tal = request.getParameter("tal");
            String col = request.getParameter("col");
            pp.setMsg(proSer.grabarProducto(codPro, nom, pre, sto, codCateg, mar, tal, col));
        }

        if (acc.equals("Modificar")) {
            String codPro = request.getParameter("codPro");
            String nom = request.getParameter("nom");
            String pre = request.getParameter("pre");
            String sto = request.getParameter("sto");
            String codCateg = request.getParameter("codCateg");
            String mar = request.getParameter("mar");
            String tal = request.getParameter("tal");
            String col = request.getParameter("col");
            pp.setMsg(proSer.modificarProducto(codPro, nom, pre, sto, codCateg, mar, tal, col));
        }

        if (acc.equals("Eliminar")) {
            String codPro = request.getParameter("codPro");
            pp.setMsg(proSer.eliminarProducto(codPro));
        }

        if (acc.equals("Listar")) {
            pp.setLis(proSer.listarProducto());
        }

        response.sendRedirect("ProductoGui.jsp");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
