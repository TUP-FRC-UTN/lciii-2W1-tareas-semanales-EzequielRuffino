package herenciabanco;

public abstract class Cuenta {//no tiene sentido que exista esta clase se le pone abstract

    protected int numero;
    protected String nombre;
    protected double saldo;

    public abstract void depositar(double monto);//metodo no quiero que tenga cuerpo, saco llaves y agrago abstract, pero obliga a las hijas a tener esos metodos

    public abstract void extraer(double monto);//igual que el otro metodo

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //no hago setter del saldo
    public double getSaldo() {
        return this.saldo;

    }

    void setAcuerdo(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
