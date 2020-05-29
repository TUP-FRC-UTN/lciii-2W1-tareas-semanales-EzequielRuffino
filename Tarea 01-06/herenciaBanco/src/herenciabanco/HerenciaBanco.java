package herenciabanco;

import java.util.Scanner;

public class HerenciaBanco {

    public static void main(String[] args) {
        //no puede hacer new Cuenta porque es abstracta tengo que usar las clases dereivadas

        Cuenta c1 = new CajaAhorro();
        Cuenta c2 = new CajaAhorro();
        Cuenta c3 = new CuentaCorriente(-100);

        //c1.setNombre("C1");
        c1.depositar(1000);//ponemos
        c1.extraer(500);//sacamos
        c1.extraer(9000);//sacamos, no vamos a poder sacar 9000

        //c1.setNombre("C2");
        c2.depositar(10);

        //c1.setNombre("C3");
        c3.depositar(50);
        c3.extraer(100);

        //   System.out.println("Cienta corriente c3: " + c3.getSaldo());
        //   System.out.println("Cuenta c1: " + c1.getSaldo());
        Cuenta[] cuentas = new Cuenta[3];
        cuentas[0] = c1;
        cuentas[1] = c2;
        cuentas[2] = c3;

        for (int i = 0; i < cuentas.length; i++) {
            Cuenta c = cuentas[i];
            c.depositar(1);// es polimorfico por depositar esta en todas las cuentas hijas depositamos 1 peso

            System.out.println(cuentas[i].getSaldo());//get.saldo no es polimmorfico es de la clase padre

        }

    }
}
