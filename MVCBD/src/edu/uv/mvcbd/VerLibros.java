package edu.uv.mvcbd;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class VerLibros
 */
@WebServlet("/VerLibros")
public class VerLibros extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Resource(name="jdbc/librospool")
	private DataSource ds;
	
	private AccesoDatos ad;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerLibros() {
        super();
        // TODO Auto-generated constructor stub
    }

    // cuando hay contruido la instancia de objeto y ha hecho la inyeccion de independencias, ejecuta esto
    // ds no funciona en verlibros porque la inyeccion no ha finalizado
    @PostConstruct
    public void inicia() throws SQLException{
    	Connection c=ds.getConnection();
    	ad=new AccesoDatos(c);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Libro> libros=ad.getLibros();
		request.setAttribute("libros", libros);
		
		getServletContext().getRequestDispatcher("/mostrarlibros.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
