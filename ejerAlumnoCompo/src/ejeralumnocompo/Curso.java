
package ejeralumnocompo;

public class Curso {
    private String nombCurso;
    private Alumno [] alumnos;

    public Curso(String nombCurso, int cantidad) {
        this.nombCurso = nombCurso;
        alumnos= new Alumno [cantidad];
    }

    public String getNombCurso() {
        return nombCurso;
    }

    public void setNombCurso(String nombCurso) {
        this.nombCurso = nombCurso;
    }
    
    public void agregarAlumnos(Alumno a)
    {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i]==null) {
                alumnos[i]=a;
                break;               
            }           
        }   
    }
    
    
    public String listadoAlumno()
    {
        String nombre="";
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i]!=null) {   
                //Alumno al = alumnos[i];
                //nombre += al.toString();
                nombre+=alumnos[i].toString() + "\n";
            }            
        }
    return nombre;
    }
            
    
    public double promedioGneral()
    {
    int contAlumno=0;
    double acuPromedioAlumno=0;
    
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i]!=null) {
                acuPromedioAlumno+= alumnos[i].getPromeAlumno();
                contAlumno++;               
            }
       }
    return acuPromedioAlumno / contAlumno;
    }
  
    public int cantAlumPromedioMasOcho()
    {
    int contador=0;
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i]!=null) {
                if (alumnos[i].getPromeAlumno()>=8) {
                    contador++;                  
                }
            }            
        }
    return contador;    
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
