public class Contador
{
    private int valor;

    public Contador(){};

    public Contador(int v)
    {
        this.setValor(v);
    }

    public Contador(Contador c)
    {
        this.setValor(c.getValor());
    }

    public void setValor(int v)
    {
        this.valor = v;
    }

    public int getValor()
    {
        return valor;
    }

    public void incrementar()
    {
        this.setValor(this.getValor() + 1);
    }

    public void decrementar()
    {
        this.setValor(this.getValor() - 1);
    }
}
