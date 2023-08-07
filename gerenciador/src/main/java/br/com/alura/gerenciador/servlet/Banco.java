package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	
	
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(Banco.chaveSequencial++);
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(Banco.chaveSequencial++);
		lista.add(empresa);
		lista.add(empresa2);
	}

	public void adiciona(Empresa empresa) {
		Banco.lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
	public void removeEmpresa(Integer id) {
	    lista = lista.stream()
	        .filter(emp -> !emp.getId().equals(id))
	        .collect(Collectors.toList());
	}


}
