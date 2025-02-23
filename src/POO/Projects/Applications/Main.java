package POO.Projects.Applications;

import POO.Projects.Entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Calculator calculator = new Calculator();

        System.out.println("Fale o primeiro numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Agora escolha o ooperador ( + , - , *, /)");
        char operator = sc.next().charAt(0);

        System.out.println("Escolha o segundo numero: ");
        double num2 = sc.nextDouble();

        if(operator == '/' && num2 == 0){
            System.out.println("Divisão por 0 é impossivel");

        } else {
         double resultado =  switch (operator) {
             case '+' -> calculator.somar(num1, num2);
             case '-' -> calculator.subtrair(num1, num2);
             case '/' -> calculator.dividir(num1, num2);
             case '*' -> calculator.multiplicar(num1, num2);
             default -> {
                 System.out.println("Operador " + operator + " inválido.");
                 yield 0;
             }

         };
         if (!Double.isNaN(resultado)) {
                System.out.println("O resultado é " + resultado);
            }




        }






            sc.close();
    }
}
