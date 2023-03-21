package Numero;
import java.util.Scanner;

public class Escribir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner calcular = new Scanner(System.in);
		int num;
		System.out.println("Ingresar el Numero");
		num=calcular.nextInt();
		if(num%2==0) {
			System.out.println("El numero introducido es PAR");}
		else {System.out.println("El numero introducido es Impar");
			
		}
		
		

	}

}
