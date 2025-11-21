public class Medico {
    //PARAMETROS
    private String dni;
    private String nombre;
    private int edad;
    private String sexo;
    private int sueldoBruto;
    private int fechaInicio;
    private Area area;
    //CONSTRUCTOR
    public Medico(String dni, String nombre, int edad, String sexo, int sueldoBruto, int fechaInicio){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.sueldoBruto = sueldoBruto;
        this.fechaInicio = fechaInicio;
        this.area = new Area()
    }
    //METODOS GET Y SET
    public String getNombre() {
        return nombre;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public String getDni() {
        return dni;
    }

    public Area getArea() {
        return area;
    }

    public String getEdad() {
        return edad;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getSexo() {
        return sexo;
    }
}
