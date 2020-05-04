
package equipojugador;

public class Jugadores {
    private String nombre;
    private int posicion;
    private int nroCamisa;
    private int cantPartiJugafos;
    private int porcEstadoFijo;

    public Jugadores(String nombre, int posicion, int nroCamisa, int cantPartiJugafos, int porcEstadoFijo) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.nroCamisa = nroCamisa;
        this.cantPartiJugafos = cantPartiJugafos;
        this.porcEstadoFijo = porcEstadoFijo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getNroCamisa() {
        return nroCamisa;
    }

    public void setNroCamisa(int nroCamisa) {
        this.nroCamisa = nroCamisa;
    }

    public int getCantPartiJugafos() {
        return cantPartiJugafos;
    }

    public void setCantPartiJugafos(int cantPartiJugafos) {
        this.cantPartiJugafos = cantPartiJugafos;
    }

    public int getPorcEstadoFijo() {
        return porcEstadoFijo;
    }

    public void setPorcEstadoFijo(int porcEstadoFijo) {
        this.porcEstadoFijo = porcEstadoFijo;
    }

    @Override
    public String toString() {
        return "Jugadores{" + "nombre=" + nombre + ", posicion=" + posicion + ", nroCamisa=" + nroCamisa + ", cantPartiJugafos=" + cantPartiJugafos + ", porcEstadoFijo=" + porcEstadoFijo + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
