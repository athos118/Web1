/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author RA21605876
 */
public class CadastrandoPessoas extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            Pessoas paciente = new Pessoas();
            
            paciente.setCPF(request.getParameter("CPF"));
            paciente.setPaciente(request.getParameter("Paciente"));
            paciente.setDT(request.getParameter("DT"));
            paciente.setPeso(request.getParameter("Peso"));
            paciente.setAltura(request.getParameter("Altura"));
            
            
            Transaction tx =null;
            
            
            try{
            
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            tx=sessao.beginTransaction();
            
            sessao.save(paciente);
            sessao.flush();
            
            tx.commit();
            sessao.close();
            
            out.println("O cadastro do paciente foi realizado com sucesso");
            
            }
            
            catch(Exception e){
            if(tx !=null){
            tx.rollback();
            }
            e.printStackTrace();
            out.println("Erro ao cadastrar Paciente"+e.getMessage());
            }
            
            
            
            
            
            
            
            
            
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
