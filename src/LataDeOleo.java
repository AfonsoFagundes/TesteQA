import java.util.Scanner;

public class LataDeOleo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double volume,raio, altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o raio da láta de oléo : ");
		raio=sc.nextDouble();
		System.out.println("Digite a altura da láta : ");
		altura=sc.nextDouble();
		
		volume=Math.PI*raio*raio*altura;
		
		System.out.println("%2fO volume da láta de oléo é : "+ volume+".ML");
		
		
	}

}
