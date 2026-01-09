public class Paciente {
    private String dni;
    private String nombre;
    private String sexo;
    private Medico medico;
    public Paciente (String dni, String nombre, String sexo, Medico medico){
        this.dni = dni;
        this.nombre = nombre;
        this.sexo = sexo;
        this.medico = medico;
    }
}
