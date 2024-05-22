package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({"/provincie"})
public class Provincia extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		req.getRequestDispatcher("header.jsp").include(req, resp);
		req.getRequestDispatcher("provincie.jsp").include(req, resp);
		req.getRequestDispatcher("footer.jsp").include(req, resp);
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		if (req.getParameter("regione") != null) {

			String regione = req.getParameter("regione");

			System.out.println("La regione selezionata è " + regione);
			
		}
	}
}
