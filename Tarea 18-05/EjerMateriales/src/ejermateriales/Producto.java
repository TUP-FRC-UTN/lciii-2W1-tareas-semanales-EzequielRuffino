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
public class Producto {
    private String descripción; 
    private Material [] materiales;
    
    
    // Desarrolle en la clase Producto un constructor que reciba por parámetro
    // una cantidad de elementos y dimensione el vector de materiales.
    public Producto(String descripcionProducto, int tamanio) {
        this.descripción = descripcionProducto;
        materiales = new Material[tamanio];

    }
    
    // Desarrolle en la clase Producto un método que permita
    // agregar un Material recibido por parámetro al vector.
    public void agregraMaterial(Material m) {
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] == null) {
                materiales[i] = m;
                break;
            }

        }
    }
    
    
    // Desarrolle en la clase Producto un método que retorne el costo total. 
    // Dicho valor se calcula sumando todos los valores unitarios de los Materiales que componen el Producto.
    public double costoTotal() {
        double acuValor = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null) {
                acuValor += materiales[i].getValorUnitario();
            }

        }
        return acuValor;
    }
    
    // Desarrolle en la clase Producto un método que reciba por parámetro 
    // un código de material y retorne true si dicho material forma parte del Producto
    public boolean formaParte(int codigo) {

        boolean formaParte = false;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getCódigo()== codigo) {
                formaParte = true;

                break;
            }

        }
        return formaParte;
    }

    
     //Desarrolle en la clase producto un método que retorne un vector con todos 
    //los materiales que tengan un valor unitario menor a un parámetro.

    public Material[] menorValor(double valorComparacion) {
        Material[] materialesVaratos = new Material[materiales.length];
        int proximaPosicion = 0;
        for (int i = 0; i < materiales.length; i++) {
            if (materiales[i] != null && materiales[i].getValorUnitario() < valorComparacion) {
                materialesVaratos[proximaPosicion] = materiales[i];
                proximaPosicion++;
            }
        }
        return materialesVaratos;
    }
    
     //*Metodo que retorna un vector con cantidad de Materiales segun rango de precios*/
        public int [] rangoPrecio()
     {
         //int c[] = {0 , 0 , 0 , 0};
         int [] rangoPrecio = new int [4];
         
         for (int i = 0; i < materiales.length; i++) {
             if(materiales[i] != null)
             {
                 if(materiales[i].getValorUnitario() > 0 &&  materiales[i].getValorUnitario() <= 10)
                     //c[0]++;
                     rangoPrecio[0]++;
                 else if(materiales[i].getValorUnitario() > 10 &&  materiales[i].getValorUnitario() <= 20)
                     //c[1]++;
                     rangoPrecio[1]++;
                 else if(materiales[i].getValorUnitario() > 20 &&  materiales[i].getValorUnitario() <= 30)
                     //c[2]++;
                     rangoPrecio[2]++;
                 else 
                     //c[3]++;
                     rangoPrecio[3]++;
             }
             
         }
         
         return rangoPrecio;
     }
    
    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }
    
    
    
    
    
    
    
    
}
