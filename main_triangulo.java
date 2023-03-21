package Triangulo;
import java.util.Scanner;

public class main_triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int lado1,lado2,lado3;
		Scanner leer = new Scanner(System.in);
		System.out.println("introduzca el primer lado del triangulo");
		do {
			lado1 = leer.nextInt();
			System.out.println("Introduzca el segundo lado");
			lado2 = leer.nextInt();
			System.out.println("Introduzca el tercer lado");
			lado3 = leer.nextInt();}
			while(lado1<=0 || lado2<=0 || lado3<=0);
			
			if(lado1==lado2 && lado1==lado3)
			{System.out.println("Triangulo Equilatero");}
			
			else if(lado1==lado2 || lado1==lado3 || lado2==lado3)
			{System.out.println("Triangulo isosceles");}
			else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
			{System.out.println("Triangulo escaleno");}
			
			
			
		 }

	}


