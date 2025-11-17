public class Usuario {

    //ATRIBUTOS
    private String nombre;
    private String apellidos;
    private Integer codigoPostal;
    private String direccion;
    private String email;
    private String contraseña;

    //CONSTRUCTOR
    public Usuario (String nom, String ape, Integer cod, String dir, String mail, String pass) {
        this.nombre = nom;
        this.apellidos = ape;
        this.codigoPostal = cod;
        this.direccion = dir;
        this.email = mail;
        this.contraseña = pass;
    }

    //METODO GET Y SET

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public Integer getCodigoPostal() {
        return this.codigoPostal;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getEmail() {
        return this.email;
    }

    public String getContraseña() {
        return this.contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigoPostal(Integer codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String nuevoEmail) {
        if (nuevoEmail.contains("@")){
            this.email=nuevoEmail;
        }
        else{
            System.out.println("Email Invalido");
        }
    }
    public void setContraseña(String contraseña){
        this.contraseña=contraseña;
    }
    public Boolean checkUsuario(String email, String contraseña){
        return (this.email.equals(email) && this.contraseña.equals(contraseña));
    }


    public String toString() {
        System.out.println("Tu nombre es "+this.nombre+" "+this.apellidos+"\nTu codigo postal es "+this.codigoPostal+" y tu dirección es "+this.direccion);
        return null;
    }
}

