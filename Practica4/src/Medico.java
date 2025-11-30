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
    public Medico(String dni, String nombre, int edad, String sexo, int sueldoBruto, int fechaInicio, Area area){
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.sueldoBruto = sueldoBruto;
        this.fechaInicio = fechaInicio;
        this.area = area;
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

    public int getEdad() {
        return edad;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public String getSexo() {
        return sexo;
    }
    public double calcularSueldoNeto(double retencion){
        return (this.sueldoBruto-(sueldoBruto*(retencion/100)));
    }
    public int getAniosAntiguedad(){
        return 2025 - this.fechaInicio;
    }
    public int calcularImpuestosAnuales(double tasaImpositiva){
        return (int) ((double)this.sueldoBruto/(tasaImpositiva/100));
    }
    public boolean esMayorDeEdad(int mayoriaEdad){
        return (this.edad>=mayoriaEdad);
    }
    public double proximoAumento(double porcentajeAumento, int aniosRequeridos){
        double sueldoAumentado = this.sueldoBruto;
        if(getAniosAntiguedad()>=aniosRequeridos){
            sueldoAumentado = (this.sueldoBruto+(this.sueldoBruto*(porcentajeAumento/100)));
        }
        return sueldoAumentado;
    }
    public void cambiarArea(Area nuevaArea){
        this.area.setNumMedicos(area.getNumMedicos()-1);
        nuevaArea.sumarMedico();
        this.area = nuevaArea;

    }
}
