package fibonacci;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Sequencia Fibonacci:");
        CalculaFibonacci calculaFibonacci = new CalculaFibonacci();
        System.out.println(calculaFibonacci.calcular());
    }
}
