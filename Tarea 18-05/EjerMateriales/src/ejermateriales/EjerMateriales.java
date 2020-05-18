package ejermateriales;

import java.util.Scanner;

public class EjerMateriales {

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);
        System.out.println("---Regitro de nuevo productos----");
        int tamanio;
        String descripcionProducto;
        System.out.println("ingrese descripcion del producto ");
        descripcionProducto = sc.nextLine();
        System.out.println("ingrese cantidad de materiales del producto");
        tamanio = sc.nextInt();
        Producto p = new Producto(descripcionProducto, tamanio);

        int contadorRegistros;
        int opcion = 0;
        contadorRegistros = tamanio;

        System.out.println("****MENU OPCIONES****");
        System.out.println("1- agregar materiales al producto, " + contadorRegistros + " registros disponibles");
        System.out.println("2- costo total del producto " + descripcionProducto);
        System.out.println("3- X codigo pertenese o no al producto");
        System.out.println("4- materiales con valor menor a X");
        System.out.println("5- materiales por rango de precio");
        System.out.println("0-salir");

        opcion = sc.nextInt();
        sc.nextLine();//agarrar enter

        while (opcion != 0) {
            switch (opcion) {
                case 1:
                    if (contadorRegistros == 0) {
                        System.out.println("no se pueden agregar mas materiales, quedan " + contadorRegistros + " registros");
                    } else {
                        String descripcionMaterial;
                        int codigo;
                        float valorUnitario;
                        System.out.println("ingrese nombre del material");
                        descripcionMaterial = sc.nextLine();
                        System.out.println("ingrese codigo del material");
                        codigo = sc.nextInt();
                        System.out.println("ingrese valor unitario del material");
                        valorUnitario = sc.nextFloat();
                        Material m = new Material(descripcionMaterial, codigo, valorUnitario);
                        p.agregraMaterial(m);
                        contadorRegistros--;
                    }

                    break;
                case 2:

                    if (contadorRegistros != tamanio) {
                        System.out.println("el costos total del producto " + descripcionProducto + " es $" + p.costoTotal());
                    } else {
                        System.out.println("primero registre un material");
                    }
                    break;
                case 3:
                    if (contadorRegistros != tamanio) {
                        int codigoMat;
                        System.out.println("ingrese codigo del material");
                        codigoMat = sc.nextInt();
                        if (p.formaParte(codigoMat)) {
                            System.out.println(p.formaParte(codigoMat) + ", el material forma parte del producto");
                        } else {
                            System.out.println(p.formaParte(codigoMat) + ", el material NO forma parte del producto");
                        }
                    } else {
                        System.out.println("primero registre un material");
                    }

                    break;
                case 4:
                    if (contadorRegistros != tamanio) {
                        System.out.println("ingrese un valor para comparar");
                        double valorComparacion = sc.nextDouble();
                        Material[] Materiales = p.menorValor(valorComparacion);

                        System.out.println("los materiales con precio menor a " + valorComparacion + " son:");
                        for (int i = 0; i < Materiales.length; i++) {
                            if (Materiales[i] != null) {
                                System.out.println(Materiales[i].toString());

                            }

                        }

                    } else {
                        System.out.println("primero registre un material");
                    }
                    break;
                case 5:
                    if (contadorRegistros != tamanio) {
                        int[] contadores = p.rangoPrecio();
                        System.out.println("Los materiales con valor unitario entre 0 y 10 son : " + contadores[0]);
                        System.out.println("Los materiales con valor unitario entre 10 y 20 son : " + contadores[1]);
                        System.out.println("Los materiales con valor unitario entre 20 y 30 son : " + contadores[2]);
                        System.out.println("Los materiales con valor unitario mayor a 30 son : " + contadores[3]);
                    } else {
                        System.out.println("primero registre un material");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println("");
            System.out.println("****MENU OPCIONES****");
            System.out.println("1- agregar materiales al producto, " + contadorRegistros + " registros disponibles");
            System.out.println("2- costo total del producto " + descripcionProducto);
            System.out.println("3- x codigo pertenese o no al producto");
            System.out.println("4- materiales con valor menor a X");
            System.out.println("5- materiales por rango de precio");
            System.out.println("0-salir");

            opcion = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("adios..");*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("---Regitro de nuevo productos----");
        
        System.out.print("Ingrese la cantidad de materiales: ");
        int cant = sc.nextInt();
        
        System.out.print("Ingrese la descripcion del producto: ");
        sc.nextLine();
        String desc = sc.nextLine();
        
        
        Producto p = new Producto(desc, cant);
        
        for (int i = 0; i < cant; i++) 
        {
           System.out.print("Ingrese La descripcion del material: ");
           
           String mat = sc.nextLine();
           
            System.out.print("Ingrese el codigo: ");
            int codigo = sc.nextInt();
            
            System.out.print("Ingrese el valor unitario: ");
            float valUnit = sc.nextFloat();
            System.out.println("---------------------------------------");
            sc.nextLine();
            Material materiales = new Material(desc, codigo, valUnit);
            
            p.agregraMaterial(materiales);
        }
        int opcion=1;
        while(opcion != 0){
            System.out.println("---------------------------------------");
            System.out.println("Menu");
            System.out.println("1- Ver costo total");
            System.out.println("2- Ver si el material existe");
            System.out.println("3- Comparar precio");
            System.out.println("4- Cantidad de materiales por precio");
            System.out.println("0- ADIOS");
            System.out.print("Pcion elegida: ");
            opcion = sc.nextInt();
            System.out.println("---------------------------------------");
            if(opcion == 1)   
            {
                System.out.println(p.costoTotal());
            }
            else if (opcion == 2) 
            {
                System.out.println("Ingrese codigo del material a buscar");
                int cod = sc.nextInt();
                if(p.formaParte(cod))
                {
                    System.out.println("Existe");   
                }
                else
                {
                    System.out.println("No existe");
                }
            }
            if(opcion == 3)
            {
                System.out.println("Ingrese el valor a comparar");
                float val = sc.nextFloat();
                Material[] mat = p.menorValor(val);
                for (int j = 0; j < mat.length; j++) {
                    if (mat[j] != null) {
                        System.out.println(mat[j].toString());
                    }
                    
                }
                
                
            }
            if(opcion == 4)
            {
                System.out.println("Precios mayores a 0 y menores o igual a 10");
                System.out.println(p.rangoPrecio()[0]);
                System.out.println("Precios mayores a 10 y menores o igual a 20");
                System.out.println(p.rangoPrecio()[1]);
                System.out.println("Precios mayores a 20 y menores o igual a 30");
                System.out.println(p.rangoPrecio()[2]);
                System.out.println("Precios mayores a 30");
                System.out.println(p.rangoPrecio()[3]);
            }
            
            
        }
    }

}
