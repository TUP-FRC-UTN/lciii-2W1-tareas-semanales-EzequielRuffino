package expervete;

import java.util.Scanner;

public class ExperVete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente clientes[];
        System.out.println("Ingrese cantidad de clientes: ");
        int cantCli = sc.nextInt();
        clientes = new Cliente[cantCli];

        for (int i = 0; i < clientes.length; i++) {
            Cliente cli = new Cliente();
            System.out.println("Ingrese código del Cliente:");
            cli.setNumCliente(sc.nextInt());
            System.out.println("Ingrese nombre del cliente:");
            sc.nextLine();
            cli.setNomCliente(sc.nextLine());
            System.out.println("Ingrese antiguedad en años del cliente:");
            cli.setAntiguedad(sc.nextInt());

            Mascota masc = new Mascota();
            System.out.println("Ingrese nombre de la mascota:");
            sc.nextLine();
            masc.setNomMascota(sc.nextLine());
            System.out.println("Ingrese edad de la mascota:");
            masc.setEdadMasco(sc.nextInt());

            cli.setMascotas(masc);
            clientes[i] = cli;
            System.out.println("Cliente registrado");

        }

        System.out.println("La cantidad de CLIENTES ES: " + cantCli);
        for (int i = 0; i < clientes.length; i++) {
            System.out.println(clientes[i]);
        }
        
        int cantClieAnti=0;
        for (int i = 0; i < clientes.length; i++) {
            if(clientes[i].getAntiguedad() >= 5)
            {
            cantClieAnti++;
            }          
        }
        System.out.println("La cantidad de clientes con una antiguedad mayor igual a 5 son: " + cantClieAnti);
        
         double promEdadMasc = 0;
        int sumEdadMasco = 0;
        for (int i = 0; i < clientes.length; i++) {
            sumEdadMasco += clientes[i].getMascotas().getEdadMasco();
        }
        promEdadMasc = (double) sumEdadMasco / clientes.length;
        System.out.println("El promedio de edad es: " + promEdadMasc);
        
        
    }
}
