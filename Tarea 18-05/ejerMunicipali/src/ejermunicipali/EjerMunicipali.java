package ejermunicipali;

import java.util.Scanner;

public class EjerMunicipali {

    public static void main(String[] args) {
        /*Scanner sc = new Scanner (System.in);
        int tamanio = 2; //cantidad de planes a cargar
        Municipalidad muni = new Municipalidad(tamanio);
        
        //carga de los datos por parte del usuario del plan1
        Plan plan1 = new Plan("christian", 1000, 3);
        Pago pago1 = new Pago(3,150,0.5);
        Pago pago2 = new Pago(2,150,0.5);
        Pago pago3 = new Pago(0,700,0.5);
        
        //agrego los 3 pagos al plan1
        plan1.agregarPagp(pago1);//recibe el objeto pago como parametro
        plan1.agregarPagp(pago2);
        plan1.agregarPagp(pago3);
        
        //agregar el plan1 a la municipalidad
        muni.agregarPlan(plan1);//recibe el objeto plan como parametro
        
        //-----------------------------------------------------------------------------------
        //carga de los datos por parte del usuario del plan2
        Plan plan2 = new Plan("ana", 2000, 4);
        Pago pago21 = new Pago(2,500,0.5);
        Pago pago22 = new Pago(5,300,0.5);
        Pago pago23 = new Pago(1,700,0.5);
        Pago pago24 = new Pago(2,500,0.5);
        
        //agrego los 4 pagos al plan2
        plan2.agregarPagp(pago21);//recibe el objeto pago como parametro
        plan2.agregarPagp(pago22);
        plan2.agregarPagp(pago23);
        plan2.agregarPagp(pago24);
        
        //agregar el plan2 a la municipalidad
        muni.agregarPlan(plan2);//recibe el objeto plan como parametro
        
        //1
        System.out.println("1-La cantidad de planes pagados totalmente es de: " + muni.cantidadPlanesPagados());
        
        //2
        System.out.println("2-La sumatoria de todas las deudas registradas es: " + muni.sumatoriaDeuda());
        
        //3
        System.out.println("Ingrese un contribuyente: ");
        String nombre = sc.nextLine();
        System.out.println("3-El listado de todos los pagos efectuados por el contribuyente '"+ nombre +"' son: \n" + muni.listadoPagosContribuyente(nombre));
        
        //4
        System.out.println("4-El promedio de intereses pagados por los contribuyentes es: " + muni.promedioIntereses());*/
                Scanner sc = new Scanner(System.in);

        System.out.println("¿Cuantos planes desea cargar?");
        int cantPlanes = sc.nextInt();

        Municipalidad muni = new Municipalidad(cantPlanes);

        for (int i = 0; i < cantPlanes; i++) {
            
            System.out.println("Nombre del contribuyente del plan " + (i+1));// el i + 1 hace que el plan empieze en 1 y no en 0
            sc.nextLine();
            String nom = sc.nextLine();
            System.out.println("Total de su deuda");
            double deu = sc.nextDouble();
            System.out.println("Cantidad de cuotas en total");
            int cantCuotas = sc.nextInt();
            Plan plan = new Plan(nom, deu, cantCuotas);

            for (int j = 0; j < cantCuotas; j++) {
                System.out.println("Dias de demora del pago de la cuota " + (j+1));
                int dem = sc.nextInt();
                System.out.println("Importe pagado");
                double importe = sc.nextDouble();
                System.out.println("Intereses Adicionales");
                double intAdiciona=sc.nextDouble();

                Pago pago = new Pago(dem, importe,intAdiciona);
                plan.agregarPagp(pago);
            }
            muni.agregarPlan(plan);
        }
        sc.nextLine();
        System.out.println("Ingrese el nombre del contribuyente que desee buscar");
        String nombre = sc.nextLine();    
        System.out.println("Planes pagados en total: " + muni.cantidadPlanesPagados());
        System.out.println("Promedio general de los intereses: " + muni.promedioIntereses());
        System.out.println("Todos los pagos efectuados por " + muni.listadoPagosContribuyente(nombre));
        System.out.println("Total de deudas: " + muni.sumatoriaDeuda());
        
    
        
    
        
    }

}
