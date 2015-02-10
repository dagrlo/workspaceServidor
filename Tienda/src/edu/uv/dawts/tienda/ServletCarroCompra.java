package edu.uv.dawts.tienda;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletCarroCompra
 */
@WebServlet("/CarroCompra")
public class ServletCarroCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<CD> listaProductos;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletCarroCompra() {
        super();
        listaProductos=new ArrayList<CD>();
        listaProductos.add(new CD(20,"CD1",0));
        listaProductos.add(new CD(15,"cd2",1));
        listaProductos.add(new CD(10,"cd3",2));
        listaProductos.add(new CD(12,"cd4",3));
        listaProductos.add(new CD(15,"cd5",4));        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// suponemos que me pasan una serie de parametros
		CarroCompra<CD> carro=(CarroCompra<CD>) request.getSession().getAttribute(OyenteSesion.CARRO);
		//obtenemos el param de la peticion
		String accion=request.getParameter("accion");
		if (accion!=null)
			if (accion.equals("comprar")){
				String ident=request.getParameter("id");
				if (ident!=null){
					int id=Integer.parseInt(ident);
					log("Item comprado: "+id);
					carro.add(listaProductos.get(id));
				}								
			}
		//lama al jsp y que incluya la salida generada
		
		PrintWriter pw=response.getWriter();
		pw.println("<html>");
		pw.println("<body>");
		
		getServletContext().getRequestDispatcher("/items.jsp").include(request,response);
		
		pw.println("<br/>El total de la compra es:");
		pw.println(carro.getTotalCarro());
		pw.println("</body>");
		pw.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
