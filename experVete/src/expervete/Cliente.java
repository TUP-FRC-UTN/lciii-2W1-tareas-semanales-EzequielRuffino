package expervete;

public class Cliente {

    private int numCliente;
    private String nomCliente;
    private int antiguedad;
    private Mascota mascotas;

    public int getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getNomCliente() {
        return nomCliente;
    }

    public void setNomCliente(String nomCliente) {
        this.nomCliente = nomCliente;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Mascota getMascotas() {
        return mascotas;
    }

    public void setMascotas(Mascota mascotas) {
        this.mascotas = mascotas;
    }

    public Cliente() {
        numCliente = 0;
        nomCliente = "";
        antiguedad = 0;
        mascotas = new Mascota();
    }

    public Cliente(int numCliente, String nomCliente, int antiguedad, Mascota mascotas) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.antiguedad = antiguedad;
        this.mascotas = mascotas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "numCliente=" + numCliente + ", nomCliente=" + nomCliente + ", antiguedad=" + antiguedad + ", mascotas=" + mascotas + '}';
    }

}
