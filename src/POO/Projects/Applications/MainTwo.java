package POO.Projects.Applications;

import POO.Projects.Entities.Alugar;
import java.util.Scanner;

public class MainTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Alugar alugar = new Alugar();

        System.out.println("Olá, seja bem-vindo(a) à LocaHouse!");
        System.out.println("1. Apartamento (com 1 quarto)\n2. Casa (com 1 quarto)\n3. Estúdio");

        System.out.print("Digite o número da sua escolha: ");
        String tipoLugar = alugar.escolha(sc.next(), sc);
        alugar.setTipoLugar(tipoLugar);

        int numQuartos = 0, numVeiculos = 0;
        String garagem;

        if (tipoLugar.equals("1") || tipoLugar.equals("2")) {
            System.out.print("Quantos quartos adicionais? ");
            numQuartos = sc.nextInt();
            alugar.setNumQuartos(numQuartos);

            System.out.print("Gostaria de adicionar uma garagem? S|N: ");
            garagem = sc.next().toUpperCase();
            alugar.setGaragem(garagem);
        } else {
            System.out.print("Gostaria de adicionar uma garagem (com 2 vagas)? S|N: ");
            garagem = sc.next().toUpperCase();
            alugar.setGaragem(garagem);

            if (garagem.equals("S")) {
                System.out.print("Quantos veículos adicionais? (Contando com as vagas já liberadas): ");
                numVeiculos = sc.nextInt();
                alugar.setNumVeiculos(numVeiculos);
            }
        }

        double aluguelTotal = alugar.calcularAluguel(sc);
        System.out.printf("Sua escolha foi %s, você pagará R$ %.2f%n", tipoLugar, aluguelTotal);

        sc.close();
    }
}
