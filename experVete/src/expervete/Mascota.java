package expervete;

public class Mascota {

    private String nomMascota;
    private int edadMasco;

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }

    public int getEdadMasco() {
        return edadMasco;
    }

    public void setEdadMasco(int edadMasco) {
        this.edadMasco = edadMasco;
    }

    public Mascota() {
        nomMascota = "";
        edadMasco = 0;
    }

    public Mascota(String nomMascota, int edadMasco) {
        this.nomMascota = nomMascota;
        this.edadMasco = edadMasco;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nomMascota=" + nomMascota + ", edadMasco=" + edadMasco + '}';
    }

}
