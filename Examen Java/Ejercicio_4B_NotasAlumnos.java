/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 4B                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

//Clase publica
public class Ejercicio_4B_NotasAlumnos
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int nota = 0;
	int mayoresIguales = 0;
	int menores = 0;
	
	
	//Seccion do whie: se utiliza para repetir un bloque de código varias veces hasta que se cumpla una condición de salida. 
	do	
		{//ingreso de datos a la variable
		System.out.println("Ingrese la nota del alumno (con 0 se sale): ");
		nota = sc.nextInt();
		//Seccion condicional donde se especifica 
		if (nota >= 7)//notas son iguales o mayores a 7 
			{
				mayoresIguales=mayoresIguales+1;//se guarda el dato en la variable y por cada nota se contabiliza 1
			}
		//Sino se cumple mayor o igual a 7 son menores
		else if (nota >0)//notas son mayores a 0 y menores a 6
			{
				menores=menores+1;//se guarda el dato en la variable y por cada nota se contabiliza 1
			}
		}	
	//Seccion de estructuras repetitivas WHILE
	//Si a la hora de ingresar el valor cero en la entrada de datos la condicion se cumple por lo tanto finaliza el bucle
	while(nota != 0);
		//Impresion en pantalla de la cantidad por cada solicitud
		System.out.println("Los alumnos que tienen notas mayores o iguales a 7 son : " + mayoresIguales);
		System.out.println("Los alumnos que tienen notas menores a 7 son: "+menores);
	}
}