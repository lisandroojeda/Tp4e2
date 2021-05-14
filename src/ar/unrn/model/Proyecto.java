package ar.unrn.model;

import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private ArrayList<Item> listadoDeItems;


    public Proyecto(String nombre){
        if (nombre == null ||nombre.isEmpty())
            throw new RuntimeException("Debe cargar un nombre");

        this.nombre = nombre;
         listadoDeItems= new ArrayList<>();
    }

    public int calcularHorasDuracion(){
        int cantidaDeHoras = 0;
        for (Item item: listadoDeItems){
            cantidaDeHoras = cantidaDeHoras + item.calculoTiempoFinalizacion();
        }
        return cantidaDeHoras;
    }


    public void cargaDeItems(Item item){
        this.listadoDeItems.add(item);
    }



}
