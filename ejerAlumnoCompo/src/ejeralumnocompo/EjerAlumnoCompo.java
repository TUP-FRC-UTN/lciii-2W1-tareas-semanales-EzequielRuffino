
package ejeralumnocompo;

import java.util.Scanner;

public class EjerAlumnoCompo {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Ingrese cantidad de alumnos a cargar: ");
        int cant= sc.nextInt();
        System.out.println("Ingrese nombre del curo: ");
        sc.nextLine();
        String nombre=sc.nextLine();       
        System.out.println("CARGA DE ALUMNOS DEL: " + nombre);
        Curso c=new Curso(nombre, cant);
        
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese nombre del Alumno: " + (i+1));    
            sc.next();
            String nombreAlum=sc.nextLine();           
            //String nombreAlum=sc.next();
            System.out.println("Ingrese legajo del Alumno: " + (i+1));
            int legajo= sc.nextInt();
            System.out.println("Ingrese promedio del Alumno: " + (i+1));
            double promedAlumn=sc.nextDouble();
            
            Alumno alum=new Alumno(nombreAlum, legajo, promedAlumn);
            c.agregarAlumnos(alum);        
        }
        
        System.out.println("Listado de Alumnos: " + c.listadoAlumno());
        System.out.println("Promedio general curso: " + c.promedioGneral());
        System.out.println("Cantidad de alumnos con promedio mayor a 8: " + c.cantAlumPromedioMasOcho());
                

    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
