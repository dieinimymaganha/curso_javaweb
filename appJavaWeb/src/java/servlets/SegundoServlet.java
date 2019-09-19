/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dieinimy
 */
@WebServlet(name = "SegundoServlet", urlPatterns = {"/SegundoServlet"})
public class SegundoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SegundoServlet</title>");
            out.println("</head>");
            out.println("<body>");

            out.println("Nome do servelt .............................:" + request.getContextPath() + "<br/>");
            out.println("Nome da maquina local........................:" + request.getLocalName()+ "<br/>");
            out.println("Endereço da máquina local ...................:" + request.getLocalAddr()+ "<br/>");
            out.println("Porta da máquina local.......................:" + request.getLocalPort()+ "<br/>");
            out.println("Endereço servidor............................:" + request.getRemoteHost()+ "<br/>");
            out.println("Porta do servidor............................:" + request.getRemotePort()+ "<br/>");
            out.println("Metodo da requisição.........................:" + request.getMethod()+ "<br/>");
            out.println("Protocolo utilizadoo.........................:" + request.getProtocol()+ "<br/>");

            out.println("</body>");
            out.println("</html>");
        }

    }
    
}
