public class Main {
    public static void main(String[] args) {
        Bloque1 bloque1 = new Bloque1();
        System.out.println(bloque1.getHeroesOro().get("Evelyn"));
        System.out.println(bloque1.mostrarTerceroRegistro());
        bloque1.eliminarEvento("Dragón Avistado");
        System.out.println(bloque1.getVillanos().size());
        bloque1.getHechizos50();
        bloque1.eliminarVillano("Jose Miguel");
        bloque1.eliminarVillano("Sauron");
        Bloque2 bloque2 = new Bloque2();
        bloque2.buscarGremio("Magos");
        bloque2.buscarGremio("Guerreros");
        bloque2.buscarBotin("Trasgo");
        bloque2.modificarEstadisticas("Conan","Fuerza",10);
        bloque2.buscarTraidores("Judas");
    }
}