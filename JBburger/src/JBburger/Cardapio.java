package JBburger;

public abstract class Cardapio {
	    
		private String nome;
	    private double preco;

	    public Cardapio(String nome, double preco) {
	        this.nome = nome;
	        this.preco = preco;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setNome(String nome) {
			this.nome = nome;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
		
		//método abstrato, que deve ser implementado pelas subclasses de Cardápio
		public abstract void mostraItemCompleto();
}
	

