package ar.unrn.model;

public class Tarea implements Item{

    private String descripcion;
    private int tiempoEnUnidades;


    public Tarea(String descripcion, int tiempoEnUnidades){
        if (descripcion == null || descripcion.isEmpty())
            throw new RuntimeException("Debe existir una descripcion");
        if (tiempoEnUnidades<0)
            throw new RuntimeException("Debe existir un tiempo estimado");

        this.descripcion = descripcion;
        this.tiempoEnUnidades = tiempoEnUnidades;
    }

    @Override
    public int calculoTiempoFinalizacion() {
        return this.tiempoEnUnidades;
    }

    @Override
    public void agregarItem(Item item) {
        throw new RuntimeException("La tarea no puede tener otra tarea");
    }
}
