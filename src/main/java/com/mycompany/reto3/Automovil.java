package com.mycompany.reto3;

public class Automovil {
    private char placa;
    private String marca;
    private int kilometraje;
    private String color;
    private int precio;
    private String descripcion;
    private int añoFabricacion;
    
    public Automovil(char placa, String marca, int kilometraje, String color, int precio, String descripcion, int añoFabricacion) throws ExcepcionKm{
        
        if(kilometraje < 0){
            throw new ExcepcionKm();
        }else{
            this.kilometraje = kilometraje;

        }
            
        this.placa = placa;
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.descripcion = descripcion;
        this.añoFabricacion = añoFabricacion;
               
    }
       
    public char obtenerEstadoAutomovil(){
        return 0;
    }
    
    public String obtenerUsoAutomovil(int kilometraje){
        if(kilometraje == 0){
            String mensaje1 = "Uso del automovil: 0Km";
            return mensaje1;
        }else if(kilometraje > 0 && kilometraje < 1000){
            String mensaje2 = "Uso del automovil: Nuevo";
            return mensaje2;
        }else if(kilometraje > 1000 && kilometraje < 20000){     
            String mensaje3 = "Uso del automovil: Casi nuevo";
            return mensaje3;
        }else if(kilometraje > 20000 && kilometraje < 100000){
            String mensaje4 = "Uso del automovil: Usado";
            return mensaje4;
        }else if(kilometraje > 100000){
            String mensaje5 = "Uso del automovil: Muy usado";
            return mensaje5;
        }else{
            String mensajeError = "Kilometraje del auto erroneo";
            return mensajeError;
        }
    }
    
    public String obtenerAntiguedadAutomovil(int anioFabricacion){
        int anioActual = 2022;
        int antiguedadAuto = anioActual - anioFabricacion;
        
       if(antiguedadAuto <= 1){
           String mensaje1 = "Antiguedad del año: Ultimo modelo";
           return mensaje1;
       }else if(antiguedadAuto > 1 && antiguedadAuto < 3){
           String mensaje2 = "Antiguedad del auto: Nuevo";
           return mensaje2;
       }else if(antiguedadAuto > 3 && antiguedadAuto < 8){
           String mensaje3 = "Antiguedad del auto: Intermedio";
           return mensaje3;
       }else if(antiguedadAuto > 10){
           String mensaje4 = "Antiguedad del auto: Antiguo";
           return mensaje4;
       }else{
           String mensajeErroneo = "Los datos ingresados son Erroneos verifique";
           return mensajeErroneo;
       }
    }

    public char getPlaca() {
        return placa;
    }

    public void setPlaca(char placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
}


