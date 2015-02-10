package uv.eco;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Eco
 */
@WebServlet("/RespuestaEco")
public class Eco extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eco() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Como no sabemos cuantos campos de hdr hay primero pillamos todos sus nombres
		Enumeration<String> headerNames=request.getHeaderNames();
		//Ahora el nombre de los parametros de la url-->  url?p1=v1&pn=vn
		Enumeration<String> paramNames=request.getParameterNames();
		
		//Hacemos un flujo de salida. Hay que generar la salida completa
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<head><title>Eco</title></head>");
		pw.println("<body>");
		
		pw.println("<h1>Campos de cabecera</h1>");
		
		while (headerNames.hasMoreElements()){
			String name=headerNames.nextElement();
			String valor=request.getHeader(name);
			pw.println(name+": "+valor+"<br>");
		}
		
		pw.println("<h1>Parametros de peticion</h1>");
		
		while (paramNames.hasMoreElements()){
			String name=paramNames.nextElement();
			String valor=request.getParameter(name);
			pw.println(name+": "+valor+"<br>");
		}
		
		pw.println("</body></html>");
		
		pw.flush();
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}