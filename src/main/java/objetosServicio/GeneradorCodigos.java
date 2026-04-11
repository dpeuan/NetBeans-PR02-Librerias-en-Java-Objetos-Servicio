/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JorgeEG07
 */
public abstract class GeneradorCodigos {

    protected String prefijo;

    /**
     * 
     * @param prefijo 
     */
    public GeneradorCodigos(String prefijo) {
        this.prefijo = prefijo;
    }

    /**
     * obtenemos el prefijo asignado en una de las dos clases hijas
     * @return regresa el String del prefijo usado en un codigo
     */
    public String getPrefijo() {
        return prefijo;
    }

    /**
     * asigna el prefijo ingresado en una de las dos clases hijas
     * @param prefijo recibe el String prefijo 
     */
    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    /**
     * 
     * @param codigo
     * @return 
     */
    public abstract boolean tieneFormatoValido(String codigo);
   
    /**
     * 
     * @return 
     */
    public abstract String generarCodigo();
    
    
}


