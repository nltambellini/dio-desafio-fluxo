import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        int num1;
        int num2;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        num1 = teclado.nextInt();

        System.out.println("Informe o segundo número:");
        num2 = teclado.nextInt();

        try {
            contar(num1, num2);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    
    teclado.close();

    }

    static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

        if (parametro1 >= parametro2)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int diferenca = parametro2-parametro1;

        for (int i = 1; i <= diferenca; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
