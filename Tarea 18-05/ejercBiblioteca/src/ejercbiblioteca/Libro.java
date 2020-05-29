package ejercbiblioteca;

public class Libro {

    private String titulo;
    private int precio;
    private int estado;
    Prestamo[] prestamo;
    
    public Libro(){}
    
    public Libro(String titulo, int precio, int cantPrestamos) {//no lo pido por constructor porque todo van a estar disponible 
        this.titulo = titulo;
        this.precio = precio;
        this.estado = 1;//disponible

        this.prestamo = new Prestamo[cantPrestamos];
    }

    public void agregarPrestamo(Prestamo p) {
        for (int i = 0; i < prestamo.length; i++) {
            if (prestamo[i] == null) {
                prestamo[i] = p;
                break;
            }
        }
    }

    //setter para cambiar de estado
    public void cambiarEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return this.estado;
    }

    public int getPrecio() {
        return this.precio;

    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", precio=" + precio + ", estado=" + estado + '}';
    }

   public String getTitulo() {
       return this.titulo;
    }
   
   public String listadoDeSolicitantes(){
       String resultado="";
       //recorrer lista de prestamos y devolver todos los solicitantes
       for (int i = 0; i < prestamo.length; i++) {
          String solicitante = prestamo[i].getSolicitante();
          resultado += solicitante + '-';
       }
       return resultado;
   }

   public int cantPrestamos(){
   return prestamo.length;
   }
}
