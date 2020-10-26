import java.util.Scanner;


public class AllEqual{


	public static void main(String[3] args)
		{
		int num1,num2,num3;
		bool comparator=true;
		Scanner numescaneado = new Scanner(System.in);
		int numero=int.parseint(numescaneado);
		System.out.println("introduce los 3 numeros: \n");
		num1 = numescaneado.nextInt();	
		System.out.println("\n");
		num2 = numescaneado.nextInt();
		System.out.println("\n");
		num3 = numescaneado.nextInt();
		
		if (num1!=num2 ||num2!=num3||num1!=num3){
		
		comparator = false;
		}
		
		
		System.out.println("como se muestra por pantalla,la afirmación \"los numeros son iguales es:\"\n");
		System.out.println(comparator);
		
		System.out.println("Fin del programa");
		
		
		}





}