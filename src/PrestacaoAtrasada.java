import java.util.Scanner;

public class PrestacaoAtrasada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float prestacao, valor, taxa, tempo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o valor da prestação : ");
		valor=sc.nextFloat();
		System.out.println("Qual prestação está atrasada : ");
		prestacao=sc.nextFloat();
		System.out.println("Qual o valor da taxa : ");
		taxa=sc.nextFloat();
		System.out.println("A quanto tempo está atrasada : ");
		tempo=sc.nextFloat();
		
		prestacao=valor+(valor*taxa/100)*tempo;
		
		System.out.println("O valor é"+ prestacao);
		

	}

}
