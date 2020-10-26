import java.util.Scanner;


public class AllEqual{


	public static void main(String[] args)
		{
		
		
		int num1=Integer.parseint(args[0]);
		int num2=Integer.parseint(args[1]);
		int num3=Integer.parseint(args[2]);
		boolean comparator=true;
		if (num1!=num2 ||num2!=num3||num1!=num3){
		
		comparator = false;
		}
		
		
		System.out.println("como se muestra por pantalla,la afirmación \"los numeros son iguales es:\"\n");
		System.out.println(comparator);
		
		System.out.println("Fin del programa");
		
		
		}





}
