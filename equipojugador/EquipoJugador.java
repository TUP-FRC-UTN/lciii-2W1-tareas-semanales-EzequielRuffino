package equipojugador;

import java.util.Scanner;

public class EquipoJugador {

    public static void main(String[] args) {
        Jugadores[] equipo;

        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Ingrese cantidad de jugadores: ");
        int cantidad = sc.nextInt();
        equipo = new Jugadores[cantidad];

        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingrese nombre jugador " + i + ":");
            sc.nextLine();
            String nombre = sc.nextLine();

            System.out.println("Ingrese posicion jugador " + i + ":");
            int posicion = sc.nextInt();

            System.out.println("Ingrese numero camiseta jugador " + i + ":");
            int nroCamiseta = sc.nextInt();

            System.out.println("Ingrese cantidad partidos jugados jugador " + i + ":");
            int cantPartidos = sc.nextInt();

            System.out.println("Ingrese porcentaje estado fisico jugador " + i + ":");
            int porcEstadFisico = sc.nextInt();

            equipo[i] = new Jugadores(nombre, posicion, nroCamiseta, cantPartidos, porcEstadFisico);
        }

        for (int i = 0; i < equipo.length; i++) {
            System.out.println(equipo[i]);

        }

        int cantmenos10partidos = 0;
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getCantPartiJugafos() < 10) {
                cantmenos10partidos++;
            }
        }
        System.out.println("Cantidad de jugadores con menos de 10 partidos:" + cantmenos10partidos);

        Jugadores jugadorComMasPartidosjugados = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if (jugadorComMasPartidosjugados.getCantPartiJugafos() < equipo[i].getCantPartiJugafos()) {
                jugadorComMasPartidosjugados = equipo[i];
            }
        }
        System.out.println("El jugador con mas partidos jugados es" + jugadorComMasPartidosjugados);

        double promedio = 0;
        int suma = 0;
        for (int i = 0; i < equipo.length; i++) {
            suma += equipo[i].getPorcEstadoFijo();

        }
        promedio = (double) suma / equipo.length;
        System.out.println("El promedio de estado fisico es: " + promedio);

        System.out.println("Ingrese numero camiseta para conocer estado fisico");
        int nroCamiseta = sc.nextInt();

        Jugadores j = equipo[0];
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getNroCamisa() == nroCamiseta) {
                j = equipo[i];
                break;
            }
        }
        System.out.println("Estado fisico de ese jugador: " + j.getPorcEstadoFijo());

        //ARQUERO
        double promedioArq = 0, sumaArq = 0;
        int contArq = 0;
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getPosicion() == 1) {
                sumaArq += equipo[i].getCantPartiJugafos();
                contArq++;
            }
        }
        promedioArq = (double) sumaArq / contArq;
        System.out.println("Promedio de partidos jugados en posición ARQUERO:" + promedioArq);

        //DEFENSOR
        double promedioDef = 0, sumaDef = 0;
        int contDef = 0;
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getPosicion() == 2) {
                sumaDef += equipo[i].getCantPartiJugafos();
                contDef++;
            }
        }
        promedioDef = (double) sumaDef / contDef;
        System.out.println("Promedio de partidos jugados en posición DEFENSOR:" + promedioDef);

        //MEDIOCAMPO
        double promedioMed = 0, sumaMed = 0;
        int contMedCamp = 0;
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getPosicion() == 3) {
                sumaMed += equipo[i].getCantPartiJugafos();
                contMedCamp++;
            }
        }
        promedioMed = (double) sumaMed / contMedCamp;
        System.out.println("Promedio de partidos jugados en posición MEDIOCAMP0:" + promedioMed);
        //DELANTERO     
        double promedioDel = 0, sumaDel = 0;
        int contDel = 0;
        for (int i = 0; i < equipo.length; i++) {
            if (equipo[i].getPosicion() == 4) {
                sumaDel += equipo[i].getCantPartiJugafos();
                contDel++;
            }
        }
        promedioDel = (double) sumaDel / contDel;
        System.out.println("Promedio de partidos jugados en posición DELANTERO:" + promedioDel);

    }

}
