package objetosServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase abstracta que define la estructura base para generar códigos
 * con un prefijo específico. Las clases hijas deben implementar la lógica
 * de generación y validación del formato del código.
 */
public abstract class GeneradorCodigos {

    /**
     * Prefijo que se utilizará al inicio del código generado.
     */
    protected String prefijo;

    /**
     * Constructor que inicializa el prefijo del código.
     * 
     * @param prefijo Cadena que representa el prefijo del código
     */
    public GeneradorCodigos(String prefijo) {
        this.prefijo = prefijo;
    }

    /**
     * Obtiene el prefijo asignado al generador.
     * 
     * @return String que representa el prefijo del código
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * Asigna un nuevo prefijo al generador de códigos.
     * 
     * @param prefijo Cadena que representa el nuevo prefijo
     */
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    /**
     * Verifica si el código proporcionado cumple con el formato válido
     * según el tipo de generador.
     * 
     * @param codigo Código a validar
     * @return true si el formato es válido, false en caso contrario
     */
    public abstract boolean tieneFormatoValido(String codigo);
   
    /**
     * Genera un código con el formato definido por la clase hija.
     * 
     * @return Código generado en formato String
     */
    public abstract String generarCodigo();
}


