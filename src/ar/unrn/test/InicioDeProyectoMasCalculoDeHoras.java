package ar.unrn.test;

import ar.unrn.model.ItemDeProyecto;
import ar.unrn.model.Proyecto;
import ar.unrn.model.Tarea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InicioDeProyectoMasCalculoDeHoras {
    @Test
    public void recuentoDeHorasDeProyecto(){

        Proyecto proyecto1 = new Proyecto("ScrumProyect1");

        ItemDeProyecto historiaDeUsuario1 = new ItemDeProyecto("Historia de Usuario 1");

        Tarea tarea1 = new Tarea("Tarea 1",10);
        Tarea tarea2 = new Tarea("Tarea 2",3);
        Tarea tarea3 = new Tarea("Tarea 3",4);
        Tarea tarea4 = new Tarea("Tarea 4",3);

        historiaDeUsuario1.agregarItem(tarea1);
        historiaDeUsuario1.agregarItem(tarea2);
        historiaDeUsuario1.agregarItem(tarea3);
        historiaDeUsuario1.agregarItem(tarea4);

        ItemDeProyecto spike1 = new ItemDeProyecto("Spike 1");

        Tarea tarea5 = new Tarea("Tarea en spike",1);

        spike1.agregarItem(tarea5);

        proyecto1.cargaDeItems(historiaDeUsuario1);
        proyecto1.cargaDeItems(spike1);

        int tiempoEsperado = 21;

        assertEquals(tiempoEsperado,proyecto1.calcularHorasDuracion());



    }

}
