package ar.unrn.model;

import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private Empleado director;


    public Empresa(String nombre, ArrayList<String> puestos, Empleado director){
        if (nombre == null ||nombre.isEmpty())
            throw new RuntimeException("Debe cargar un nombre");
        if (puestos.size()==0)
            throw new RuntimeException("Debe cargar la estructura de la empresa");
        if (director ==null){
            throw new RuntimeException("La empresa tiene que tener un director");
        }
        this.nombre = nombre;
        this.director = director;
        puesto = puestos;
    }

    public Double generarSueldosDeEmpleados(){
        return this.director.calcularSueldo();
    }



}
