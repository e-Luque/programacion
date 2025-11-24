public class Main{
    public static void main(String[] args) {
        Direccion direccion = new Direccion("PruebaCalle", 2, 11408, "Jerez", "Cadiz");
        Hospital hospital1 = new Hospital("Prueba", "321");
        Area area1 = new Area("Pepe", "ID007", "2", hospital1);
        Medico medico1 = new Medico("12132312X", "Evelyn", 18, "Femenino", 2050, 2023, area1);
        area1.sumarMedico();
        System.out.println(area1.getNumMedicos());
        System.out.println(medico1.calcularSueldoNeto(20.0));
        System.out.println(medico1.calcularImpuestosAnuales(12));
    }
}
