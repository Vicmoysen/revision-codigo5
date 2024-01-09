package org.generation.codigootros5;

// Faltaba importar Scanner
import java.util.Scanner;


/* El programa inicia recibiendo un número entero y positivo, si no no entra en el while. 
 * Se divide entre 10 este número pero queremos su modulo por lo cual se usa %10
 * Si el modulo coincide con el digito 3, 7, 8 o 9 se considera número afortunado,
 * si no se divide entre 10 y se itera nuevamente (a menos que el resultado sea menor a 0),
 * si después de esta iteración el modulo resulta nuevamente diferente a 3, 7, 8 y 9 se
 * vuelve iterar hasta alcanzar la condición del while y se considera no afortunado. 
 * Al final imprime el número inicial introducido y si es o no afortunado. 
 * */
public class Codigo5 {

	// Faltaba método main
	public static void main(String[] args) {
		
	// Se le dio formato a todo el código y se cambio el nombre de variables a nombres más descriptivos
	    Scanner scanner = new Scanner(System.in); // Faltaba añadir System.in para recibir la entrada del teclado
	    System.out.print("Introduzca un número: "); // Estaba cerrado con apostrofe y no con comillas
	    int numeroIntr = scanner.nextInt(); // Se cambio de String a int el tipo de dato y nextline por nextInt
	    
	    int inicial = numeroIntr;
	    
	    int afortunado = 0;
	    int noAfortunado = 0;
	    
	    while (numeroIntr > 0) {
		  int digito = (int)(numeroIntr % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afortunado++;
			numeroIntr = 0; // Agregue esta condición porque si no se hacía un ciclo infinito
	      } else {
			noAfortunado++;
			numeroIntr /= 10;
	      }
	    }
	   // Saque el if del while para que no imprimiera varias veces
	    if (afortunado > noAfortunado) {

	    	  System.out.println("El " + inicial + " es un número afortunado."); // Decia prinln y no println con t
	      } else {
	    	  System.out.println("El " + inicial + " no es un número afortunado.");
	      }
	    
	}

}