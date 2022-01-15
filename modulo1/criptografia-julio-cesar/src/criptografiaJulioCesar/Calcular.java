package criptografiaJulioCesar;

import java.util.Arrays;

public class Calcular {

    String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" };

    public String encriptar(String frase) {
        String fraseEncriptada = "";

        for (int i = 0; i < frase.length(); i++) {
            String letra = String.valueOf(frase.charAt(i));
            if (letra.equals("x")) {
                fraseEncriptada += "a";
            } else if (letra.equals("y")) {
                fraseEncriptada += "b";
            } else if (letra.equals("z")) {
                fraseEncriptada += "c";
            } else {
                char ch = frase.charAt(i);
                int getIndex = Arrays.asList(alfabeto).indexOf(letra) + 3;
                if (Character.isLetter(ch)) {
                    fraseEncriptada += alfabeto[getIndex];
                } else {
                    fraseEncriptada += letra;
                }
            }
        }
        return fraseEncriptada;
    }

    public String decriptar(String frase) {
        String fraseDecriptada = "";

        for (int i = 0; i < frase.length(); i++) {
            String letra = String.valueOf(frase.charAt(i));
            if (letra.equals("a")) {
                fraseDecriptada += "x";
            } else if (letra.equals("b")) {
                fraseDecriptada += "y";
            } else if (letra.equals("c")) {
                fraseDecriptada += "z";
            } else {
                char ch = frase.charAt(i);
                int getIndex = Arrays.asList(alfabeto).indexOf(letra) - 3;
                if (Character.isLetter(ch)) {
                    fraseDecriptada += alfabeto[getIndex];
                } else {
                    fraseDecriptada += letra;
                }
            }
        }
        return fraseDecriptada;
    }

}
