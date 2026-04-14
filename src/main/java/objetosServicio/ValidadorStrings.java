package objetosServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dpeuan
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

/**
 * Clase que contiene métodos estáticos para validar diferentes
 * características de cadenas de texto.
 */
public class ValidadorStrings {
    
    /**
     * Verifica si el texto supera el tamaño máximo permitido.
     * 
     * @param texto Cadena a evaluar
     * @param tamanioMaximo Tamaño máximo permitido
     * @return true si lo supera, false en caso contrario
     */
    public static boolean superaTamanioMaximo(String texto, int tamanioMaximo){
        
        boolean resultado = true;
        int longitud = texto.toCharArray().length;

        if (tamanioMaximo >= longitud){
            resultado = false;
        }
        return resultado;
    }

    /**
     * Verifica si el texto no alcanza el tamaño mínimo requerido.
     * 
     * @param texto Cadena a evaluar
     * @param tamanioMinimo Tamaño mínimo requerido
     * @return true si no cumple el mínimo, false en caso contrario
     */
    public static boolean careceTamanioMinimo(String texto, int tamanioMinimo){
       
        boolean resultado = true;
        int longitud = texto.toCharArray().length;

        if (tamanioMinimo <= longitud){
            resultado = false;
        }
       
        return resultado;
    }
  
    /**
     * Verifica si el texto está vacío o contiene solo espacios en blanco.
     * 
     * @param texto Cadena a evaluar
     * @return true si está vacío, false en caso contrario
     */
    public static boolean estaVacio(String texto){
        boolean resultado = texto.isBlank();
        return resultado;
    }

    /**
     * Verifica si el texto contiene solo números.
     * 
     * @param texto Cadena a evaluar
     * @return true si contiene solo dígitos, false en caso contrario
     */
    public static boolean contieneSoloNumeros(String texto){
        boolean resultado = texto.matches("\\d+");
        return resultado;
    }

    /**
     * Verifica si el texto contiene solo letras.
     * 
     * @param texto Cadena a evaluar
     * @return true si contiene solo letras, false en caso contrario
     */
    public static boolean contieneSoloLetras(String texto){
        boolean resultado = texto.matches("^\\p{L}+$");
        return resultado;
    }

    /**
     * Verifica si el texto cumple con un formato válido de contraseña.
     * 
     * @param texto Cadena a evaluar
     * @return true si cumple con las reglas, false en caso contrario
     */
    public static boolean esPasswordValido(String texto){
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,12}$";
        return texto.matches(regex);
    }

    /**
     * Verifica si el texto representa una fecha válida en formato dd/MM/yyyy.
     * 
     * @param texto Cadena que representa la fecha
     * @return true si es válida, false en caso contrario
     */
    public static boolean esFechaValida(String texto){
        boolean resultado = true;
        try {
            LocalDate.parse(
                texto,
                DateTimeFormatter.ofPattern("dd/MM/uuuu")
                .withResolverStyle(ResolverStyle.STRICT)
            );
            return true;
        } catch (Exception e){
            resultado = false;
        }
        return resultado;
    }

    /**
     * Verifica si el texto es un palíndromo.
     * 
     * @param texto Cadena a evaluar
     * @return true si es palíndromo, false en caso contrario
     */
    public static boolean esPalindromo(String texto){
        boolean resultado = true;
        int longitud = texto.length();

        for (int i = 0 ; i <= (longitud/2) ; i++) {
            if (texto.charAt(i) != texto.charAt(longitud-i-1)){
                resultado = false;
            }
        }
        return resultado;
    } 
}