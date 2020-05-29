
package ejermunicipali;


public class Pago {
    private int demora;
    private double importe;
    private double interesesAdicionales;

    
    public Pago()
    {
    demora =0;
    importe=0;
    interesesAdicionales=0;
    }
    
    public Pago(int demora, double importe, double interesesAdicionales) {
        this.demora = demora;
        this.importe = importe;
        this.interesesAdicionales = interesesAdicionales;
    }

    
    public int getDemora() {
        return demora;
    }

    public void setDemora(int demora) {
        this.demora = demora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getInteresesAdicionales() {
        return interesesAdicionales;
    }

    public void setInteresesAdicionales(double interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }

    @Override
    public String toString() {
        return "Pago{" + "la demora es= " + demora + ",Su importe es= " + importe + ",El intereses Adicional es= " + interesesAdicionales + '}';
    }
    
    
}
