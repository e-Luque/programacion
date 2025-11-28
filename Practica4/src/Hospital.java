import java.net.IDN;
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
        int suma = 0;
        for(int i = 0; i<areas.size();i++){
            suma+=this.areas.get(i).getNumMedicos();
        }
        return suma;
    }
    public double getProporcionMedicosArea(String idArea){
        double proporcion = 0.0;
        for (int j = 0; j < areas.size(); j++) {
            if (areas.get(j).getIdentificador().equals(idArea)){
                proporcion = (double) areas.get(j).getNumMedicos()/ (double) getNumeroTotalMedicos();
            }
        }
        if (proporcion != 0.0){
            return proporcion;
        }
        else{
            return null;
        }
    }
    public boolean existeArea(String idArea){
        for (int i = 0; i < areas.size(); i++) {

        }
    }
}
