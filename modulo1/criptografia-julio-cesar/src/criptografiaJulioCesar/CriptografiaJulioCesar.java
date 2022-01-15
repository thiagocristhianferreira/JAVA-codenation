package criptografiaJulioCesar;

public class CriptografiaJulioCesar {
    public static void main(String[] args) {
        String frase = "encriptar e decriptar washington zeus xis";
        System.out.println("Frase para encriptar: " + frase);
        System.out.println();

        Calcular calcular = new Calcular();
        String encriptada = calcular.encriptar(frase);
        System.out.println("Frase Encriptada: " + encriptada);
        System.out.println();
        String decriptada = calcular.decriptar(encriptada);
        System.out.println("Frase Decriptada: " + decriptada);
    }
}
