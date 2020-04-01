package br.com.caelum.estoque;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLeituraDeObjetos {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("itens.bin"))){
			
			List<ItemEstoque> itens = (List<ItemEstoque>) ois.readObject();
			
			for(ItemEstoque item : itens) {
				System.out.println(item.getCodigo());
				System.out.println(item.getNome());
				System.out.println(item.getQuantidade());
				System.out.println("------------------------");
			}
		}
		
	}

}
