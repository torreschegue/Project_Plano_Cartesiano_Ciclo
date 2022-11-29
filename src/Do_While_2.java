import java.util.Scanner;

/*
 * 
 * Escribir un programa que solicite la carga de números por teclado, obtener su promedio
 * Finalizar la carga de valores cuando se cargue el valor 0.
 * 
 * */

public class Do_While_2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		// Declarar variables
		int suma; // Sumara la cantidad de valores ingresados
		int cantidad;  // Llevara el conteo de todos los numeros ingresados
		int valor; // Almacenara todos los valores que vallan desde el teclado
		int promedio; // Guardara y mostrara el promedio general
		
		// Inializando variables
		suma = 0;
		cantidad = 0;
		
		// Inicio del ciclo do-while
		do {
			// Pedi los valores en la variable valor
			System.out.println("Ingresa un Valor Numerico: (0 - Para Fenalizar)");
			valor = teclado.nextInt(); // valor almacena numero que viene desde el teclado
			
			// condicion Evalua
			// si el valor es distinto de cero
			// Estas Realiza una suma
			// Y Aumenta la variable cantidad en 1
			if(valor != 0) { // 
				suma = suma + valor; // se le agrega la suma que trae valor a la variable suma
				cantidad ++; // cantidad Aumenta en 1
			}
			//System.out.println("La suma es: " + suma);
			//System.out.println("los numeros ingresados son: " + cantidad);
			
		}while(valor != 0); // Se dejecuta mientras el valor sea distinto de 0
		
		if(cantidad != 0) { // Evalua si la cantidad es diferente de 0  si es verdadero saca el promedio
			promedio = (suma/cantidad);
			System.out.println("El promedio de los valores es: " + promedio);
		}else { // De lo contrario imprime el siemguiente mensaje
			System.out.println("No se Ingreso Valores");
		}
		
	}

}
