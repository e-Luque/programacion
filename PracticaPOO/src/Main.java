public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario(
                "Evelyn",
                "Luque",
                11408,
                "Picadueña Baja",
                "e-Luque@gmail.com",
                "TuMadre"
        );
        Usuario user2 = new Usuario(
                "Evelyn",
                "Luque",
                11408,
                "Picadueña Baja",
                "e-Luque@gmail.com",
                "TuMadre"
        );
        Usuario user3 = new Usuario(
                "Evelyn",
                "Luque",
                11408,
                "Picadueña Baja",
                "e-Luque@gmail.com",
                "TuMadre"
        );
        System.out.println(user.getNombre() + " " + user.getApellidos());
        System.out.println(user.getEmail());
        user.setNombre("Cristian");
        System.out.println(user.getNombre());
        user.setEmail("Holapepe");
        System.out.println(user.getEmail());
        System.out.println(user.checkUsuario("e-Luque@gmail.com", "TuMadre"));
        user.toString();
    }
}