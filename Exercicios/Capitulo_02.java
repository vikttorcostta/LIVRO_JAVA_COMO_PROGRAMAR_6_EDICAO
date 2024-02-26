package Exercicios;
import  java.util.Scanner;
public class Capitulo_02 {

    //CLASSES DE EXERCICIOS E EXEMPLOS
    public void Welcome_01()
    {
        System.out.println("Welcome to java programming!");
    }

    //EXIBIÇÃO NA TELA
    public void Welcome_02()
    {
        System.out.println("Welcome to ");
        System.out.println("Java programming");
    }

    //EXIBIÇÃO NA TELA
    public void Welcome_03()
    {
        System.out.println("Welcome\nto\njava\nprogramming");
    }


    //EXIBIÇÃO NA TELA
    public void Welcome_04()
    {
        System.out.printf("%s\n%s\n","Welcome to ","java programming");
    }

    //ADIÇÃO
    public void Addition()
    {

        Scanner entrada_dados = new Scanner(System.in);

        int primeiro_numero;
        int segundo_numero;
        int soma;

        System.out.print("Entre com o primeiro numero --> ");
        primeiro_numero = entrada_dados.nextInt();

        System.out.print("Entre com o segundo numero --> ");
        segundo_numero = entrada_dados.nextInt();

        soma = primeiro_numero + segundo_numero;

        System.out.printf("A SOMA É %d\n", soma);

    }

    //COMPARAÇÃO
    public void Comparison()
    {
        Scanner entrada_dados = new Scanner(System.in);

        int primeiro_numero;
        int segundo_numero;

        System.out.print("Entre com o primeiro numero --> ");
        primeiro_numero = entrada_dados.nextInt();

        System.out.print("Entre com o segundo numero -->");
        segundo_numero = entrada_dados.nextInt();

        if (primeiro_numero == segundo_numero){
            System.out.printf("%d == %d\n", primeiro_numero, segundo_numero);
        }
        if (primeiro_numero != segundo_numero){
            System.out.printf("%d != %d\n", primeiro_numero, segundo_numero);
        }
        if (primeiro_numero < segundo_numero){
            System.out.printf("%d < %d\n", primeiro_numero, segundo_numero);
        }
        if (primeiro_numero > segundo_numero){
            System.out.printf("%d > %d\n",primeiro_numero, segundo_numero);
        }
        if (primeiro_numero <= segundo_numero){
            System.out.printf("%d <= %d\n", primeiro_numero, segundo_numero);
        }
        if(primeiro_numero >= segundo_numero){
            System.out.printf("%d >= %d\n",primeiro_numero, segundo_numero);
        }
    }


}
