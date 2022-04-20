import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Operações operacao = new Operações();
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe dois valores");
        double valor1 = ler.nextDouble();
        double valor2 = ler.nextDouble();

        System.out.println("Escolha uma operação: ");
        System.out.println("1 para Soma");
        System.out.println("2 para Subtração");
        System.out.println("3 para Multiplicação");
        System.out.println("4 para Divisão");

        double resposta = ler.nextDouble();

        switch ((int) resposta)
        {
            case 1:
                operacao.soma(valor1, valor2);
                break;
            case 2:
                operacao.subtracao(valor1, valor2);
                break;
            case 3:
                operacao.multiplicacao(valor1, valor2);
                break;
            case 4:
                operacao.divisao(valor1, valor2);
                break;
        }


        System.out.println(operacao.getResultado());


    }
}