public class Area {
    //PARAMETROS
    private String nombre;
    private String identificador;
    private String planta;
    private Hospital hospital;
    private int numMedicos;
    //CONSTRUCTOR
    public Area(String nombre, String identificador, String planta, Hospital hospital){
        this.nombre = nombre;
        this.identificador = identificador;
        this.planta = planta;
        this.numMedicos = 0;
        this.hospital = hospital;
    }
    //METODOS GET Y SET

    public String getNombre() {
        return nombre;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getNumMedicos() {
        return numMedicos;
    }

    public String getPlanta() {
        return planta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public void setNumMedicos(int numMedicos) {
        this.numMedicos = numMedicos;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }
    public void sumarMedico(){
        this.numMedicos++;
    }
    public String compararMedicos(Area otraArea){
        if (numMedicos > otraArea.getNumMedicos()) {
            return nombre +" tiene mas medicos que "+ otraArea.getNombre()
        }
        else return otraArea.getNombre()+" tiene mas medicos que "+nombre

    }
}
