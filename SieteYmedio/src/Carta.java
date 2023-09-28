public class Carta {
    private Palo palo;
    private int valor;

    public Carta(Palo palo, int valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public double getValor() {
        if (valor > 7) {
            return 0.5;
        } else if (valor == 1) {
            return 1.0;
        }
        return valor;
    }

    public String toString() {
        return valor + " de " + palo;
    }
}

enum Palo {
    OROS,
    COPAS,
    BASTOS,
    ESPADAS
}
