package POO.Projects.Entities;

import java.util.Scanner;

public class Alugar {
    private String tipoLugar;
    private int numQuartos;
    private String garagem;
    private int numVeiculos;

    public Alugar() {}

    public String escolha(String opcao, Scanner sc) {
        while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3")) {
            System.out.println("INVÁLIDO, escolha uma opção válida: \n1. Apartamento (com 1 quarto);\n2. Casa (com 1 quarto);\n3. Estúdio");
            opcao = sc.next();
        }
        return opcao;
    }

    public double calcularAluguel(Scanner sc) {
        double aluguelBase = 0;

        switch (tipoLugar) {
            case "1": // Apartamento
                aluguelBase = 700;
                if (numQuartos > 1) {
                    aluguelBase += 200 * (numQuartos - 1);
                }
                if (garagem.equalsIgnoreCase("S")) {
                    aluguelBase += 300;
                }
                if (numQuartos == 1 || numQuartos == 0) {
                    System.out.print("Você possui filhos? S|N: ");
                    String desconto = sc.next().toUpperCase();
                    if (desconto.equals("N")) {
                        aluguelBase *= 0.85;
                    }
                }
                break;

            case "2": // Casa
                aluguelBase = 900;
                if (numQuartos > 1) {
                    aluguelBase += 250 * (numQuartos - 1);
                }
                if (garagem.equalsIgnoreCase("S")) {
                    aluguelBase += 300;
                }
                break;

            case "3": // Estúdio
                aluguelBase = 1200;
                if (garagem.equalsIgnoreCase("S")) {
                    aluguelBase += 250;
                }
                if (numVeiculos > 2) {
                    aluguelBase += 60 * (numVeiculos - 2);
                }
                break;
        }
        return aluguelBase;
    }

    public void setTipoLugar(String tipoLugar) {
        this.tipoLugar = tipoLugar;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public void setGaragem(String garagem) {
        this.garagem = garagem;
    }

    public void setNumVeiculos(int numVeiculos) {
        this.numVeiculos = numVeiculos;
    }
}
