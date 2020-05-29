package ejermunicipali;

public class Municipalidad {

    private Plan[] planes;//arrelgo de tipo plan

    public Municipalidad(int tamaño) {//creo un constructor,//dimensiono e inicializo el array de planes
        planes = new Plan[tamaño];

    }


    public void agregarPlan(Plan plan) {//metodo que recibe un plan y lo pone en una posicion
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] == null) {
                planes[i] = plan;
                break;
            }

        }
    }

    /*Cantidad de planes pagados en su totalidad (es decir, que tengan tantos
       pagos recibidos como la cantidad de cuotas pactadas)*/
    public int cantidadPlanesPagados() {
        int cantidadPagados = 0;
        for (int i = 0; i < planes.length; i++) {
            //if(planes[i] != null && planes[i].estaPagadoTotalmente())
            if (planes[i] != null) {
                if (planes[i].estaPagadoTotalmente() == true) {
                    cantidadPagados++;
                }
            }
        }
        return cantidadPagados;
    }

    /* Promedio general de intereses adicionales cobrados */
    public double promedioIntereses() {
        double totalIntereses = 0;
        double promIntereses = 0;
        int contadorPlanes = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                totalIntereses += planes[i].sumaInteresesCobrados();
                contadorPlanes++;
            }
        }

        if (contadorPlanes == 0) {
            return 0;

        } else {
            return promIntereses=totalIntereses / contadorPlanes;
        }
    }

    /* Sumatoria de las deudas registradas*/
    public double sumatoriaDeuda() {
        double totalSumatoria = 0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null) {
                totalSumatoria += planes[i].getDeuda();
            }
        }
        return totalSumatoria;
    }

    /* Listado de todos los pagos efectuados por un contribuyente en particular*/

    public String listadoPagosContribuyente(String nombre) {
        String lista = "";
        for (int i = 0; i < planes.length; i++) {
            if (planes[i] != null && (planes[i].getNombre().equals(nombre))) {
                lista = planes[i].listadoPagos();
                break; //importante!!!
            } else {
                lista = "El contribuyente " + nombre + " no tiene un plan registrado!";
            }
        }
        return lista;
    }
}
