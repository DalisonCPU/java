import java.util.Scanner;

public class teste {
	public static int calcFib(int n) {
		if(n<2)return n;
		return calcFib(n-1)+calcFib(n-2);
	}
	public static void main(String[] args) {
		Scanner nome = new Scanner(System.in);
		System.out.println("Digite o n�mero para obter o tempo usando uma fun��o recursiva:");
		int fib = nome.nextInt();
		System.out.println("O n�mero digitado foi "+fib+". Calculando tempo...");
		long anterior = System.currentTimeMillis();
		calcFib(fib);
		long resultado = System.currentTimeMillis()-anterior;
		System.out.println("O tempo levou "+resultado);
	}

}
