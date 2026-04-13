package rpg.logic;

import rpg.model.Personaje;
import rpg.model.Item;
import rpg.exception.FondosInsuficientesException;
import rpg.dao.PersonajeDAO;
import rpg.dao.InventarioDAO;

public class SistemaTienda {
    public void comprarItem(Personaje p, Item item) throws FondosInsuficientesException {
        // 1. Comprobar si tiene pasta (Regla de negocio)
        if (p.getOro() < item.getPrecioOro()) {
            throw new FondosInsuficientesException("No tienes suficiente oro. Te faltan "
                    + (item.getPrecioOro() - p.getOro()) + " monedas.");
        }

        // 2. Restar oro en MEMORIA (Actualización instantánea)
        p.setOro(p.getOro() - item.getPrecioOro());

        // 3. Guardar en BBDD (Permanencia)
        // Actualizamos el oro del personaje
        PersonajeDAO pDAO = new PersonajeDAO();
        pDAO.actualizarPersonaje(p);

        // Registramos el nuevo objeto en su inventario
        InventarioDAO iDAO = new InventarioDAO();
        iDAO.registrarCompra(p.getId(), item.getId());

        System.out.println("¡Compra realizada! Has obtenido: " + item.getNombre());
    }
}
