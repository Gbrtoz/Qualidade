package com.mycompany.calculadora;

public class Divisao {

    public static void main(String[] args) {
        Teste calc = new Teste();

        // Teste - 1
        int div = calc.dividir(8, 4);
        System.out.println("Resultado de 8 / 4: " + div);

        // Teste - 2
        div = calc.dividir(0,10);
        System.out.println("0 / 10: " + div);

        // Teste - 3
        div = calc.dividir(10, 10);
        System.out.println("10 / 10: " + div);

        // Teste - 4
        div = calc.dividir(10, -10);
        System.out.println("10 / -10: " + div);

        // Teste - 5
        div = calc.dividir(10, 15);
        System.out.println("10 / 15: " + div);
    }
}