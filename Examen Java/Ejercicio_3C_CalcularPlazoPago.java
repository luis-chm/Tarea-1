/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 3C                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

//Clase publica
public class Ejercicio_3C_CalcularPlazoPago
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Definicion de variales
	int pagoMensual = 10;
	int pagoTotal = 0;
	int mes = 1;
	
	//Seccion de estructuras repetitivas WHILE
	/*+= sirve para sumarle una cantidad al valor de una variable.(http://profesores.fi-b.unam.mx/carlos/java/java_basico2_5.html)
	 https://www.codecademy.com/forum_questions/555729a8d3292f6e7d000655*/
	while(mes <= 20)
		{
			//Imprimimos el pago mensual
			System.out.println("El mes "+mes+ " paga "+pagoMensual+" Colones");
			pagoMensual *= 2;//Esto seria igual a ingresar a *= b (a=a * b)
			mes++;
		}
		//Imprimimos el total pagado después de los 20 meses
		pagoTotal += pagoMensual;//Esto seria igual a ingresar a += b (a=a + b)		
		System.out.print("El pago total despues de 20 meses es "+pagoTotal+ " Colones");
	}
}