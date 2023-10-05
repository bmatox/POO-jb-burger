package JBburger;

public class ItemPedido {
	  
	private Cardapio cardapio; // o cardápio do item
	private int quantidade; // a quantidade do item

	public ItemPedido(Cardapio cardapio, int quantidade) { 
	    this.cardapio = cardapio;
	    this.quantidade = quantidade;
	  }

	public Cardapio getCardapio() { 
	    return this.cardapio;
	  }
	
	public int getQuantidade() { 
	    return this.quantidade;
	  }

	public void setCardapio(Cardapio cardapio) {
		this.cardapio = cardapio;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
