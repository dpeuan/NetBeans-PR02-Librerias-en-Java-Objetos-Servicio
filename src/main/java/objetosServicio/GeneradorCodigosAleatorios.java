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
 * Clase que genera códigos aleatorios con el formato ALE-XXXX,
 * donde XXXX es un número de 4 dígitos.
 */
public class GeneradorCodigosAleatorios extends GeneradorCodigos{

    /**
     * Constructor que asigna el prefijo "ALE" para los códigos generados.
     */
    public GeneradorCodigosAleatorios() {
        super("ALE");  
    }

    /**
     * Genera un número aleatorio entre 1 y 9999 asegurando que tenga 4 dígitos.
     * 
     * @return Cadena con un número aleatorio de 4 dígitos
     */
    public static String obtenerAleatorio() {
        int num = (int) (Math.random() * 9999) +1; 
        return String.format("%04d", num); 
    }
    
    /**
     * Verifica que el código tenga el formato "ALE-XXXX".
     * 
     * @param codigo Código a validar
     * @return true si cumple el formato, false en caso contrario
     */
    @Override
    public boolean tieneFormatoValido(String codigo) {
       return codigo.matches("ALE-\\d{4}"); 
    }

    /**
     * Genera un código con el prefijo "ALE" seguido de un número aleatorio.
     * 
     * @return Código generado con formato ALE-XXXX
     */
    @Override
    public String generarCodigo() {
        return getPrefijo() + "-" + obtenerAleatorio(); 
    }
}