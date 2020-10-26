import java.util.Scanner;


public class DistinctValues{

public static void main(String[3] args)	
	{
	int num1,num2,num3;
	int cuenta=0;
	Scanner numescaneado=new Scanner(System.in);

	int numero=int.parseint(numescaneado);
	num1 = numescaneado.nextInt();	
	num2 = numescaneado.nextInt();
	num3 = numescaneado.nextInt();
	
	if (num1!=num2){cuenta++;}
	else{}
	if (num2!=num3){cuenta++;}
	else{}
	if (num1!=num3){cuenta++;}
	else{}
	System.out.println("cantidad de numeros diferentes = "+ cuenta);
	
	}

}