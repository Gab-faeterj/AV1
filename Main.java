package br.com.faeterj;
import java.util.Scanner;
import br.com.faeterj.produto;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<produto> lproduto = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		int resposta = 0;
		
		while (resposta != 6) {
		
		System.out.println("selecione uma opção");
		System.out.println("[1] adicionar item");
		System.out.println("[2] alterar produto");
		System.out.println("[3] excluir produto");
		System.out.println("[4] listar todos os produtos");
		System.out.println("[5] listar um produto");
		System.out.println("[6] finalizar programa");
		
		resposta = sc.nextInt();
		
		if (resposta == 1) {
			
			produto P = new produto();
			
			
			P.id = lproduto.size();
			
			System.out.println("insira o código de barra do produto: ");
			P.codigo_de_barras = sc.nextLong();
			
			System.out.println("insira o sku do produto: ");
			P.sku =  sc.next();
			
			System.out.println("insira o nome do produto: ");
			P.nome = sc.next();
			
			System.out.println("insira a descrição do produto: ");
			P.descricao = sc.next();
			
			System.out.println("insira a categoria do produto: ");
			P.categoria = sc.next();
			
			System.out.println("insira o preço do produto: ");
			P.preço = sc.nextFloat();
			
			System.out.println("insira o peso do produto: ");
			P.peso = sc.nextFloat();
			
			System.out.println("insira o fabricante do produto: ");
			P.fabricante =sc.next();
			
			lproduto.add(P);
			
		}
		
		if (resposta == 2) {
			
			System.out.println("insira o id do produto: ");
			
			int id = sc.nextInt();
			
			produto Pa = lproduto.get(id); 
			
			int fim = 1;
			
			while (fim == 1) {
			
			System.out.println("qual area prefere alterar?");
			
			System.out.println("[1] codigo de barras");
			System.out.println("[2] sku");
			System.out.println("[3] nome");
			System.out.println("[4] descrição");
			System.out.println("[5] categoria");
			System.out.println("[6] preço");
			System.out.println("[7] peso");
			System.out.println("[8] fabricante");
			
			int rep = sc.nextInt();
			
			if (rep == 1) {
				
				System.out.println("insira o novo código de barras: ");
				
				Pa.codigo_de_barras = sc.nextLong();
				
				
			}
			
            if (rep == 2) {
				
                System.out.println("insira o novo sku: ");
				
				Pa.sku = sc.next();
				
				
			}
            
            if (rep == 3) {
				
                System.out.println("insira o novo nome: ");
				
				Pa.nome = sc.next();
				
				
			}
			
            if (rep == 4) {
				
                System.out.println("insira a nova descrição: ");
				
				Pa.descricao = sc.next();
				
				
			}
            
            if (rep == 5) {
				
                System.out.println("insira a nova categoria ");
				
				Pa.categoria = sc.next();
				
            	
			}
            
            if (rep == 6) {
				
                System.out.println("insira o novo preço: ");
				
				Pa.preço = sc.nextFloat();
				
            	
			}
            
            if (rep == 7) {
				
                System.out.println("insira o novo peso: ");
				
				Pa.peso = sc.nextFloat();
				
            	
			}
            
            if (rep == 8) {
				
                System.out.println("insira o novo fabricante: ");
				
				Pa.fabricante = sc.next();
				
            	
			}
            
            System.out.println("sair ou alterar outro atributo?");
            System.out.println("[1] alterar");
            System.out.println("[2] sair");
            
            fim = sc.nextInt();
            
            
			}
    
			
			}
		
		if (resposta == 3) {
			
			 System.out.println("insira o id do produto: ");
			 int rep = sc.nextInt();
			 int fim = 0;
			 
			 for (int i = 0; i < lproduto.size() && fim == 0; i++) {
				 
				produto Pd = lproduto.get(i);
				
				if (Pd.id == rep) {
					
					fim = 1;
					
				}
				
				if (i < lproduto.size()) {
					
					System.out.println("produto deletado com sucesso");
					
				}else {
					
					System.out.println("este produto não existe");
					
				}
				 
			 }
			
		}
		
		if (resposta == 4) {
			
			for (int i = 0; i < lproduto.size();i++) {
				
				produto pd = lproduto.get(i);
				
				System.out.println("id: " + pd.id);
				System.out.println();
				System.out.println("código de barras: " + pd.codigo_de_barras);
				System.out.println();
				System.out.println("sku: " + pd.sku);
				System.out.println();
				System.out.println("nome: " + pd.nome);
				System.out.println();
				System.out.println("descrição: " + pd.descricao);
				System.out.println();
				System.out.println("categoria: " + pd.categoria);
				System.out.println();
				System.out.println("preço: " + pd.preço);
				System.out.println();
				System.out.println("peso: " + pd.peso);
				System.out.println();
				System.out.println("fabricante: " + pd.fabricante);
				System.out.println();
			}
			
			
		}
		
		if (resposta == 5) {
			
			
			 System.out.println("insira o id do produto: ");
			 int rep = sc.nextInt();
			 int fim = 0;
			 int i;
			 
			 for (i = 0; i < lproduto.size() && fim == 0; i++) {
				 
				produto Pd = lproduto.get(i);
				
				if (Pd.id == rep) {
					
					fim = 1;
					
				}
				
			 }
			
			produto pd = lproduto.get(i);
			
			System.out.println("id: " + pd.id);
			System.out.println();
			System.out.println("código de barras: " + pd.codigo_de_barras);
			System.out.println();
			System.out.println("sku: " + pd.sku);
			System.out.println();
			System.out.println("nome: " + pd.nome);
			System.out.println();
			System.out.println("descrição: " + pd.descricao);
			System.out.println();
			System.out.println("categoria: " + pd.categoria);
			System.out.println();
			System.out.println("preço: " + pd.preço);
			System.out.println();
			System.out.println("peso: " + pd.peso);
			System.out.println();
			System.out.println("fabricante: " + pd.fabricante);
			System.out.println();
			
		}
	}
		
	}

}
