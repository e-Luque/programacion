package rpg.logic;

import rpg.dao.PersonajeDAO;
import rpg.exception.NivelInsuficienteException;
import rpg.model.Ciudad;
import rpg.model.Clase;
import rpg.model.Personaje;
import rpg.model.Raza;

import java.util.List;

public class SistemaPersonajes {
    public SistemaPersonajes(){}
    public void crearNuevoPersonaje(String nombre, Raza raza, Clase clase, Ciudad ciudad, List<Personaje> lista_personajes) {
        Personaje nuevo = new Personaje(0, nombre, 1, 100, 100, raza, clase, ciudad);
        lista_personajes.add(nuevo);
        PersonajeDAO personajeDAO = new PersonajeDAO();
        personajeDAO.insertarPersonaje(nuevo);

        System.out.println("¡" + nombre + " ha sido creado con éxito!");
    }
    public void viajar(Personaje p, Ciudad destino) throws NivelInsuficienteException {

        if (p.getNivel() < destino.getNivelMinimoAcceso()) {
            throw new NivelInsuficienteException("¡Nivel insuficiente! Necesitas nivel "
                    + destino.getNivelMinimoAcceso() + " para entrar en " + destino.getNombre());
        }


        p.setCiudad(destino);


        PersonajeDAO pDAO = new PersonajeDAO();
        pDAO.actualizarCiudad(p.getId(), destino.getId());

        System.out.println("Has viajado con éxito a " + destino.getNombre());
    }
}
