package pilha_objetos;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Defina uma quantidade limite de objetos da pilha...");
		int qtd_elemento = input.nextInt();
		input.nextLine();
		
	
		PilhaObjetos pilha = new PilhaObjetos(qtd_elemento);
		
		int confirmacaoInserir = 0;
		
   do {
	    
	    	  System.out.println("Deseja ver estado atual da pilha ? "
		        		+ "Digite 1 para Sim e 0 para não...");
		        int confirmacaoVerPilha = input.nextInt();
		        input.nextLine();
		        switch (confirmacaoVerPilha) {
				case 1:
					try {
		        		pilha.listarElementos();
	        		System.out.println("Deseja inserir algum elemento 1ª posição?");
	        		String elementoEscolhido = input.nextLine();
	        		
		        		
		        		pilha.ColocarNoInicio(elementoEscolhido);
		        		
		        		
		        		
	        	   }catch (PilhaVaziaException ex) {
		        		   ex.getMessage();
	        	   }
					
					break;
				case 0:
					System.out.println("Deseja inserir objetos na lista ? "
			    	  		+ "Digite 1 para Sim e 0 para não... ");
			    	  confirmacaoInserir = input.nextInt();
		         	  input.nextLine();
		    	      
			    	     if (confirmacaoInserir == 0) {
			    	    	 System.out.println("Esse é o primeiro elemento da lista:" + pilha.primeiroElemento());
			    	    	 System.out.println("A sua lista:");
			    	    	 
				    	    	  pilha.listarElementos();
				    	    	 break;
			    	     }else {
			    	  System.out.println("Digite um nome de um objeto para inserir na pilha...");
			    	    String elemento = input.nextLine();
				
					try {
						 pilha.inserirElemento(elemento); 
					}catch(PilhaCheiaException e) {
						e.getMessage();
						break;
					}
			    	     }
			    	     

				default:
					break;
				}     
        
	      }while (confirmacaoInserir == 1); 
		      
		      
		      input.close();
		    	
		    
		
  
	

	}

}
