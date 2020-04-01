package br.com.caelum.estoque;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws IOException {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("itens.bin"))){
			ItemEstoque item1 = new ItemEstoque("ARQ","Arquivo", 2);
			ItemEstoque item2 = new ItemEstoque("SOA","Java SOA", 3);
			
			List<ItemEstoque> itens = new ArrayList<>();
			
			itens.addAll(Arrays.asList(item1, item2));
			
			oos.writeObject(itens);
		}

	}

}
