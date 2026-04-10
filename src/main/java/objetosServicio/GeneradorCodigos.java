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

    public GeneradorCodigos(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public abstract boolean tieneFormatoValido(String codigo);
   

    public abstract String generarCodigo();
    
    
}


