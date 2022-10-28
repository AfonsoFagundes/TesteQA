import java.util.Scanner;

public abstract class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int celcius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em celcius : ");
		celcius=sc.nextInt();
		
		fahrenheit=(9*celcius+160)/5;
		
		System.out.println("A temperatura celcius convertida para fahrenheit é " +fahrenheit+"F");

	}

}
