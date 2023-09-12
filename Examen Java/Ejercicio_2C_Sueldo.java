/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 2C                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

public class Ejercicio_2C_Sueldo
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int horastrabajadas = 0;
	char claseTrabajador;
	double salarioBruto = 0;
	double deducciones = 0;
	double salarioNeto = 0;
	
	//Entrada de datos
	System.out.println("Ingrese la cantidad de horas por semana");
	horastrabajadas = sc.nextInt();
	System.out.println("Indique el tipo de clase a la que pertecene el trabajador(utilice BLOQ MAYUS): \n A\n B\n C\n D") ;
	claseTrabajador = sc.next().charAt(0); /*Para leer un caracter en java, usamos next() method seguido de charAt(0) (https://www.javatpoint.com/how-to-read-character-in-java)*/
	
	
	
	//seccion de proceso de datos y condicion multiple
	switch(claseTrabajador)
		{
			//Para usar caracteres se debe colocar entre comillas el simbolo. (https://www.javatpoint.com/java-switch)
			//Insertar comillas simples ALT + 39
			case 'A':
				salarioBruto = (horastrabajadas * 7500) * 4;
				deducciones = salarioBruto * 0.1067;
				salarioNeto = salarioBruto - deducciones;
				System.out.println("El sueldo del trabajador clase A es de: "+salarioNeto);
				break;
			case 'B':
				salarioBruto = (horastrabajadas * 2000) * 4;
				deducciones = salarioBruto * 0.1067;
				salarioNeto = salarioBruto - deducciones;
				System.out.println("El sueldo del trabajador clase B es de: "+salarioNeto);				
				break;
			case 'C':
				salarioBruto = (horastrabajadas * 1500) * 4;
				deducciones = salarioBruto * 0.1067;
				salarioNeto = salarioBruto - deducciones;
				System.out.println("El sueldo del trabajador clase C es de: "+salarioNeto);				
				break;
			case 'D':
				salarioBruto = (horastrabajadas * 1000) * 4;
				deducciones = salarioBruto * 0.1067;
				salarioNeto = salarioBruto - deducciones;
				System.out.println("El sueldo del trabajador clase D es de: "+salarioNeto);	
				break;
			default:
				System.out.println("Resultado no valido, reinicie el programa");
				break;
		}	
	 }
}