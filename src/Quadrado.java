import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lado, area;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a dimensão de um quadrado : ");
		lado=sc.nextInt();
		
		
		area=lado*lado;
		
		System.out.println("A area do quadrado é : "+area);

	}

}
