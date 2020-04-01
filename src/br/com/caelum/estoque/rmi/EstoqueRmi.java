package br.com.caelum.estoque.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.caelum.estoque.ItemEstoque;

public interface EstoqueRmi extends Remote{

	public ItemEstoque getItemEstoque(String codigoProduto) throws RemoteException; 
	
}
