package ejercbiblioteca;

class Prestamo {
    private String solicitante;
    private int cantDias;
    private boolean devuelto;

    public Prestamo() {
    }

    public Prestamo(String solicitante, int cantDias, boolean devuelto) {
        this.solicitante = solicitante;
        this.cantDias = cantDias;
        this.devuelto = devuelto;
    }

    public String getSolicitante() {
        return this.solicitante;
    }

    public boolean getDevuelto() {
        return this.devuelto;
    }

    public int getCantDias() {
        return this.cantDias;
    }
    
    
    
}
