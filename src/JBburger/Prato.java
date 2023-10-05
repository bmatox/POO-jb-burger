package JBburger;

public class Prato extends Cardapio { 
	
	private String categoria; // entrada, principal ou sobremesa 
	private String ingredientes; // separados por vírgula


	public Prato(String nome, double preco, String categoria, String ingredientes) {
		super(nome, preco);
		this.categoria = categoria;
		this.ingredientes = ingredientes;
	}

	public String getCategoria() {
		return categoria;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	@Override
	public void mostraItemCompleto() {
		System.out.println("Prato: " + getNome() + " - R$ " + getPreco());
		System.out.println("Categoria: " + getCategoria() + " - Ingredientes: " + getIngredientes());
	}
}