/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 3B                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

//Clase publica
public class Ejercicio_3B_ValorInicial_Final
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int valorInicial = 0;
	int valorFinal = 0;
	
	
	//Entrada de datos
	System.out.print("Ingrese el valor inicial: ");
	valorInicial = sc.nextInt();
	System.out.print("Ingrese el valor final: ");
	valorFinal = sc.nextInt();

	//Seccion de estructuras repetitivas WHILE
	while(valorInicial <= valorFinal)
		{
			System.out.println("\nEl valor actual de la variable es: "+valorInicial);
			valorInicial++;
		}
		
	System.out.print("\n¡Ha alcanzado el tope!\n");
	}
}