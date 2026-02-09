public class Main {
    public static void main(String[] args) {
        //BLOQUE 1: COMPROBACIONES:
        Bloque1 bloque1 = new Bloque1();
        System.out.println("El registro de muertes\n-----------------------------");
        System.out.println(bloque1.mostrarTerceroRegistro());
        System.out.println("-----------------------------");
        System.out.println("El censo único\n-----------------------------");
        System.out.println(bloque1.getVillanos().size());
        System.out.println("-----------------------------");
        System.out.println("Bolsa de oro\n-----------------------------");
        System.out.println(bloque1.getHeroesOro().get("Evelyn"));
        System.out.println("-----------------------------");
        System.out.println("Limpieza del calabozo\n-----------------------------");
        bloque1.eliminarEvento("Dragón Avistado");
        System.out.println("-----------------------------");
        System.out.println("Mercado de hechizos\n-----------------------------");
        bloque1.getHechizos50();
        System.out.println("-----------------------------");
        System.out.println("Expulsión del Reino\n-----------------------------");
        bloque1.eliminarVillano("Jose Miguel");
        bloque1.eliminarVillano("Sauron");
        System.out.println("-----------------------------");
        //BLOQUE 2: COMPROBACIONES:
        Bloque2 bloque2 = new Bloque2();
        System.out.println("El Repositorio de Gremios\n-----------------------------");
        bloque2.buscarGremio("Magos");
        bloque2.buscarGremio("Guerreros");
        System.out.println("-----------------------------");
        System.out.println("El sistema de loot (Botín)\n-----------------------------");
        bloque2.buscarBotin("Trasgo");
        System.out.println("-----------------------------");
        System.out.println("Rastreador de estadísticas complejas\n-----------------------------");
        bloque2.modificarEstadisticas("Conan","Fuerza",10);
        System.out.println("-----------------------------");
        System.out.println("El buscador de traidores\n-----------------------------");
        bloque2.buscarTraidores("Judas");
        System.out.println("-----------------------------");
    }
}