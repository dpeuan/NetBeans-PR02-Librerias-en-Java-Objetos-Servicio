/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JorgeEG07
 */
public class GeneradorCodigosConsecutivos extends GeneradorCodigos{

    protected int consecutivo = 0;
    
    
    /**
     * establece CON como el prefijo de los codigos generados en esa clase
     * 
     */
    public GeneradorCodigosConsecutivos() {
        super("CON"); 
    }
    
    /**
     * incrementa el consecutivo de este codigo por uno
     * @param consecutivo valor int que es el numero del codigo
     * @return regresa el consecutivo ya incrementado como string
     */
    public static String incrementarConsecutivo(int consecutivo){
        consecutivo++;  
        return String.valueOf(consecutivo);
    }
    
    /**
     * verifica que el formato CON-X sea correcto, true si es verdad
     * @param codigo codigo ingresado por usuario con prefijo y numero
     * @return booleano que dira si es igual (true) o diferente (false)
     */
    @Override
    public boolean tieneFormatoValido(String codigo){
        return codigo.matches("CON-" + consecutivo); 
    }
    
    /**
     *genera codigo con formato CON-X, siendo x el valor consecutivo
     * @return regresa codigo generado con prefijo, guion y numero consecutivo
     */
    @Override 
    public String generarCodigo(){
        return getPrefijo() + "-" + incrementarConsecutivo(consecutivo);
     }
    }
