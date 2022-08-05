package com.mycompany.reto3;

import java.time.LocalDate;

public class Vendedor {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private double valorTotalVendido;
    private String descripcion;
    private int anioDeIngreso;
    public static final int anioActual = LocalDate.now().getYear();
    
    private Vendedor(int id, String nombre, String apellido, int edad, double valorTotalVendido, String descripcion, int anioDeIngreso) throws ExcepcionAnioIngreso, ExcepcionEdad{
        
        if(anioDeIngreso > anioActual){
            throw new ExcepcionAnioIngreso();
        }else{
            this.anioDeIngreso = anioDeIngreso;

        }
        
        if(edad < 18){
            throw new ExcepcionEdad();
        }else{
            this.edad = edad;

        }
            
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.valorTotalVendido = valorTotalVendido;
        this.descripcion = descripcion;
    }
    
    public String obtenerNivelVendedor(int valorTotalVendido){
        if(valorTotalVendido == 0){
            String mensaje1 = "Nivel del vendedor: Novato";
            return mensaje1;
        }else if(valorTotalVendido > 0 && valorTotalVendido < 500000000){
            String mensaje2 = "Nivel del vendedor; Principiante";
            return mensaje2;
        }else if(valorTotalVendido > 500000000 && valorTotalVendido < 2000000000){
            String mensaje3 = "Nivel del vendedor: Intermedio";
            return mensaje3;
        }else if(valorTotalVendido > 2000000000){
            String mensaje4 = "Nivel del vendedor: Avanzado";
            return mensaje4;
        }else{
            String mensajeError = "Valor total vendido por el vendedor erroneo";
            return mensajeError;
        }        
    }
    
    public String obterenRendimientoVendedor(int anioDeIngreso, int valorTotalVendido){
        int anioActual = 2022;
        int aniosTrabajo = anioActual - anioDeIngreso;
        
        if(aniosTrabajo < 5 && valorTotalVendido < 500000000){
            String mensaje1 = "Rendimiento del vendedor: Malo";
            return mensaje1;
        }else if((aniosTrabajo > 5 && aniosTrabajo < 10) && valorTotalVendido > 1000000000){
            String mensaje2 = "Rendimiento del vendedor: Regular";
            return mensaje2;
        }else if(aniosTrabajo >10 && valorTotalVendido > 1500000000){
            String mensaje3 = "Rendimiento del vendedor: Bueno";
            return mensaje3;
        }else if(aniosTrabajo < 15 && valorTotalVendido > 2000000000){
            String mensaje4 = "Rendimiento del vendedor: Exelente";
            return mensaje4;
        }else{
            String mensajeError = "Tador erroneos verifique los datos ingresados";
            return mensajeError;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getValorTotalVendido() {
        return valorTotalVendido;
    }

    public void setValorTotalVendido(double valorTotalVendido) {
        this.valorTotalVendido = valorTotalVendido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnioDeIngreso() {
        return anioDeIngreso;
    }

    public void setAnioDeIngreso(int anioDeIngreso) {
        this.anioDeIngreso = anioDeIngreso;
    }    
}
