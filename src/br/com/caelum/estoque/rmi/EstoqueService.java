package br.com.caelum.estoque.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

import br.com.caelum.estoque.ItemEstoque;

public class EstoqueService extends UnicastRemoteObject implements EstoqueRmi {


	private static final long serialVersionUID = 1L;
	
	private Map<String, ItemEstoque> repositorio = new HashMap<>();  

	public EstoqueService() throws RemoteException {
		repositorio.put("ARQ", new ItemEstoque("ARQ", "Arquivo", 5));
		repositorio.put("SOA", new ItemEstoque("SOA", "Arquivo", 2));
		repositorio.put("TDD", new ItemEstoque("TDD", "Arquivo", 3));
		repositorio.put("RES", new ItemEstoque("RES", "Arquivo", 4));
		repositorio.put("LOG", new ItemEstoque("LOG", "Arquivo", 3));
		repositorio.put("WEB", new ItemEstoque("WEB", "Arquivo", 4));
		
	}	
	
	@Override
	public ItemEstoque getItemEstoque(String codigoProduto) throws RemoteException {
		// TODO Auto-generated method stub
		
		System.out.println("Verificando estoque do produto " + codigoProduto);
				
		return this.repositorio.get(codigoProduto);
	}
	
}
