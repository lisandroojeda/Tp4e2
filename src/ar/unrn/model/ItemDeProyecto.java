package ar.unrn.model;

import java.util.ArrayList;

public class ItemDeProyecto implements Item{

    private ArrayList<Item> listadoDeTareas;
    private String descripcion;
    //no coloco el tiempo aca porque una historia depende de las tareas qeu tenga cargada

    public ItemDeProyecto(String descripcion){
        if (descripcion == null || descripcion.isEmpty())
            throw new RuntimeException("Debe cargar un codigo");

        this.descripcion = descripcion;
        this.listadoDeTareas =new ArrayList<>();
    }

    @Override
    public int calculoTiempoFinalizacion() {
        int tiempoAcumulado = 0;
        for (Item item : this.listadoDeTareas){
            tiempoAcumulado = tiempoAcumulado + item.calculoTiempoFinalizacion();
        }
        return tiempoAcumulado;
    }

    @Override
    public void agregarItem(Item item) {
        this.listadoDeTareas.add(item);
    }
}
