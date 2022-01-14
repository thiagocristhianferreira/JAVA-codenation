package fibonacci;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Sequencia Fibonacci:");
        CalculaFibonacci calculaFibonacci = new CalculaFibonacci();
        System.out.println(calculaFibonacci.calcular());

        int numero = 11;
        System.out.println("O número " + numero + " está dentro da sequencia Fibonacci?");
        boolean res = calculaFibonacci.verificar(numero);
        if (res) {
            System.out.println("SIM");
            System.out.println("O número " + numero + " está dentro da sequencia Fibonacci! :)");
        } else {
            System.out.println("NÃO");
            System.out.println("O número " + numero + " NÃO está dentro da sequencia Fibonacci! :(");
        }
    }
}
