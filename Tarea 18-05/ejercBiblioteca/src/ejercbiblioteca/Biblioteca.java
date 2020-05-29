package ejercbiblioteca;

public class Biblioteca {

    private Libro[] libros;

    public Biblioteca(int cantidad) {
        libros = new Libro[cantidad];

    }

    public void agregarLibro(Libro a) {
        //recorrido secuencial para agregar un libro al vector
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] == null) {
                libros[i] = a;
                break;
            }

        }
    }

    public String ListadoLibros() {
        //recorrido secuencial para mostrar los libros
        String resultado = "";
        for (int i = 0; i < libros.length; i++) {
            if (libros[i] != null) {
                Libro l = libros[i];//l es un libro que esta en la posicion 1
                resultado += l.toString() + '\n';//concateno el libro y hago salto de linea
            }

        }

        return resultado;
    }

    int[] cantidadLibrosPorEstado() {

        int[] resultado = new int[3];
        //recorrer libros de la biblioteca
        //contar los libros de cada estado
        int estado1 = 0, estado2 = 0, estado3 = 0;
        for (int i = 0; i < libros.length; i++) {
            if (libros[i].getEstado() == 1) {
                estado1++;
            } else if (libros[i].getEstado() == 2) {
                estado2++;
            } else {
                estado3++;
            }
        }
        //Asignamos al resultado el valor de los contadores
        resultado[0] = estado1;
        resultado[1] = estado2;
        resultado[2] = estado3;

        return resultado;
    }


    
    public float sumaPrecioExtrabiados() {
        //recdorrer eñ vector
        //seleccionar los libros extraviados
        //acumular precio
        float total = 0;
        for (int i = 0; i < libros.length; i++) {

            if (libros[i] != null && libros[i].getEstado() == 3) {
                total += libros[i].getPrecio();
            }
        }
        return total;
    }

    public String listadoDeSolicitantes(String titulo) {
        String resultado="";
      //recorrer cada libro  filtrar por titulo y pedir listado de solicitanmte  
      
      //recorrido de todos los libros
        for (int i = 0; i < libros.length; i++) {
            
            //TODO: ver la comparacion de dos cadenas
            //comparamos cadenas con equal y no con ==
            if(libros[i]!=null && libros[i].getTitulo().equals(titulo))
            {
            resultado += libros[i].listadoDeSolicitantes();
            }
            
        }
        return resultado;
    }

   public float promedioPrestamo() {
       int acum=0;
       int cont=0;
       //recorro todos los libros y de los que no son nulos acumulo la cantidad de prestamos
       for (int i = 0; i < libros.length; i++) {
           if(libros[i]!=null){
           acum +=libros[i].cantPrestamos();
           }
           
       }
       //asumir que se cargan todos los libros
       cont = libros.length;
       return (float) acum/cont;
    }

}
