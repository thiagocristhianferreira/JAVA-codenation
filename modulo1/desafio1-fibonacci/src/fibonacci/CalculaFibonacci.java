package fibonacci;

import java.util.Arrays;
import java.util.ArrayList;

public class CalculaFibonacci {

    public ArrayList calcular() {
        int limite = 350;

        ArrayList sequencia = new ArrayList();

        for (int i = 0; i < limite; i++) {
            if (i < 2) {
                sequencia.add(i);
            } else {
                sequencia.add((i - 1) + (i - 2));
            }
        }
        return sequencia;
    }

    public boolean verificar(Integer num) {
        ArrayList sequencia = calcular();

        boolean val = sequencia.contains(num);

        return val;
    }
}
