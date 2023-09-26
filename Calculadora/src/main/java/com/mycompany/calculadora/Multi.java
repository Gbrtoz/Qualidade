package com.mycompany.calculadora;

public class Multi {
    
    public static void main(String[] args) {
        Teste calc = new Teste();

        //Teste - 1
        int mult = calc.multiplicar(10,3);
        System.out.println("10 * 3: " + mult);

        //Teste - 2
        mult = calc.multiplicar(10,0);
        System.out.println("10 * 0: " + mult);

        //Teste - 3
        mult = calc.multiplicar(0,0);
        System.out.println("0 * 0: " + mult);

        //Teste - 4
        mult = calc.multiplicar(10,-5);
        System.out.println("10 * (-5): " + mult);
    }
}