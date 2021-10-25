package RegistroUsuario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class V247_RegistroUsuario
 */
@WebServlet("/V247_RegistroUsuario")
public class V247_RegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public V247_RegistroUsuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nombre = request.getParameter("nombre");

		String apellido = request.getParameter("apellido");

		PrintWriter salidaget = response.getWriter();

		salidaget.println("<html><body>");

		salidaget.println("<h1>USUARIO CON GET</h1> <br>");

		salidaget.println("Usuario: " + nombre.toUpperCase() + "<br>");

		salidaget.println("Apellido: " + apellido.toUpperCase() + "<br>");

		salidaget.println("");

		salidaget.println("</html></body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request, response);
		
		

		response.setContentType("text/html");

		PrintWriter salidapost = response.getWriter();

		String nombre = request.getParameter("nombre");

		String apellido = request.getParameter("apellido");

		PrintWriter salidaget = response.getWriter();

		salidapost.println("<html><body>");

		salidapost.println("<h1>USUARIO CON POST</h1> <br>");

		salidapost.println("Usuario: " + nombre.toUpperCase() + "<br>");

		salidapost.println("Apellido: " + apellido.toUpperCase() + "<br>");

		salidapost.println("");

		salidapost.println("</html></body>");

	}

}
