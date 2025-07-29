import exception.ParametrosInvalidosException;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Contador {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Integer firstNumber = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        Integer secondNumber = scanner.nextInt();

        try {
            count(firstNumber, secondNumber);
        } catch (ParametrosInvalidosException ex) {
            System.out.println(ex.getMessage());
        }

    }

    private static void count(Integer firstParameter, Integer secondParameter) throws ParametrosInvalidosException {
        if (firstParameter > secondParameter) throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        var contagem = 0;
        for (int i = firstParameter; i < secondParameter; i++){
            System.out.println(String.format("Imprimindo o numero: %s", ++contagem));
        }
    }
}