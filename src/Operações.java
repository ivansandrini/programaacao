public class Operações
{
    private double resultado;


    public void Soma(double valor1, double valor2)
    {

        this.resultado = valor1 + valor2;

    }

    public void Subtracao(double valor1, double valor2)
    {
        this.resultado = valor1 - valor2;
    }

    public double Multiplicacao(double valor1, double valor2)
    {
        return this.resultado = valor1 * valor2;
    }

    public double Divisao(double valor1, double valor2)
    {
        return this.resultado = valor1 / valor2;
    }

    public double getResultado()
    {
        return resultado;
    }


}
