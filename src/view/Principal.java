package view;

import controller.HashController;

public class Principal {

	public static void main(String[] args) {

		HashController hash = new HashController();
		int []vet =new int [10];
		
		int tamanho=vet.length;
		for(int i=0;i<tamanho;i++) {
			vet[i]=(int)((Math.random()*299)+1);
		}
		hash.add(vet);
		
		try {
			hash.Listar();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
