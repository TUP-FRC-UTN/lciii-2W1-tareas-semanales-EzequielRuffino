/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejermateriales;

/**
 *
 * @author Windows 10
 */
public class Material {
    private String descripción; 
    private int código; 
    private float valorUnitario;
    

    public Material(String descripción, int código, float valorUnitario) {
        this.descripción = descripción;
        this.código = código;
        this.valorUnitario = valorUnitario;
    }
    
        public Material(){
        this.código = 0;
        this.descripción = "";
        this.valorUnitario = 0;
    }

       
    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public float getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(float valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    @Override
    public String toString() {
        return "Material{" + "descripci\u00f3n=" + descripción + ", c\u00f3digo=" + código + ", valorUnitario=" + valorUnitario + '}';
    }
    
    
    
}
