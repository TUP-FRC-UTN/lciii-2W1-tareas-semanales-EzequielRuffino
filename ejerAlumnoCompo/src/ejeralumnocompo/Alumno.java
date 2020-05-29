
package ejeralumnocompo;

public class Alumno {
    private String nomAlumno;
    private int legajo;
    private double promeAlumno;

    public Alumno(String nomAlumno, int legajo, double promeAlumno) {
        this.nomAlumno = nomAlumno;
        this.legajo = legajo;
        this.promeAlumno = promeAlumno;
    }

    public String getNomAlumno() {
        return nomAlumno;
    }

    public void setNomAlumno(String nomAlumno) {
        this.nomAlumno = nomAlumno;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getPromeAlumno() {
        return promeAlumno;
    }

    public void setPromeAlumno(double promeAlumno) {
        this.promeAlumno = promeAlumno;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nomAlumno=" + nomAlumno + ", legajo=" + legajo + ", promeAlumno=" + promeAlumno + '}';
    }
    
    
    
}
