package POO.application;

import POO.Entities.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Produtos p = new Produtos();





            System.out.println("Digite o nome do produto ");
            p.name = sc.nextLine();
            System.out.println("Digite o preço do produto ");
            p.price = sc.nextDouble();
            System.out.println("Digite a quantidde no estoque ");
            p.quantity = sc.nextInt();

            double total = p.priceTotal();
            System.out.printf("Produto %s, $ %.2f, %d unidades, valor Total: %.2f%n", p.name,p.price,p.quantity,p.priceTotal());

        System.out.println("Quantos produtos quer adicionar?? ");
        p.quantity = sc.nextInt();
         total = p.priceTotal();
        System.out.printf("Produto %s, $ %.2f, %d unidades, valor Total: %.2f%n", p.name,p.price,p.quantity,p.priceTotal());



        sc.close();

    }
}