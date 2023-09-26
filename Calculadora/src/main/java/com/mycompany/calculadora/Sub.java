package com.mycompany.calculadora;

public class Sub {

  public static void main(String[] args) {
    Teste calc = new Teste();

    // Teste - 1
    int sub = calc.subtrair(10, 2);
    System.out.println("10 - 2: " + sub);

    // Teste - 1
    sub = calc.subtrair(10, 0);
    System.out.println("10 - 0: " + sub);

    // Teste - 1
    sub = calc.subtrair(0, 0);
    System.out.println("0 - 0: " + sub);

    // Teste - 1
    sub = calc.subtrair(10, -5);
    System.out.println("10 + 5: " + sub);

    // Teste - 1
    sub = calc.subtrair(10, 10);
    System.out.println("10 - 10: " + sub);
  }
}
