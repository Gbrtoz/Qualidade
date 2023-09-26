package com.mycompany.calculadora;

public class Soma {
    
    public static void main(String[] args) {
        Teste calc = new Teste();

        //Teste - 1 - Com dois números
        int soma = calc.somar(10,10);
        System.out.println("10 +10: " + soma);

        //Teste - 2 - Dois números com zero
        soma = calc.somar(10,0);
        System.out.println("10 + 0: " + soma);

        //Teste - 3 -  Dois números ambos zeros
        soma = calc.somar(0,0);
        System.out.println("0 + 0: " + soma);

        //Teste - 4 - Dois valores com um negativo
        soma = calc.somar(10,-1);
        System.out.println("10 -1: " + soma);
    }
    
}
