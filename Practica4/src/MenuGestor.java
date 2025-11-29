import java.util.Scanner;

public class MenuGestor {

    public static void ejecutarMenuPrincipal() {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n======== MENÚ PRINCIPAL ========");
            System.out.println("1. Crear Hospital");
            System.out.println("2. Crear Área");
            System.out.println("3. Crear Médico");
            System.out.println("4. Modificar Médico");
            System.out.println("5. Modificar Hospital");
            System.out.println("6. Calcular Antigüedad");
            System.out.println("7. Calcular Sueldo Neto");
            System.out.println("8. Comprobar Edad");
            System.out.println("9. Proporción de Médicos");
            System.out.println("10. Capacidad de Área");
            System.out.println("11. Comparar Áreas");
            System.out.println("12. Contratos por Año");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1: crearHospital(sc); break;
                case 2: crearArea(sc); break;
                case 3: crearMedico(sc); break;
                case 4: modificarMedico(sc); break;
                case 5: modificarHospital(sc); break;
                case 6: calcularAntiguedad(sc); break;
                case 7: calcularSueldoNeto(sc); break;
                case 8: comprobarEdad(sc); break;
                case 9: proporcionMedicos(sc); break;
                case 10: capacidadArea(sc); break;
                case 11: compararAreas(sc); break;
                case 12: contratosPorAnio(sc); break;
                case 0: System.out.println("Saliendo..."); break;
                default: System.out.println("Opción no válida.");
            }

        } while (opcion != 0);
    }

    // ===============================
    //       OPCIÓN 1: CREAR HOSPITAL
    // ===============================
    private static void crearHospital(Scanner sc) {
        System.out.println("Nombre del hospital: ");
        String nombre = sc.nextLine();

        System.out.println("CIF: ");
        String cif = sc.nextLine();

        Hospital h = new Hospital(nombre, cif);
        Main.hospitales.add(h);

        System.out.println("Hospital creado correctamente.");
    }

    // ===============================
    //        OPCIÓN 2: CREAR ÁREA
    // ===============================
    private static void crearArea(Scanner sc) {

        System.out.println("Identificador del Área: ");
        String id = sc.nextLine();

        System.out.println("Nombre del Área: ");
        String nombre = sc.nextLine();

        System.out.println("Planta: ");
        String planta = sc.nextLine();

        System.out.println("Hospital al que pertenece: ");
        String nombreHospital = sc.nextLine();

        Hospital h = Main.buscarHospital(nombreHospital);
        if (h == null) {
            System.out.println("Hospital no encontrado.");
            return;
        }

        Area a = new Area(nombre, id, planta, h);
        h.getAreas().add(a);
        Main.areas.add(a);

        System.out.println("Área creada correctamente.");
    }

    // ===============================
    //        OPCIÓN 3: CREAR MÉDICO
    // ===============================
    private static void crearMedico(Scanner sc) {

        System.out.print("DNI: ");
        String dni = sc.nextLine();

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.print("Sexo: ");
        String sexo = sc.nextLine();

        System.out.print("Sueldo Bruto: ");
        int sueldo = sc.nextInt();

        System.out.print("Fecha de inicio: ");
        int inicio = sc.nextInt();
        sc.nextLine();

        System.out.print("ID de Área: ");
        String idArea = sc.nextLine();

        Area a = Main.buscarArea(idArea);
        if (a == null) {
            System.out.println("Área no encontrada.");
            return;
        }

        Medico m = new Medico(dni, nombre, edad, sexo, sueldo, inicio, a);
        a.sumarMedico();
        Main.medicos.add(m);

        // Crear contrato automáticamente
        Contrato c = new Contrato(inicio);
        c.setMedico(m);
        c.setHospital(a.getHospital());
        Main.contratos.add(c);

        System.out.println("Médico y contrato registrados.");
    }

    // ===============================
    //        OPCIÓN 4: MODIFICAR MÉDICO
    // ===============================
    private static void modificarMedico(Scanner sc) {

        System.out.print("Introduce el DNI: ");
        String dni = sc.nextLine();

        Medico m = Main.buscarMedico(dni);

        if (m == null) {
            System.out.println("Médico no encontrado.");
            return;
        }

        System.out.println("1. Cambiar Sueldo");
        System.out.println("2. Cambiar Área");

        int op = sc.nextInt();
        sc.nextLine();

        switch (op) {
            case 1:
                System.out.print("Nuevo sueldo: ");
                int sueldo = sc.nextInt();
                m.setSueldoBruto(sueldo);
                break;

            case 2:
                System.out.print("Nuevo ID de Área: ");
                String id = sc.nextLine();
                Area nueva = Main.buscarArea(id);

                if (nueva != null) m.cambiarArea(nueva);
                else System.out.println("Area no encontrada.");
                break;

            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Modificación realizada.");
    }

    // ===============================
    //   CALCULAR ANTIGÜEDAD
    // ===============================
    private static void calcularAntiguedad(Scanner sc) {
        System.out.print("DNI: ");
        Medico m = Main.buscarMedico(sc.nextLine());

        if (m != null)
            System.out.println("Años de antigüedad: " + m.getAniosAntiguedad());
        else
            System.out.println("Médico no encontrado.");
    }

    // ===============================
    //   CALCULAR SUELDO NETO
    // ===============================
    private static void calcularSueldoNeto(Scanner sc) {
        System.out.print("DNI: ");
        Medico m = Main.buscarMedico(sc.nextLine());

        if (m == null) {
            System.out.println("Médico no encontrado.");
            return;
        }

        System.out.print("Retención (%): ");
        double ret = sc.nextDouble();

        System.out.println("Sueldo neto: " + m.calcularSueldoNeto(ret));
    }

    // ===============================
    //   COMPROBAR EDAD
    // ===============================
    private static void comprobarEdad(Scanner sc) {
        System.out.print("DNI: ");
        Medico m = Main.buscarMedico(sc.nextLine());

        if (m == null) {
            System.out.println("Médico no encontrado.");
            return;
        }

        System.out.print("Edad mínima: ");
        int min = sc.nextInt();

        System.out.println("Mayor de edad? " + m.esMayorDeEdad(min));
    }

    // ===============================
    //     PROPORCIÓN DE MÉDICOS
    // ===============================
    private static void proporcionMedicos(Scanner sc) {

        System.out.print("Hospital: ");
        Hospital h = Main.buscarHospital(sc.nextLine());

        if (h == null) {
            System.out.println("Hospital no encontrado.");
            return;
        }

        System.out.print("ID Área: ");
        String id = sc.nextLine();

        double p = h.getProporcionMedicosArea(id);

        System.out.println("Proporción: " + p);
    }

    // ===============================
    //      CAPACIDAD RESTANTE
    // ===============================
    private static void capacidadArea(Scanner sc) {
        System.out.print("ID Área: ");
        Area a = Main.buscarArea(sc.nextLine());

        if (a == null) {
            System.out.println("Área no encontrada.");
            return;
        }

        System.out.print("Límite máximo: ");
        int max = sc.nextInt();

        System.out.println("Capacidad restante: " + a.calcularCapacidadRestante(max));
    }

    // ===============================
    //      COMPARAR ÁREAS
    // ===============================
    private static void compararAreas(Scanner sc) {
        System.out.print("ID Área 1: ");
        Area a1 = Main.buscarArea(sc.nextLine());

        System.out.print("ID Área 2: ");
        Area a2 = Main.buscarArea(sc.nextLine());

        if (a1 == null || a2 == null) {
            System.out.println("Alguna de las áreas no existe.");
            return;
        }

        System.out.println(a1.compararMedicos(a2));
    }

    // ===============================
    //      CONTRATOS POR AÑO
    // ===============================
    private static void contratosPorAnio(Scanner sc) {
        System.out.print("Año: ");
        int anio = sc.nextInt();

        var lista = Main.buscarContratosPorAnio(anio);

        for (Contrato c : lista)
            System.out.println("Contrato de " + c.getMedico().getNombre());

        if (lista.isEmpty())
            System.out.println("No hay contratos de ese año.");
    }
}
