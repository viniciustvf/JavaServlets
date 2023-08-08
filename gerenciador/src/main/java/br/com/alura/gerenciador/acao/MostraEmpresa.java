package br.com.alura.gerenciador.acao;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.model.Banco;
import br.com.alura.gerenciador.model.Empresa;

public class MostraEmpresa {

	public void executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String paramId = request.getParameter("id");
		Integer id = Integer.parseInt(paramId);
		
		Banco banco = new Banco();
		
		Empresa emp = banco.findById(id);
		
		request.setAttribute("empresa", emp);
		RequestDispatcher rd = request.getRequestDispatcher("/formAlteraEmpresa.jsp");
		rd.forward(request, response);
		
	}
}
