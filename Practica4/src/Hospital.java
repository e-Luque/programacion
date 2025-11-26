import java.util.ArrayList;

public class Hospital {
    //PARAMETROS
    private String nombre;
    private String cif;
    private ArrayList<Area> areas;
    //CONSTRUCTOR
    public Hospital(String nombre, String cif){
        this.nombre = nombre;
        this.cif = cif;
        this.areas = new ArrayList<>();
    }
    //METODOS GET Y SET

    public String getNombre() {
        return nombre;
    }

    public String getCif() {
        return cif;
    }

    public ArrayList<Area> getAreas() {
        return areas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setAreas(ArrayList<Area> areas) {
        this.areas = areas;
    }
    public int getNumeroTotalMedicos(){
        for(int i = 0; i<areas.size();i++){
            this.areas.get(i).getNumMedicos()++
        }
    }
    public double getProporcionMedicosArea(String idArea){

    }
}
