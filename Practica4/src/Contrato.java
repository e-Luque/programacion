public class Contrato {
    //PARAMETROS
    private int fechaDeCreacion;
    private Medico medico;
    private Hospital hospital;
    //CONSTRUCTOR
    public Contrato(int fechaDeCreacion){
        this.fechaDeCreacion = fechaDeCreacion;
        this.medico = medico;
        this.hospital = hospital;
    }
    //METODOS GET Y SET
    public Hospital getHospital() {
        return hospital;
    }

    public Medico getMedico() {
        return medico;
    }

    public int getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setFechaDeCreacion(int fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    //FUNCIONES
    public boolean esDeAnio(int anio){
        return anio==fechaDeCreacion;
    }
    public  int diasDeCreacion(int numeroDeDias,int diasDesdeInicio){
        return 365*(diasDesdeInicio - numeroDeDias);
    }
}


