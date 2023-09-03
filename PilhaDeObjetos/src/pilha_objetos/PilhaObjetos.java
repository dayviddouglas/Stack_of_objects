package pilha_objetos;



public class PilhaObjetos {
	private int qtd;
	private String[] quantidadeDisponivel;
	private int indice;



	public PilhaObjetos(int qtd_elementos) {
		this.qtd = qtd_elementos;
		quantidadeDisponivel= new String[qtd_elementos];
		indice = 0;
		
	}
	
   public int getQtd() {
		return qtd;
	}



	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public String[] getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(String[] quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}
	
	 
    public void inserirElemento (String elementoUsuario) {
       
    	   if(indice < quantidadeDisponivel.length) {
    		   quantidadeDisponivel[indice] = elementoUsuario;
    		    indice++;
    	    	   } else {
    	    		   throw new PilhaCheiaException();
    	    	   }
    	   
 
    	    
       }
    

    public void listarElementos() {
 	   for(int count = 0; count < quantidadeDisponivel.length; count++) {
 		     if (indice == 0) {
 		    	 throw new PilhaVaziaException();
 		     }
 			   System.out.println(quantidadeDisponivel[count]);
 		   
 	   }
 	     
    }
    public void ColocarNoInicio (String elemento) {
    	 int ind = 0;
    	 String elementoLista = null;
      	  for(int i = 0; i < quantidadeDisponivel.length; i++) { 
      		      elementoLista = quantidadeDisponivel[i];
      		      ind = i;
      		     if(elementoLista.equalsIgnoreCase(elemento)) {
      		    	 break;
      		     }
      		   
      		     
      	  }  
    	  	if (ind != -1) {
    	  		for(int index = ind; index > 0; index--) {
    	  			quantidadeDisponivel[index] = quantidadeDisponivel[index - 1];    
    	  		}
    	  		quantidadeDisponivel[0] = elemento;
    	  	}else {
    	  		System.out.println("Elemento não encontrado na Lista");
    	  	}
    	  	    	
    	
    }
    
    
    public String primeiroElemento () {
    	return quantidadeDisponivel[0];
    }

	
}
