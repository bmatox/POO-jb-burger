package JBburger;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
    	String caminhoArquivoEntrada = "C:\\Users\\Unifor\\Desktop\\Nova pasta\\entrada.txt";

        try { 
        	// Cria um objeto File que representa o arquivo de entrada
            File arquivoEntrada = new File(caminhoArquivoEntrada); 
            Scanner scanner = new Scanner(arquivoEntrada); 

            // Lendo dados do arquivo de entrada
            String restauranteInfo = scanner.nextLine();  
            String[] restauranteData = restauranteInfo.split(",");
            

            // Criando um restaurante com as info lidas do arquivo de entrada
            Restaurante restaurante = new Restaurante(restauranteData[0], restauranteData[1], restauranteData[2]);
            
            // Imprimindo os dados do restaurante na tela 
            System.out.println("--------------------------------------------------------");
            System.out.println("                         " + restaurante.getNome()); 
            System.out.println("                 " + restaurante.getEndereco()); 
            System.out.println("                       " + restaurante.getTelefone());
            System.out.println("--------------------------------------------------------");
            System.out.println(" ");
            
            // Criando algumas mesas
            Mesa mesa1 = new Mesa(1, 4);
            Mesa mesa2 = new Mesa(2, 2);
            Mesa mesa3 = new Mesa(3, 6);

            // Adicionando as mesas ao restaurante
            restaurante.getMesas().add(mesa1);
            restaurante.getMesas().add(mesa2);
            restaurante.getMesas().add(mesa3);

            // Criando alguns clientes
            Cliente cliente1 = new Cliente("João");
            Cliente cliente2 = new Cliente("Maria");

            // Criando alguns itens do cardápio
            Bebida bebida1 = new Bebida("Refrigerante", 5.00, "Não-alcoólica", 350);
            Bebida bebida2 = new Bebida("Cerveja", 8.00, "Alcoólica", 600);

            Prato prato1 = new Prato("Hambúrguer", 15.00, "Principal", "Pão, carne, queijo, alface e tomate");
            Prato prato2 = new Prato("Batata frita", 10.00, "Entrada", "Batata e sal");

            // Criando um pedido para a mesa 1 com o cliente 1
            Pedido pedido1 = new Pedido(cliente1);

            // Adicionando alguns itens ao pedido da mesa 1
            pedido1.alterarItem(bebida1, 3, true); 
            pedido1.alterarItem(prato1, 1, true); 
            pedido1.alterarItem(bebida1, 1, false); // remove 1 refrigerante
            
            // Associando o pedido à mesa 1
            mesa1.associarPedido(pedido1);

            // Fechando o pedido da mesa 1
            restaurante.fecharPedido(mesa1);

            // Criando um pedido para a mesa 2 com o cliente 2
            Pedido pedido2 = new Pedido(cliente2);

            // Adicionando alguns itens ao pedido da mesa 2
            pedido2.alterarItem(bebida2, 4, true); 
            pedido2.alterarItem(prato2, 1, true); 

            // Associando o pedido à mesa 2
            mesa2.associarPedido(pedido2);

            // Fechando o pedido da mesa 2
            restaurante.fecharPedido(mesa2);       
            
            System.out.println("Obrigado!");
            
            scanner.close();
            
            System.out.println("\n ## Teste do método removeIf ##");
            System.out.println("\nQuantidade de mesas do restaurante antes de remover as disponíveis: " + restaurante.getMesas().size());
            restaurante.removerMesasDisponiveis();
            System.out.println("Quantidade de mesas do restaurante após remover as disponíveis: " + restaurante.getMesas().size());

            // Captura a exceção se o arquivo de entrada não for encontrado
        	} catch (FileNotFoundException e) {
            System.err.println("Arquivo de entrada não encontrado: " + e.getMessage());
        	}
    
        	
    }
}