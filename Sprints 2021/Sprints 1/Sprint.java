import java.util.Scanner;

public class Sprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
       
       String d1, d2, d3, d4, d5;
       System.out.println("As respostas devem ser inseridas na seguinte forma: 'direção' 'número de casas' EX: 'esquerda 2'");
       System.out.println("O robô deve ter no minimo 88% de bateria para realizar o percurso.");
       System.out.println("Insira o primeiro movimento: ");
       d1 = teclado.nextLine();
       
       if(d1.equalsIgnoreCase("frente 2")) {
    	   System.out.println("insira o segundo movimento: ");
    	   d2 = teclado.nextLine();
    	   if(d2.equalsIgnoreCase("direita 1")) {
    		   System.out.println("Insira o terceiro movimento: ");
    		   d3 = teclado.nextLine();
    		   if(d3.equalsIgnoreCase("frente 3")) {
    			   System.out.println("insira o quarto movimneto: ");
    			   d4 = teclado.nextLine();
    			   if(d4.equalsIgnoreCase("esquerda 3")) {
    				   System.out.println("Insira o quinto movimento: ");
    				   d5 = teclado.nextLine();
    				   if(d5.equalsIgnoreCase("frente 6")) {
    					   System.out.println("Parabéns!! Você completou o percurso.");
    					   System.out.println("O robô gastou 12W de energia para completar o percurso.");
    					   
    				   } else System.out.println("Comando inválido, tente novamente!");
    					   
    			   } else System.out.println("Comando inválido, tente novamente!");
    			   
    		   } else System.out.println("Comando inválido, tente novamente!");
    		   
    	   } else  System.out.println("Comando inválido, tente novamente!");
    	   
       } else {
    	   System.out.println("Comando inválido, tente novamente!");
       }
     
        
              
      
        
     
       
     
	}

}
