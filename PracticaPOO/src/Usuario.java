public class Usuario {
    private String nombre:
    private String apellidos:
    private String codigoPostal;
    private String direccion;
    private String email;
    private String contraseña;

    public Usuario (String nom, String ape, String cod, String dir, String mail, String pass) {
        nombre = nom;
        apellidos = ape;
        codigoPostal = cod;
        direccion = dir;
        email = mail;
        contraseña = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        if (this.email.contains(@)){
            this.email = email;
        }
        else{
            System.out.println("Error: Email inválido. No contiene @.");
        }
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public boolean checkUsuario(String email String password){

    }

}

