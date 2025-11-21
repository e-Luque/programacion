public class Direccion {
    //PARAMETROS
    private String calle;
    private int numero;
    private int codigoPostal;
    private String localidad;
    private String provincia;
    //CONSTRUCTOR
    public Direccion(String calle, int numero, int codigoPostal, String localidad, String provincia){
        this.calle = calle;
        this.numero = numero;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }
    //METODOS GET Y SET
}
