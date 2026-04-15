package rpg.logic;

import rpg.model.Personaje;
import rpg.model.Item;
import rpg.exception.FondosInsuficientesException;
import rpg.dao.PersonajeDAO;
import rpg.dao.InventarioDAO;

public class SistemaTienda {
    public void comprarItem(Personaje p, Item item) throws FondosInsuficientesException {

        if (p.getOro() < item.getPrecioOro()) {
            throw new FondosInsuficientesException("No tienes suficiente oro. Te faltan "
                    + (item.getPrecioOro() - p.getOro()) + " monedas.");
        }


        p.setOro(p.getOro() - item.getPrecioOro());

        PersonajeDAO pDAO = new PersonajeDAO();
        pDAO.actualizarPersonaje(p);

        InventarioDAO iDAO = new InventarioDAO();
        iDAO.registrarCompra(p.getId(), item.getId());

        System.out.println("¡Compra realizada! Has obtenido: " + item.getNombre());
    }
}
