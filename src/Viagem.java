import java.util.Scanner;

public class Viagem {

	public static void main(String[] args) {
	
		float tempo, velocidade, distancia,litros;
		float horas=0, minutos=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite quanto tempo até o seu destino : ");
        tempo=sc.nextFloat();  
        System.out.println("\nESCOLHA PARA HORAS OU MINUTOS ABAIXO!!!");
        System.out.println("1 - Horas");
        System.out.println("2 - Minutos");	
        horas=sc.nextInt();
        
        
	if (horas==0)
        	System.out.println("Horas");
	if (minutos==0)
    
        	System.out.println("Minutos");
        
        System.out.print("\nDigite a velocidade média que você ira estar : ");
        velocidade=sc.nextFloat();
  
        distancia=tempo*velocidade;
        litros=distancia/12;
        
        System.out.println("A velocidade média da viagem foi de "+velocidade);
        System.out.println("\nA distancia percorrida é de : "+distancia+"KM");
        System.out.println("O Tempo gasto na viagem foi de "+tempo);
        System.out.println("\nVocê ira gastar "+litros+" litros de gásolina, até seu destino.");
           
	}

}
