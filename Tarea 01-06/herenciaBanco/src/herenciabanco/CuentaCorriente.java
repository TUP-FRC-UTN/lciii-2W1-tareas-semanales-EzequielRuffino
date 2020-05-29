/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciabanco;

/**
 *
 * @author Windows 10
 */
public class CuentaCorriente extends Cuenta {

    private double acuerdo; //acuerdo es negativo

    public CuentaCorriente(double acuerdo) {//nos sirve para poner el valor del acuerdo
        this.acuerdo = acuerdo;
        super.saldo = 0;
    }

    public CuentaCorriente() {

    }

    @Override
    public void depositar(double monto) {
        super.saldo += monto;
    }

    public void setAcuerdo(double acuerdo) {
        this.acuerdo = acuerdo;
    }

    public double getAcuerdo() {
        return acuerdo;
    }

    @Override
    public void extraer(double monto) {
        if ((super.saldo - monto) > this.acuerdo) { //si lo que quiero extraeer es mayor que lo del acuerdo puedo extraer
            super.saldo -= monto;
        } else {
            System.out.println("El monto que desea extraer es mayor al acuerdo");
        }
    }

}
