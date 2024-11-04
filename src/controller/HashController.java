package controller;

import br.edu.fateczl.Lista.Lista;

public class HashController {
	
	Lista<Integer> []hashtable;
	
	public HashController() {
		hashtable=new Lista[2];
		inicializaLista();
				
	}

	private void inicializaLista() {
		int tamanho=hashtable.length;
		
		for(int i=0;i<tamanho;i++) {
			hashtable[i]=new Lista<Integer>();
		}
		
	}
	private int hashCode(int num) {
		if(num%2==0) {
			return 0;
		}return 1;
	}
	
	public void add(int [] vet ) {
		for(int num:vet) {
			verifica(num);
		}
		
	}

	private void verifica(int num) {
		int pos=hashCode(num);
		hashtable[pos].addFirst(num);
	}
	
	public void Listar() throws Exception {

		System.out.println(hashtable[0].size() +"- Números Pares:\n");
			int tamanho=hashtable[0].size();
			for(int i=0;i<tamanho;i++) {
				System.out.print(hashtable[0].get(i)+"-");
				
			}
			System.out.println ("\n\n"+hashtable[1].size() +"- Números Ímpares:\n");
			tamanho=hashtable[1].size();
			for(int i=0;i<tamanho;i++) {
				System.out.print(hashtable[1].get(i)+"-");
				
			}
		}
	}
	

