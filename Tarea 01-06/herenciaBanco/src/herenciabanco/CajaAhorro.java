package herenciabanco;

public class CajaAhorro extends Cuenta {

    public CajaAhorro() {
        super.saldo = 0; //con super llamo los atributos de la clase padre
    }

    @Override
    public void depositar(double monto) { //implementa los cuerpos de los metodos dela clase padre
        super.saldo += monto;//suma
        System.out.println("Usted a depositado:" + " " + monto);
        System.out.println("Su saldo actual es de:" + " " + super.saldo);
    }

    @Override
    public void extraer(double monto) { //implementa los cuerpos de los metodos de la clase padre
        if ((super.saldo - monto) >= 0) {//si es un saldo menos el emonto es positivo o cero dejo que extraiga
            super.saldo -= monto;//extraigo
            System.out.println("Usted extrajo:" + " " + monto);
        } else {
            System.out.println("No puede extraer, no tiene saldo suficiente");
        }
    }

}
