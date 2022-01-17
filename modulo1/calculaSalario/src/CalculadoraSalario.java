public class CalculadoraSalario {
    static double salarioBruto = 4080;
    public static void main(String[] args) {
        System.out.println("SALÁRIO BRUTO: " + salarioBruto);
        System.out.println("INSS: " + INSS(salarioBruto));
        System.out.println("IRRF: " + IRRF(salarioBruto));
        System.out.println("SALÁRIO LÍQUIDO: " + calcularSalarioLiquido(salarioBruto));

    }

    public static int calcularSalarioLiquido(double valor) {
        int salarioLiquido = (int) salarioBruto - INSS(salarioBruto) - IRRF(salarioBruto);
        return salarioLiquido;
    }

    public static int INSS(double valor) {
        int res = 0;
        if (valor <= 1500) {
            res = (int) round(salarioBruto, 0.08);
        } else if (valor > 1500 && valor <= 4000) {
            res = (int) round(salarioBruto, 0.09);
        } else {
            res = (int) round(salarioBruto, 0.11);
        }
        return res;
    }

    public static long round(double valor, double percent) {
        return Math.round(valor * percent);
    }

    public static int IRRF(double valor) {
        int res = 0;
        if (valor <= 3000) {
            res = 0;
        } else if (valor > 3000 && valor <= 6000) {
            res = (int) round(salarioBruto, 0.075);
        } else {
            res = (int) round(salarioBruto, 0.15);
        }
        return res;
    }
}
