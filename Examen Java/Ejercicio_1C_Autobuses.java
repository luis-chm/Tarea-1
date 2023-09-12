/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 1C                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

public class Ejercicio_1C_Autobuses
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int numeroalumnos = 0;
	
	
	//Entrada de datos
	System.out.println("Ingrese la cantidad de alumnos que asistiran al viaje");
	numeroalumnos = sc.nextInt();
	
	
	//Usando unidad logica condicional de la pc 
	if (numeroalumnos >= 100)//si la cantidad es igual a mayor a 100 se calcula costo por alumon y costo total
		{
			{
			System.out.println("Son 100 alumnos o más, el costo por cada alumno es de: C6.500 colones");
			System.out.println("El costo de la renta del autobús es de: C" +(numeroalumnos*6500)+" mil colones" );
			}
		}
	
		else if(numeroalumnos >= 50 && numeroalumnos <= 99)//sino la cantidad es igual a 50 y menor a 99 se calcula costo por alumon y costo total
				{
				System.out.println("Son de 50 a 99 alumnos, el costo por cada alumno es de: " + (70000 / numeroalumnos)+" mil colones");
				System.out.println("El costo de la renta del autobús es de: C70.000 colones");
				}
		else if(numeroalumnos >= 30 && numeroalumnos <= 49)//sino la cantidad es entre 30 a 49 se calcula costo por alumon y costo total
				{
				System.out.println("Son de 30 a 49 alumnos, el costo por cada alumno es de: " +(95000 / numeroalumnos)+" mil colones");
				System.out.println("El costo de la renta del autobús es de: C95.000 colones");
				}
		else if(numeroalumnos < 30 )//sino la cantidad es menos de 30 se calcula costo por alumon y costo total 
				{	
				System.out.println("Son menos de 30 alumnos, el costo por cada alumno es de: " +(4000 / numeroalumnos)+" mil colones");
				System.out.println("El costo de la renta del autobús es de: C4.000 colones");
				}
	}
}
