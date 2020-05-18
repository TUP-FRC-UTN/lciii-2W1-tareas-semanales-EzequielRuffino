
package herenciacliente;

public class HerenciaCliente {

    public static void main(String[] args) {
        Cliente c = new Cliente("Ezequiel", 1,"4132352");
        clientePreferencial clipre = new clientePreferencial("Muriel", 2, "4562312");
        clipre.setSaldo(99);
        clipre.setLimite(150);
        clipre.setDomicilio("Rios 123");

        
        //System.out.println(c);
        System.out.println(clipre);
                

    }
    
}
