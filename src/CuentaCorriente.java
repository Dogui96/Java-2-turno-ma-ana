public class CuentaCorriente
{
    private double saldo;

    public CuentaCorriente(){};

    public CuentaCorriente(double s)
    {
        this.setSaldo(s);
    }

    public CuentaCorriente(CuentaCorriente cuenta)
    {
        this.setSaldo(cuenta.getSaldo());
    }

    public double getSaldo()
    {
        return saldo;
    }

    public void setSaldo(double s)
    {
        saldo = s;
    }

    public void ingreso(double i)
    {
        saldo =+ i;
    }

    public void egreso(double e)
    {
        saldo -= e;
    }

    public void reintegro(double r)
    {
        saldo =+ r;
    }

    public void transferencia(CuentaCorriente ctaOrigen, double valor)
    {
        this.setSaldo(this.getSaldo() + valor);
        ctaOrigen.setSaldo(ctaOrigen.getSaldo() - valor);
    }

    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(100);

        cuenta1.ingreso(1000);
        cuenta1.egreso(500);
        cuenta1.transferencia(cuenta2, 90);
        System.out.println("Cuenta 1 " + cuenta1.getSaldo());
        System.out.println("cuenta 2 " + cuenta2.getSaldo());

    }



}
