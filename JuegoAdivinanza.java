import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
    // aqui se genera el numero aleatorio
        Random aleatorio = new Random();
        int numeroBuscado = aleatorio.nextInt(100) + 1; // Entre 1 y 100
        
    // parametros par la logica
        int intentosMaximos = 10;
        int intentosRealizados = 0;
        
        Scanner scanner = new Scanner(System.in);

        
	// mensajes del menu
        System.out.println("HOLAaaa VAMOS A JUGAR");
        System.out.println("Adivina un numero entre 1 y 100");
        System.out.println("Tienes " + intentosMaximos + " intentos");
        
	//while
        while(intentosRealizados < intentosMaximos) {
                System.out.print("\nIntento " + (intentosRealizados + 1) + ": ");
                int numeroIngresado = scanner.nextInt();
                
                if(numeroIngresado < 1 || numeroIngresado > 100) {
                    System.out.println("¡Numero invalido! Debe estar entre 1 y 100");
                    continue;
                }
                
                intentosRealizados++;
                
                if(numeroIngresado == numeroBuscado ) {
                    System.out.println("\n¡Felicidades! Adivinaste el numero en " + intentosRealizados + " intentos");
                    return;
                }
        
       // Logica de pistas
       if(intentosRealizados == intentosMaximos) {
        System.out.println("\n¡se acabaron los intentos perdiste :( !");
        System.out.println("El numero era: " + numeroBuscado);
        return;
    }
    
    if(numeroIngresado < numeroBuscado) {
        System.out.println("El numero es mayor");
    } else {
        System.out.println("El numero es menor");
    }
    
    System.out.println("Intentos restantes: " + (intentosMaximos - intentosRealizados));
       }
    }
}