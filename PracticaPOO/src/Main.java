import java.util.Scanner;

public class Main {
    public static void validarRegistro(Usuario[] usuarios){
        for (int i = 0; i < usuarios.length; i++) {
            if(usuarios[i].getCodigoPostal()>=28000 && usuarios[i].getCodigoPostal()<29000){
                System.out.println("Acceso concedido al usuario " + usuarios[i].getNombre());
            }
            else{
                System.out.println("ERROR: Usuario "+usuarios[i].getNombre()+" bloqueado. Código Postal no permitido.");
            }
        }
    }
    public static void main(String[] args) {
        Usuario user = new Usuario(
                "Evelyn",
                "Luque",
                28408,
                "Picadueña Baja",
                "e-Luque@gmail.com",
                "e-Luque"
        );
        Usuario user2 = new Usuario(
                "Óscar",
                "Richarte",
                11412,
                "Vallesequillo II",
                "Richi@gmail.com",
                "Richi07"
        );
        Usuario user3 = new Usuario(
                "Julia",
                "Moreno",
                11409,
                "Calle Señuelo",
                "Julia@gmail.com",
                "Julia777"
        );
        Usuario[] usuarios = {user,user2,user3};
        validarRegistro(usuarios);
        Scanner scanner = new Scanner(System.in);
        String eemail = scanner.nextLine();
        String ppassword = scanner.nextLine();
        System.out.println(user.getEmail());
        if (user.checkUsuario(eemail, ppassword)){
            System.out.println();
        }
    }
}