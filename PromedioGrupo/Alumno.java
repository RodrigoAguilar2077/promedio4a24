public class Alumno {
    private String nombre;
    private String matricula;
    private double estrucuturas;
    private double ingles;
    private double iot;
    private double promedio;

    //constructor
    public Alumno(String n, String m) {
        this.nombre = n;
        this.matricula = m;
    }
//constructor vacio
    public Alumno(){

    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEstrucuturas() {
        return estrucuturas;
    }

    public void setEstrucuturas(double estrucuturas) {
        this.estrucuturas = estrucuturas;
    }

    public double getIngles() {
        return ingles;
    }

    public void setIngles(double ingles) {
        this.ingles = ingles;
    }

    public double getIot() {
        return iot;
    }

    public void setIot(double iot) {
        this.iot = iot;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio() {
        this.promedio =(this.estrucuturas + this.ingles + this.iot) / 3;
    }
    
    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", matricula=" + matricula + ", promedio=" + promedio + "]";
    }

    
}
