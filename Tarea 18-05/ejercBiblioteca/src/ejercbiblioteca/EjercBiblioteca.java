package ejercbiblioteca;

import java.util.Scanner;

public class EjercBiblioteca {
    
    public static void main(String[] args) {
       /* Biblioteca bib = new Biblioteca(2);
        
        //predstamos para asignar libro
        Prestamo p1= new Prestamo("juan",10,false);
        Prestamo p2= new Prestamo("dario",0,true);
        
        Prestamo p3= new Prestamo("eze",3,false);

       //Estados - 1: disponible, 2: prestado, 3: extraviado
        //listado de libres en la biblioteca
        Libro a = new Libro("Aaa", 99, 2);
        a.cambiarEstado(3);
        //agrego prestamos a libro a
        a.agregarPrestamo(p1);
        a.agregarPrestamo(p2);
        
        Libro b = new Libro("Bbb", 20, 1);
        //agrego prestamos a libro b
        b.cambiarEstado(3);
        b.agregarPrestamo(p3);
        
        bib.agregarLibro(a);
        bib.agregarLibro(b);
        
        //aca termina listado de libros agragados
        
        System.out.println(bib.ListadoLibros());
        
        //Listado de libros por estado
        System.out.println("Listado de libros por estado");
        int[] resultado = bib.cantidadLibrosPorEstado();

        //recorrido del resultado
        for (int i = 0; i < resultado.length; i++) {
            {
                System.out.println("Libros de estado " + (i + 1));
                System.out.println(resultado[i]);
            }
        }
        //sumatoria de precio de extraviados
        System.out.println("Sumatoria de precios de reposicion de extrabiados");
        System.out.println(bib.sumaPrecioExtrabiados());
          //listado de solicitantes por titulo
        System.out.println("El listado de solicitantes por titulo es: ");
        System.out.println(bib.listadoDeSolicitantes("Aaa"));
        
        //promedio de prestamos de los libros
        System.out.println("El promedio de prestamos");
        System.out.println(bib.promedioPrestamo());
        */
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantos libros desea cargar: ");
        int cantLibros= sc.nextInt();
        //Libro l[] = new Libro[cantLibros];
        Biblioteca bli=new Biblioteca(cantLibros);
        for (int i = 0; i < cantLibros; i++) {
            System.out.println("Nombre del libro" + (i+1));
            sc.nextLine();
            String nombre=sc.nextLine();
            System.out.println("Ingrese precio: ");
            int precio=sc.nextInt();
            System.out.println("Cnatidad de prestamos: ");
            int cantPrestamos=sc.nextInt();
            Libro libros=new Libro(nombre, precio,cantPrestamos);
            //l[i] = libros;
            System.out.println("Cambiar estado: ");
            int estado=sc.nextInt();
            libros.cambiarEstado(estado);
            
            for (int j = 0; j < cantPrestamos; j++) {
                System.out.println("Nomnre del solicitante: ");
                sc.nextLine();
                String nomSolici=sc.nextLine();
                System.out.println("Dias: ");
                int cantDias=sc.nextInt();
                System.out.println("Devuelto: ");
                boolean devuelto=sc.nextBoolean();
                Prestamo prestamos=new Prestamo(nomSolici, cantDias, devuelto);
                
                libros.agregarPrestamo(prestamos);
                
            }
                    
            bli.agregarLibro(libros);
            
        }
        
        System.out.println(bli.ListadoLibros());

        
        System.out.println("Listado de libros por estado");
        int[] resultado = bli.cantidadLibrosPorEstado();

        //recorrido del resultado
        for (int i = 0; i < resultado.length; i++) {
            {
                System.out.println("Libros de estado " + (i + 1));
                System.out.println(resultado[i]);
            }
        }
        //sumatoria de precio de extraviados
        System.out.println("Sumatoria de precios de reposicion de extrabiados: " + bli.sumaPrecioExtrabiados());
 
        //listado de solicitantes por titulo
        System.out.println("Nombre del libro");
        sc.nextLine();
        String busqueda=sc.nextLine();
        System.out.println("El listado de solicitantes del libro " + busqueda + " es: ");
        System.out.println(bli.listadoDeSolicitantes(busqueda));
       
        //promedio de prestamos de los libros
        System.out.println("El promedio de prestamos: " + bli.promedioPrestamo());
        
        
        
        
        
        
        
        
        
        
    }

    
    
    
}
