package com.example.db;

import java.io.IOException;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.val;

//@WebServlet(name = "DataExample", urlPatterns = {"/DataExample"})
public class DataExample extends HttpServlet {

//  @SneakyThrows
//  protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
//    response.setContentType("text/html;charset=UTF-8");
//
//    @Cleanup val out = response.getWriter();
//
//    /* TODO output your page here. You may use following sample code. */
//    out.println("<!DOCTYPE html>");
//    out.println("<html>");
//    out.println("<head>");
//    out.println("<title>Servlet DataExample</title>");
//    out.println("</head>");
//    out.println("<body>");
//    out.println("<h1>Servlet DataExample at " + request.getContextPath() + "</h1>");
//    out.println(queryDatabase());
//    out.println("</body>");
//    out.println("</html>");
//  }
//
//  @SneakyThrows
//  public String queryDatabase() {
//
//    String outStr = "";
//
//    @Cleanup val con = DriverManager.getConnection(
//        "jdbc:derby://localhost:1527/LoginDb",
//        "oracle",
//        "oracle"
//    );
//    @Cleanup val stmt = con.prepareStatement("select * from users");
//    @Cleanup val rs = stmt.executeQuery();
//    int rowNum = 1;
//    while (rs.next()) {
//      outStr += "=== Row " + rowNum++ + " ===<br/>";
//      outStr += "User Id : " + rs.getInt(1) + "<br/>";
//      outStr += "Full name: " + rs.getString(2) + "<br/>";
//      outStr += "Email: " + rs.getString(3) + "<br/>";
//      outStr += "Password: " + rs.getString(4) + "<br/>";
//      outStr += "Last Login Date: " + rs.getDate(5) + "<br/>";
//      outStr += "<hr/>";
//    }
//    return outStr;
//  }
//
//   <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

//  /**
//   * Handles the HTTP <code>GET</code> method.
//   *
//   * @param request  servlet request
//   * @param response servlet response
//   * @throws ServletException if a servlet-specific error occurs
//   * @throws IOException      if an I/O error occurs
//   */
//  @Override
//  protected void doGet(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, IOException {
//    processRequest(request, response);
//  }
//
//  /**
//   * Handles the HTTP <code>POST</code> method.
//   *
//   * @param request  servlet request
//   * @param response servlet response
//   * @throws ServletException if a servlet-specific error occurs
//   * @throws IOException      if an I/O error occurs
//   */
//  @Override
//  protected void doPost(HttpServletRequest request, HttpServletResponse response)
//      throws ServletException, IOException {
//    processRequest(request, response);
//  }
//
//  /**
//   * Returns a short description of the servlet.
//   *
//   * @return a String containing servlet description
//   */
//  @Override
//  public String getServletInfo() {
//    return "Short description";
//  }// </editor-fold>
}
