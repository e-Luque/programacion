public class Contrato {
    //PARAMETROS
    private String fechaDeCreacion;
    private Medico medico;
    private Hospital hospital;
    //CONSTRUCTOR
    public Contrato(String fechaDeCreacion){
        this.fechaDeCreacion = fechaDeCreacion;
        this.medico = new Medico();
        this.hospital = new Hospital()
    }
    //METODOS GET Y SET
    public Hospital getHospital() {
        return hospital;
    }

    public Medico getMedico() {
        return medico;
    }

    public String getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setFechaDeCreacion(String fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}
