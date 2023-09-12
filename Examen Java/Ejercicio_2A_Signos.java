/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 2A                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

public class Ejercicio_2A_Signos
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int numero1, numero2 = 0;
	char operadorMatematico;
	
	
	//Entrada de datos
	System.out.println("Ingrese el primer número entero");
	numero1 = sc.nextInt();
	System.out.println("Ingrese el segundo número entero");
	numero2 = sc.nextInt();
	System.out.println("Indique la ooperacion matematica a realizar (+, -, *, /)");
	operadorMatematico = sc.next().charAt(0); /*Para leer un caracter en java, usamos next() method seguido de charAt(0) (https://www.javatpoint.com/how-to-read-character-in-java)*/
	
	//seccion de proceso de datos
	switch(operadorMatematico)
		{
			//Para usar caracteres se debe colocar entre comillas el simbolo. (https://www.javatpoint.com/java-switch)
			//Insertar comillas simples ALT + 39
			case '+':
				System.out.println("La suma de ambos números es: "+(numero1 + numero2));
				break;
			case '-':
				System.out.println("La resta de ambos números es: "+(numero1 - numero2));
				break;
			case '*':
				System.out.println("La multipicacion de ambos números es: "+(numero1 * numero2));
				break;
			case '/':
				System.out.println("La division de ambos números es: "+(numero1 / numero2));
				break;
			default:
				System.out.println("Resultado no valida, reinicie el programa");
				break;
		}	
	}
}