import java.util.ArrayList;

public class Main {

    // LISTAS ESTÁTICAS
    public static ArrayList<Hospital> hospitales = new ArrayList<>();
    public static ArrayList<Area> areas = new ArrayList<>();
    public static ArrayList<Medico> medicos = new ArrayList<>();
    public static ArrayList<Contrato> contratos = new ArrayList<>();

    public static void main(String[] args) {

        // ====================================
        //   CARGA INICIAL DE DATOS
        // ====================================

        // Hospital
        Hospital h1 = new Hospital("Hospital Central", "CIF123");
        hospitales.add(h1);

        // Áreas
        Area a1 = new Area("Urgencias", "A01", "Planta Baja", h1);
        Area a2 = new Area("Pediatría", "A02", "1ª Planta", h1);

        h1.getAreas().add(a1);
        h1.getAreas().add(a2);

        areas.add(a1);
        areas.add(a2);

        // Médico
        Medico m1 = new Medico("12345678C", "Evelyn Luque", 45, "H", 3000, 2010, a1);
        a1.sumarMedico();
        medicos.add(m1);

        // Contrato
        Contrato c1 = new Contrato(2010);
        c1.setMedico(m1);
        c1.setHospital(h1);
        contratos.add(c1);

        // Lanzar menú
        MenuGestor.ejecutarMenuPrincipal();
    }

    // ====================================
    //           MÉTODOS DE BÚSQUEDA
    // ====================================

    public static Medico buscarMedico(String dni) {
        for (Medico m : medicos) {
            if (m.getDni().equals(dni)) return m;
        }
        return null;
    }

    public static Hospital buscarHospital(String nombre) {
        for (Hospital h : hospitales) {
            if (h.getNombre().equalsIgnoreCase(nombre)) return h;
        }
        return null;
    }

    public static Area buscarArea(String id) {
        for (Area a : areas) {
            if (a.getIdentificador().equals(id)) return a;
        }
        return null;
    }

    public static ArrayList<Contrato> buscarContratosPorAnio(int anio) {
        ArrayList<Contrato> lista = new ArrayList<>();
        for (Contrato c : contratos) {
            if (c.esDeAnio(anio)) lista.add(c);
        }
        return lista;
    }
}
