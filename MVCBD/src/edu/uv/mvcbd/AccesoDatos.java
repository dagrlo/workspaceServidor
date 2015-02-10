package edu.uv.mvcbd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoDatos {

		private ArrayList<Libro> libros;
		
		public AccesoDatos(Connection c){
			libros=new ArrayList<Libro>();
			
			try{
				Statement st=c.createStatement();
				ResultSet rs=st.executeQuery("select TITLE_ID, TITLE, PRICE from titles");
				rs.beforeFirst();
				while (rs.next()){
					libros.add(new Libro(rs.getString(1),rs.getString(2),rs.getDouble(3)));
				}
				rs.close();
				st.close();
			}catch (Exception e){
				
			}
		}
		
		public ArrayList<Libro> getLibros(){
			return libros;
		}
		
}
