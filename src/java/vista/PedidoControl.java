/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.PedidoDao;
import persistencia.PedidoDaoImp;
import servicio.PedidoServicio;
import servicio.PedidoServicioImp;

/**
 *
 * @author sagit
 */
@WebServlet(name = "PedidoControl", urlPatterns = {"/PedidoControl"})
public class PedidoControl extends HttpServlet {

    private PedidoPresentador pedPre;
    private PedidoServicio pedSer;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acc = request.getParameter("acc");

        if (acc.equals("Nuevo Pedido")) {

            pedPre = new PedidoPresentador();
            pedSer = new PedidoServicioImp();
            String cod = request.getParameter("cod");
            Object[] fil = pedSer.nuevoPedido(cod);
            pedPre.setFil(fil);
            request.getSession().setAttribute("pedPre", pedPre);
            response.sendRedirect("PedidoGui.jsp");

        }

        if (acc.equals("Buscar")) {
            String cod = request.getParameter("codCli");
            Object[] fil = pedSer.buscarCliente(cod);
            if (fil != null) {
                pedPre.setFil2(fil);
            } else {
                pedPre.setMsg("No existe el cliente en la BD");
            }
            response.sendRedirect("PedidoGui.jsp");
        }

        if (acc.equals("Mas Articulos")) {
            List lis = pedSer.listarCategoria();
            pedPre.setLis(lis);
            response.sendRedirect("CategoriaListar.jsp");
        }

        if (acc.equals("Ver Articulos")) {
            String cod = request.getParameter("codCateg");
            List lis = pedSer.listarArticulo(cod);
            pedPre.setLis(lis);
            response.sendRedirect("ArticuloListar.jsp");
        }

        if (acc.equals("Agregar Articulo")) {
            String cod = request.getParameter("cod");
            String nom = request.getParameter("nom");
            String pre = request.getParameter("pre");
            String codCateg = request.getParameter("codCateg");
            String mar = request.getParameter("mar");
            String tal = request.getParameter("tal");
            String col = request.getParameter("col");
            String can = request.getParameter("can");
            List lis = pedSer.agregarArticulo(cod, nom, pre, codCateg, mar, tal, col, can);
            pedPre.setLis(lis);
            response.sendRedirect("PedidoGui.jsp");
        }

        if (acc.equals("Quitar")) {
            String cod = request.getParameter("cod");
            List lis = pedSer.quitarArticulo(cod);
            pedPre.setLis(lis);
            response.sendRedirect("PedidoGui.jsp");
        }

        if (acc.equals("Grabar")) {
            String cod = request.getParameter("codCli");
            String msg = pedSer.grabarPedido(cod);
            //==================Aqui grabo mi detalle pedido=================
            if (msg.equals("Pedido Grabado")) {
                List lis = pedPre.getLis();
                String numPed = request.getParameter("numPed");
                for (int i = 0; i < lis.size(); i++) {
                    Object[] f2 = (Object[]) lis.get(i);
                    pedSer.grabarDetallePedido(numPed, f2[0].toString(), f2[7].toString());
                }
            }
            pedPre.setMsg(msg);
            response.sendRedirect("PedidoGui.jsp");
        }

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
