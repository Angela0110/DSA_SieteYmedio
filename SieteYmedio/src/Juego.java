import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila mazo = crearMazo();

        double puntajeJugador = 0.0;

        while (true) {
            Carta carta = mazo.pop();
            puntajeJugador += carta.getValor();

            System.out.println("Has recibido una carta: " + carta);
            System.out.println("Tu puntaje actual es: " + puntajeJugador);

            if (puntajeJugador >= 7.5) {
                break;
            }

            System.out.print("¿Quieres otra carta? (s/n): ");
            String respuesta = scanner.nextLine();

            if (!respuesta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Tu puntaje final es: " + puntajeJugador);

        if (puntajeJugador > 7.5) {
            System.out.println("¡Has perdido!");
        } else if (puntajeJugador == 7.5) {
            System.out.println("¡Has obtenido un 7.5! ¡Ganaste!");
        } else {
            System.out.println("¡Has ganado!");
        }

        scanner.close();
    }

    private static Pila crearMazo() {
        Pila mazo = new Pila();

        Palo[] palos = { Palo.OROS, Palo.COPAS, Palo.BASTOS, Palo.ESPADAS };

        for (Palo palo : palos) {
            for (int valor = 1; valor <= 7; valor++) {
                Carta carta = new Carta(palo, valor);
                mazo.push(carta);
            }
        }
        mazo.shuffle();
        return mazo;
    }
}
