/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import persistencia.ClienteDao;
import persistencia.ClienteDaoImp;
import servicio.ClienteServicio;
import servicio.ClienteServicioImp;

/**
 *
 * @author sagit
 */
@WebServlet(name = "ClienteControl", urlPatterns = {"/ClienteControl"})
public class ClienteControl extends HttpServlet {

    ClientePresentador cliPre;
    ClienteServicio cliSer;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc = request.getParameter("acc");

        if (acc.equals("Gestionar Cliente")) {
            cliPre = new ClientePresentador();
            cliSer = new ClienteServicioImp();
            request.getSession().setAttribute("cliPre", cliPre);
        }

        if (acc.equals("Buscar")) {
            String cod = request.getParameter("dni");
            Object[] fil = cliSer.buscarCliente(cod);
            if (fil != null) {
                cliPre.setFil(fil);
            } else {
                cliPre.setMsg("No existe el Cliente");
            }
        }

        if (acc.equals("Grabar")) {
            String dni = request.getParameter("dni");
            String nom = request.getParameter("nom");
            String dir = request.getParameter("dir");
            String tel = request.getParameter("tel");
            String cor = request.getParameter("cor");
            cliPre.setMsg(cliSer.grabarCliente(dni, nom, dir, tel, cor));
        }
        
        if (acc.equals("Modificar")) {
            String dni = request.getParameter("dni");
            String nom = request.getParameter("nom");
            String dir = request.getParameter("dir");
            String tel = request.getParameter("tel");
            String cor = request.getParameter("cor");
            cliPre.setMsg(cliSer.modificarCliente(dni, nom, dir, tel, cor));
        }

        if (acc.equals("Limpiar")) {
            cliPre.setMsg("");
            Object[] fil = {"", "", "", "", ""};
            cliPre.setFil(fil);
            List lis = new ArrayList();
            lis.add(fil);
            cliPre.setLis(lis);
        }

        if (acc.equals("Eliminar")) {
            String dni = request.getParameter("dni");
            cliPre.setMsg(cliSer.eliminarCliente(dni));
        }

        if (acc.equals("Listar")) {
            cliPre.setLis(cliSer.listarCliente());
        }

        response.sendRedirect("ClienteGui.jsp");

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
