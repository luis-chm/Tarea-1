/*   
 _______________________________________________________________________
|[] Universidad Politecnica Internacional.                        |F]|!"|
|"""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""""|"|
|Introduccion a la Informatica                                        | |
|Ejercicio 4A                                                         | |
|																	  | |  
|Profesor: Lic. Julio César Sánchez Lobo                              | |  
|                                                                     | |
|Creado por: Luis Angel Chaves Mora                                   |_|
|_____________________________________________________________________|/|
 
*/ 

//Importacion de bibliotecas para entrada de datos
import java.util.Scanner;

//Clase publica
public class Ejercicio_4A_CuantosDigitos
{

	//Seccion del metodo principal de JAVA
	public static void main(String[] args)
	{
	
	//Declaracion de un objeto. A esto tambien se le conoce como instaciamiento de un objeto
	Scanner sc = new Scanner(System.in);
	
	//Definicion de variales
	int numero = 0;
	
	//Seccion do whie: se utiliza para repetir un bloque de código varias veces hasta que se cumpla una condición de salida. 
	do	
		{//ingreso de datos a la variable
		System.out.println("Ingrese un número entre 0 y 999 (con 0 se sale): ");
		numero = sc.nextInt();
		//Seccion condicional donde se especifica que los numeros entre 100 a 999 son de 3 digitos
		if (numero >=100 && numero <=999)
			{
				System.out.println("El número "+numero+" tiene 3 digitos\n");
			}
		//Sino se cumple la condicion el programa ejecuta el siguiente codigo
		else if(numero >=10 && numero <=99)//se especifica que los numeros entre 10 a 99 son de 2 digitos
				{
					System.out.println("El número "+numero+" tiene 2 digitos\n");
				}
		else if (numero >=0 && numero <=9)//se especifica que los numeros entre 0 a 10 son de 1 digitos
				{
					System.out.println("El número "+numero+" tiene 1 digitos\n");
				}
		else if (numero != 0)//si el valor ingresado no se encuentra en el rango de 0 a 999 se ejecuta el mensaje
				{
					System.out.println("Número inválido, intente de nuevo");
				}
		}	
	//Seccion de estructuras repetitivas WHILE
	//Si a la hora de ingresar el valor cero en la entrada de datos la condicion se cumple por lo tanto finaliza el bucle
	while(numero != 0);
		System.out.println("Has salido del programa"); 
	}
}