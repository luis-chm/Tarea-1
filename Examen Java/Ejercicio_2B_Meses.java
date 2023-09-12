/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 2B                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

public class Ejercicio_2B_Meses
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int numero = 0;
	
	
	
	//Entrada de datos
	System.out.println("Ingrese un número entre 1 y 12 para saber el mes correspondiente");
	numero = sc.nextInt();
	
	//seccion de proceso de datos
	switch(numero)
		{
			//Para usar caracteres se debe colocar entre comillas el simbolo. (https://www.javatpoint.com/java-switch)
			//Insertar comillas simples ALT + 39
			case 1:
				System.out.println("Enero");
				break;
			case 2:
				System.out.println("Febrero");
				break;
			case 3:
				System.out.println("Marzo");
				break;				
			case 4:
				System.out.println("Abril");
				break;
			case 5:
				System.out.println("Mayo");
				break;
			case 6:
				System.out.println("Junio");
				break;
			case 7:
				System.out.println("Julio");
				break;	
			case 8:
				System.out.println("Agosto");
				break;	
			case 9:
				System.out.println("Septiembre");
				break;	
			case 10:
				System.out.println("Octubre");
				break;	
			case 11:
				System.out.println("Noviembre");
				break;
			case 12:
				System.out.println("Diciembre");
				break;			
			default:
				System.out.println("ERROR. Por favor reinicie el programa y digite un número entre 1 y 12");
				break;
		}	
	}
}