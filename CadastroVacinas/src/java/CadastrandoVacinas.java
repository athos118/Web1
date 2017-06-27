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
public class CadastrandoVacinas extends HttpServlet {

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
           
            
            Vacinas vacina = new Vacinas();
            
            vacina.setCodigoVacina(request.getParameter("CodigoVacina"));
            vacina.setVacina(request.getParameter("Vacina"));
            vacina.setDose(request.getParameter("Dose"));
            vacina.setIdade(request.getParameter("Idade"));
            vacina.setPesoMinimo(request.getParameter("PesoMinimo"));
            
            Transaction tx =null;
            
            try{
            Session sessao = HibernateUtil.getSessionFactory().openSession();
            tx=sessao.beginTransaction();
            
            sessao.save(vacina);
            sessao.flush();
            
            tx.commit();
         
            
            sessao.close();
            
            out.println("O cadastro da vacina foi realizado com sucesso");
            out.println("<br/>Nome da Vacina: "+vacina.getVacina());
            out.println("<br/>Dose da Vacina: "+vacina.getDose());
            out.println("<br/> Idade Minima para Administração: "+vacina.getIdade());
            out.println("<br/> Peso Minimo para Administração: "+vacina.getPesoMinimo());
            out.println("<br/>");
            out.println("<br/> Peso Minimo para Administração: "+vacina.getPesoMinimo());
            out.println(" <a href=\"CadastroDeVacinas.html\"><button>Cadastrar Nova Vacina</button></a>");
            out.println(" <a href=\"Home.html\"><button>Voltar para tela inicial</button></a>");
      
            
           
            }
            
            
            
                catch(Exception e){
               if(tx!=null){
               tx.rollback();
               }
               e.printStackTrace();
               out.println("Erro ao cadastro Professor: "+e.getMessage());
               
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
