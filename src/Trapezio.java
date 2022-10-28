import java.util.Scanner;

public class Trapezio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int base1, base2, altura, area;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura do trapezio : ");
		altura=sc.nextInt();
		System.out.println("Digite a base maior do trapezio : ");
		base1=sc.nextInt();
		System.out.println("Digite a base menor do trapezio : ");
		base2=sc.nextInt();
		
		area=(base1+base2)*altura/2;
		
		System.out.println("A area do trapézio é "+area);
		

	}

}
