import java.util.Scanner;

public class TemperaturaFparaC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int celcius, fahrenheit;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahrenheit : ");
		fahrenheit=sc.nextInt();
		
		celcius=(fahrenheit-32);
		
		System.out.println("A temperatura fahrenheit convertida para celcius é " +celcius*5/9+"C");

	}

}
