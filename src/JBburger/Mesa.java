
package JBburger;

public class Mesa {
	  
	  private int numero;// número da mesa
	  private boolean disponivel;// disponibilidade da mesa 
	  private Pedido pedido;// pedido associado à mesa (pode ser nulo se a mesa estiver vazia)
	  
	  public Mesa(int numero, int capacidade) {
	    this.numero = numero;
	    this.disponivel = true;
	    this.pedido = null;
	  }
	    
	  public int getNumero() {
		return numero;
	  }

	  public void setNumero(int numero) {
		this.numero = numero;
	  }

	  public boolean isDisponivel() {
		return disponivel;
	  }

	  public void setDisponivel(boolean disponivel) {
		 this.disponivel = disponivel;
	  }

	  public Pedido getPedido() {
		return pedido;
	  }

	  public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	  }
	  
	  // associa um pedido à mesa se ela estiver disponível
	  public void associarPedido(Pedido pedido) {
		  if (disponivel == true) { 
		    	this.pedido = pedido; // atribui o valor do parâmetro pedido ao atributo pedido
		    	this.disponivel = false; 
		    	System.out.println("O pedido do cliente " + pedido.getCliente().getNome() + " foi associado à mesa " + this.numero + "."); 
		    } else {
		    	System.out.println("A mesa " + this.numero + " está ocupada."); 
		    }
		    
	  }

	  // desassocia um pedido da mesa se ela estiver ocupada
	  public void desassociarPedido() {
	  	if (!this.disponivel) { // se a mesa não estiver disponível
	  	    this.pedido = null; 
	  	    this.disponivel = true; 
	  	    System.out.println("O pedido do cliente foi desassociado da mesa " + this.numero + "."); 
	  	} else { 
	  		System.out.println("A mesa " + this.numero + " está vazia."); 
	  	}
	  }
	  
}
