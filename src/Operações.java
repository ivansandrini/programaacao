public class Operações
{
    private double resultado;


    public void soma(double valor1, double valor2)
    {

        this.resultado = valor1 + valor2;

    }

    public void subtracao(double valor1, double valor2)
    {
        this.resultado = valor1 - valor2;
    }

    public double multiplicacao(double valor1, double valor2)
    {
        return this.resultado = valor1 * valor2;
    }

    public double divisao(double valor1, double valor2)
    {
        return this.resultado = valor1 / valor2;
    }

    public double getResultado()
    {
        return resultado;
    }


}
