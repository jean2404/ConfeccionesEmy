/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import negocio.Empleado;
import persistencia.EmpleadoDao;
import persistencia.EmpleadoDaoImp;
import servicio.EmpleadoServicio;
import servicio.EmpleadoServicioImp;

/**
 *
 * @author sagit
 */
@WebServlet(name = "PerfilControl", urlPatterns = {"/PerfilControl"})
public class PerfilControl extends HttpServlet {

    PerfilPresentador perfilPre;
    EmpleadoServicio empSer;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String acc = request.getParameter("acc");

        if (acc.equals("Gestionar Perfil")) {
            perfilPre= new PerfilPresentador();
            empSer= new EmpleadoServicioImp();
            String cod = request.getParameter("cod");
            Object[]f= empSer.buscar(cod);
            perfilPre.setFil(f);
            request.getSession().setAttribute("perfilPre", perfilPre);
            response.sendRedirect("PerfilEmpleado.jsp");

        }
        
        if (acc.equals("Modificar")) {
            String cod = request.getParameter("cod");
            String nom = request.getParameter("nom");
            String dir = request.getParameter("dir");
            String tip = request.getParameter("tip");
            String usu = request.getParameter("usu");
            String pas = request.getParameter("pas");
            Empleado emp = new Empleado(cod, nom, dir, tip, usu, pas);
            String msg=empSer.modificar(cod, nom, dir, tip, usu, pas);
            Object[]f= empSer.buscar(cod);
            perfilPre.setFil(f);
            perfilPre.setMsg(msg);
            request.getSession().setAttribute("perfilPre", perfilPre);
            response.sendRedirect("PerfilEmpleado.jsp");

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
