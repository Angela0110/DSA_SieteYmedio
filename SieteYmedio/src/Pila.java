import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pila {
    List<Carta> baraja;
    int size;

    public Pila(){
        this.baraja = new ArrayList<>();
        this.size = baraja.size();
    }

    public void push(Carta c){
        baraja.add(c);
        this.size = baraja.size();
    }


    public Carta pop(){
        if (size > 0){
            Carta c = this.baraja.get(this.size - 1);
            this.baraja.remove(this.size - 1);
            this.size = baraja.size();
            return c;
        }
        else {
            return null;
        }
    }

    public void shuffle(){
        Collections.shuffle(baraja);
    }
}
