/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JorgeEG07
 */
public class  GeneradorCodigosAleatorios extends GeneradorCodigos{

    public GeneradorCodigosAleatorios(String prefijo) {
        super("ALE");  
    }

    public static String obtenerAleatorio() {

        int num = (int) (Math.random() * 9999) +1; // genera un numero entre 1 y 9999
        return String.format("%04d", num); //asegura cuatro digitos

    }
    
    @Override
    public boolean tieneFormatoValido(String codigo) {
       return codigo.matches("ALE-\\d{4}"); //verifica que el formato sea "ALE-XXXX" donde XXXX son 4 digitos
    }

    @Override
    public String generarCodigo() {
        return getPrefijo() + "-" + obtenerAleatorio(); //genera el codigo con el prefijo y el numero aleatorio
    }
}

