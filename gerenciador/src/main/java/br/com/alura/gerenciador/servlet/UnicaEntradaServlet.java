package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.EditaEmpresa;
import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.MostraEmpresa;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresa;

@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		
		String nome = null;
		if(paramAcao.equals("listaEmpresas")) {
			System.out.println("Listando empresas");
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.executa(request, response);
		}

		else if(paramAcao.equals("removeEmpresa")) {
			System.out.println("Remove empresas");
			RemoveEmpresa acao = new RemoveEmpresa();
			nome = acao.executa(request, response);
		}
		
		else if(paramAcao.equals("mostraEmpresa")) {
			System.out.println("Mostra empresas");
			MostraEmpresa acao = new MostraEmpresa();
			nome = acao.executa(request, response);
		}

		else if(paramAcao.equals("editaEmpresa")) {
			System.out.println("Edita empresas");
			EditaEmpresa acao = new EditaEmpresa();
			nome = acao.executa(request, response);
		}
		
		else if(paramAcao.equals("novaEmpresa")) {
			System.out.println("Nova empresa");
			NovaEmpresa acao = new NovaEmpresa();
			nome = acao.executa(request, response);
		}
		System.out.println(nome);
		
		String [] tipoEEndereco = nome.split(":");
		if(tipoEEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(tipoEEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEEndereco[1]);
		}

		
	}
	
	
	

}
