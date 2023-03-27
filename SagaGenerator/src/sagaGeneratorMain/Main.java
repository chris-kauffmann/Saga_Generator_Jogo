package sagaGeneratorMain;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		
		
		int resposta = 0;
		int pontuacao=0;
		
		
		/* Tela Inicial */
	    System.out.println("\n=== Saga Generator - Em busca do FullStack em Java ===");
	    System.out.println("--------------------------------------------------------");		
        System.out.println("1. Iniciar jogo");
        System.out.println("2. Sair");
        System.out.print("Escolha uma opção (1-2): ");
        
        /* Obtém a opção selecionada pelo usuário */
        int opcao = leia.nextInt();
        leia.nextLine(); // Consumir a quebra de linha 
		
        /* Iniciar o jogo se o usuário selecionou a opção 1 */
        if (opcao == 1) {
            // Tela de configuração do personagem
        	System.out.println("-----------------------------------------------------");	 	
            System.out.print("Digite o nome do seu personagem: ");
            String nome = leia.nextLine();
            System.out.println("Bem-vinde, " + nome+ "!");
            System.out.println();
        				}
        /*Primeira pergunta----------------------------------*/
		while(resposta!=1 && resposta!=2 && resposta!=3) {/* Pergunta de múltipla escolha*/
			System.out.println("----------------------FASE--1------------------------");
            System.out.println("\nQual dos comandos abaixo representa corretamente a"
            		+ " linha de código que faz a leitura dos dados digitados por um usuário?");
            System.out.println("																	");
            System.out.println("\t1) "+"Scanner leia = new Scanner(System.in);");
            System.out.println("\t2) "+"leia = scanner new scanner(system.in)");
            System.out.println("\t3) "+"scanner leia = new scanner(system.in):");
            
            /*Lê a resposta da pergunta */
            System.out.println("\nDigite o número correspondente à reposta certa: ");
            resposta = leia.nextInt();
            
            /*Verifica se a resposta está correta */
            if(resposta ==1) {
            	pontuacao+=10;
            	System.out.println("\nResposta certa! Sua pontuação é de "+pontuacao+"+ pontos. ");	
            	
            } else if(resposta==2 || resposta==3){
            	System.out.println("\nLamento, não era a resposta certa. ");
            }}
        	
 
		opcao=0;
				
		  /*Segunda pergunta----------------------------------*/
		while(resposta!=1 && resposta!=2 && resposta!=3) {/* Pergunta de múltipla escolha*/
            System.out.println("\nQual dos comandos abaixo representa corretamente a"
            		+ " linha de código que faz a leitura dos dados digitados por um usuário?");
            System.out.println("\t1) "+"Scanner leia = new Scanner(System.in);");
            System.out.println("\t2) "+"leia = scanner new scanner(system.in)");
            System.out.println("\t3) "+"scanner leia = new scanner(system.in):");
            
            /*Lê a resposta da pergunta */
            System.out.println("\nDigite o número correspondente à reposta certa: ");
            resposta = leia.nextInt();
            
            /*Verifica se a resposta está correta */
            if(resposta ==1) {
            	pontuacao+=10;
            	System.out.println("\nResposta certa! Você tem "+pontuacao+" pontos. ");	
            	
            } else if(resposta==2 || resposta==3){
            	System.out.println("\nLamento, não era a resposta certa. ");
            }}
		
		opcao=0;
        
        
        
        
        
        
											}
					}
