/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JorgeEG07
 */
public class  GeneradorCodigosAleatorios extends GeneradorCodigos{

    /**
     * Asigna el prefijo ALE para los codigos generados con esta clase
     * 
     */
    public GeneradorCodigosAleatorios() {
        super("ALE");  
    }

    /**
     * genera un numero entre 1 y 9999
     * @return asegura cuatro digitos
     */
    public static String obtenerAleatorio() {

        int num = (int) (Math.random() * 9999) +1; 
        return String.format("%04d", num); 
    }
    
    /**
     * verifica que el formato sea "ALE-XXXX" donde XXXX son 4 digitos
     * @param codigo es el codigo generado que sera revisado
     * @return booleano, true si el codigo cumple con el formato, false si no
     */
    @Override
    public boolean tieneFormatoValido(String codigo) {
       return codigo.matches("ALE-\\d{4}"); 
    }

    
    /**
     * genera el codigo con el prefijo y el numero aleatorio
     * @return codigo generado con el prefijo ALE, guion y 4 digitos aleatorios
     */
    @Override
    public String generarCodigo() {
        return getPrefijo() + "-" + obtenerAleatorio(); 
    }
}

