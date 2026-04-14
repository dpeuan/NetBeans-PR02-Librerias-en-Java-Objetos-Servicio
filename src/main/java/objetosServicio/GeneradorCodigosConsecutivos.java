package objetosServicio;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JorgeEG07
 */
/**
 * Clase que genera códigos consecutivos con el formato CON-X,
 * donde X es un número incremental.
 */
public class GeneradorCodigosConsecutivos extends GeneradorCodigos{

    /**
     * Número consecutivo que se incrementa en cada generación de código.
     */
    protected int consecutivo = 0;
    
    /**
     * Constructor que asigna el prefijo "CON".
     */
    public GeneradorCodigosConsecutivos() {
        super("CON"); 
    }
    
    /**
     * Incrementa en 1 el valor del consecutivo.
     * 
     * @param consecutivo Valor actual del consecutivo
     * @return Cadena con el consecutivo incrementado
     */
    public static String incrementarConsecutivo(int consecutivo){
        consecutivo++;  
        return String.valueOf(consecutivo);
    }
    
    /**
     * Verifica si el código tiene el formato CON-X.
     * 
     * @param codigo Código a validar
     * @return true si coincide con el formato esperado, false en caso contrario
     */
    @Override
    public boolean tieneFormatoValido(String codigo){
        return codigo.matches("CON-" + consecutivo); 
    }
    
    /**
     * Genera un código con el formato CON-X utilizando el consecutivo.
     * 
     * @return Código generado con formato CON-X
     */
    @Override 
    public String generarCodigo(){
        return getPrefijo() + "-" + incrementarConsecutivo(consecutivo);
     }
}