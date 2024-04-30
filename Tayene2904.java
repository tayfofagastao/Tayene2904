package Tayene;

import java.util.HashMap;
import java.util.Scanner;

public class Tayene2904 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do carro: R$ ");
        double valor_base = scanner.nextDouble();

        double preco_a_vista = valor_base * 0.80;
        System.out.printf("Preço à vista (desconto de 20%%): R$ %.2f%n", preco_a_vista);

        HashMap<Integer, Double> acrescimos = new HashMap<>();
        acrescimos.put(6, 1.05);
        acrescimos.put(12, 1.10);
        acrescimos.put(18, 1.15);
        acrescimos.put(24, 1.20);
        acrescimos.put(30, 1.25);
        acrescimos.put(36, 1.30);
        acrescimos.put(42, 1.35);
        acrescimos.put(48, 1.40);
        acrescimos.put(54, 1.45);
        acrescimos.put(60, 1.50);

        System.out.println("\nTabela de financiamento:");
        System.out.println("Parcelas | Preço Final | Valor da Parcela");

        for (Integer parcelas : acrescimos.keySet()) {
            double acrescimo = acrescimos.get(parcelas);
            double preco_final = valor_base * acrescimo;
            double valor_da_parcela = preco_final / parcelas;
            System.out.printf("%8d | R$ %10.2f | R$ %.2f%n", parcelas, preco_final, valor_da_parcela);
        }

        scanner.close();
    }

}
