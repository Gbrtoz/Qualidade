# Exercício individual - Testes Automatizados (CALCULADORA)

 * @author Gabrtoz
 * @version 3.0

## Descrição

Testes realizados para a execução de um exemplo de processo que realizará calculos matemáticos conforme seus nomes.

## Testes

Testes realizados para que verifique o funcionamento da calculadora. Geraldo resultados corretos e tratamentos de erros (caso ocorra).

# Classe teste

    // Soma
    * @parametro A numero principal a ser somado
	* @parametro B numero somador
    public int somar(int a, int b) {
        return a + b;
    }

    // Sub
    * @parametro A numero principal a ser subtraido
	* @parametro B numero de subtração
	* @return = resultado
    public int subtrair(int a, int b) {
        return a - b;
    }
    
    // Multi
    * @parametro A numero principal a ser multiplicado
	* @parametro B numero de multiplicação
	* @return = resultado
    public int multiplicar(int a, int b) {
        return a * b;
    }
    // Divisão
    * @parametro A numero principal a ser dividido
	* @parametro B numero de divisão
	* @return = resultado
    public int dividir(int a, int b) {
        return a / b;
    }

}

# Classe Divisão

public class Divisao {

    public static void main(String[] args) {
        Teste calc = new Teste();

        // Teste - 1
        *@num1 primeiro número de teste
        *@num2 segundo número de teste
        int div = calc.dividir(8, 4);
        System.out.println("Resultado de 8 / 4: " + div);

        // Teste - 2
        *@num1 primeiro número de teste
        *@num2 segundo número de teste
        div = calc.dividir(0,10);
        System.out.println("0 / 10: " + div);

        // Teste - 3
        *@num1 primeiro número de teste
        *@num2 segundo número de teste
        div = calc.dividir(10, 10);
        System.out.println("10 / 10: " + div);

        // Teste - 4
        *@num1 primeiro número de teste
        *@num2 segundo número de teste
        div = calc.dividir(10, -10);
        System.out.println("10 / -10: " + div);

        // Teste - 5
        *@num1 primeiro número de teste
        *@num2 segundo número de teste
        div = calc.dividir(10, 15);
        System.out.println("10 / 15: " + div);
    }
}

# Classe Multi

public class Multi {
    
    public static void main(String[] args) {
        Teste calc = new Teste();

        //Teste - 1
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        int mult = calc.multiplicar(10,3);
        System.out.println("10 * 3: " + mult);

        //Teste - 2
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        mult = calc.multiplicar(10,0);
        System.out.println("10 * 0: " + mult);

        //Teste - 3        
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        mult = calc.multiplicar(0,0);
        System.out.println("0 * 0: " + mult);

        //Teste - 4
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        mult = calc.multiplicar(10,-5);
        System.out.println("10 * (-5): " + mult);
    }
}

# Classe Soma

public class Soma {
    
    public static void main(String[] args) {
        Teste calc = new Teste();

        //Teste - 1 - Com dois números
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        int soma = calc.somar(10,10);
        System.out.println("10 +10: " + soma);

        //Teste - 2 - Dois números com zero
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        soma = calc.somar(10,0);
        System.out.println("10 + 0: " + soma);

        //Teste - 3 -  Dois números ambos zeros
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        soma = calc.somar(0,0);
        System.out.println("0 + 0: " + soma);

        //Teste - 4 - Dois valores com um negativo
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

        soma = calc.somar(10,-1);
        System.out.println("10 -1: " + soma);
    }
    
}

# Classe Sub

public class Sub {

  public static void main(String[] args) {
    Teste calc = new Teste();

    // Teste - 1
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

    int sub = calc.subtrair(10, 2);
    System.out.println("10 - 2: " + sub);

    // Teste - 2
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

    sub = calc.subtrair(10, 0);
    System.out.println("10 - 0: " + sub);

    // Teste - 3
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

    sub = calc.subtrair(0, 0);
    System.out.println("0 - 0: " + sub);

    // Teste - 4
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

    sub = calc.subtrair(10, -5);
    System.out.println("10 + 5: " + sub);

    // Teste - 5
        *@num1 primeiro número de teste
        *@num2 segundo número de teste

    sub = calc.subtrair(10, 10);
    System.out.println("10 - 10: " + sub);
  }
}

## Última atualização 07/11/2023