package edu.uv.dawts.tienda;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OyenteSesion
 *
 */
@WebListener
public class OyenteSesion implements HttpSessionListener {
	
	public static final String CARRO="comprado";

    /**
     * Default constructor. 
     */
    public OyenteSesion() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
         CarroCompra<CD> carro=new CarroCompra<CD>();
         //asigna sesion
         arg0.getSession().setAttribute(OyenteSesion.CARRO, carro);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
         
    	arg0.getSession().removeAttribute(OyenteSesion.CARRO);
    }
	
}
