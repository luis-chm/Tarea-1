/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 1A_PAR/IMPAR                                               | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para lectura de datos
import java.util.Scanner;

public class Ejercicio_1A_ParImpar
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int numero = 0;
	
	//Entrada de datos
	System.out.println("Digite un número.");
	numero = sc.nextInt();
	
	//uso de la unidad aritmetica logica
	
	//Simbolo %: Resto de una división entre enteros.
	if( numero % 2 == 0)
		{
		//Respuesta verdadera y Muestra en pantalla el resultado
		System.out.println ("El núnero ingresado es PAR");
	
		}
		
	else
		{		
		//Respuesta falsa y Muestra en pantalla el resultado
		System.out.println ("El núnero ingresado es IMPAR");
		}
	
	}
	
}