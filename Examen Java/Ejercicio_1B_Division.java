/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 1B                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

public class Ejercicio_1B_Division
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int numero1 = 0;
	int numero2 = 0;
	int resultado = 0;
	
	//Entrada de datos
	System.out.println("Digite el primero número.");
	numero1 = sc.nextInt();
	System.out.println("Digite el segundo número.");
	numero2 = sc.nextInt();
	
	//Seccion de procesamiento de datos
	
	
	//uso de la unidad aritmetica logica
	
	if(numero2 == 0)
		{
		//muestra en pantalla el error al ingresar en el 2do numero un cero
		System.out.println ("ERROR, Reinicie el programa e introduzca un valor válido.");
	
		}
		
	else
		{		
		//Muestra en pantalla el resultado de la division de dos numeros pares
		System.out.println ("El resultado de la division es: "+(resultado= numero1 / numero2));
		}
	
	}
	
}
