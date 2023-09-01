package pilha_objetos;

public class PilhaVaziaException extends RuntimeException {
	public PilhaVaziaException() {
		System.out.println("A pilha está vazia!!");
	}

}