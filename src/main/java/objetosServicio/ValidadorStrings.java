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

public class ValidadorStrings {
    
    //REVISADO Y FUNCIONANDO
    public static boolean superaTamanioMaximo(String texto, int tamanioMaximo){
        boolean resultado = true;
        int longitud = texto.toCharArray().length;

        if (tamanioMaximo >= longitud){
            resultado = false;
        }
        return resultado;
    }

    //REVISADO Y FUNCIONANDO
    public static boolean careceTamanioMinimo(String texto, int tamanioMinimo){
        boolean resultado = true;
        int longitud = texto.toCharArray().length;

        if (tamanioMinimo <= longitud){
            resultado = false;
        }
       
        return resultado;
    }
  
    //REVISADO Y FUNCIONANDO
    //DA TRUE SI EL TEXTO TIENE NADA, ESPACIOS O ENTERS
    public static boolean estaVacio(String texto){
        boolean resultado = texto.isBlank();

        return resultado;
    }

    //REVISADO Y FUNCIONANDO
    //VERIFICA QUE EL TEXTO INGRESADO SEAN SOLO NUMEROS, DA TRUE SI CUMPLE
    public static boolean contieneSoloNumeros(String texto){
        boolean resultado = texto.matches("\\d+");
        
        return resultado;
    }

    //REVISADO Y FUNCIONANDO
    //VERIFICA QUE EL TEXTO INGRESADO SEAN SOLO LETRAS, DA TRUE SI CUMPLE
    public static boolean contieneSoloLetras(String texto){

        boolean resultado = texto.matches("^\\p{L}+$");
         
        return resultado;
    }

    //REVISADO Y FUNCIONANDO
    //VERIFICA QUE LA CONTRASEÑA CUMPLA CON ENTRE 8 Y 12 CARACTERES, AL MENOS UN NUMERO, 
    // UNA LETRA MINUSCULA, UNA MAYUSCULA Y UN CARACTER ESPECIAL
    public static boolean esPasswordValido(String texto){

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,12}$";

        System.out.println(texto.matches(regex));

        return texto.matches(regex);

    }

    //REVISADO Y FUNCIONANDO 
    //VALIDA QUE LA FECHA INGRESADA CUMPLA CON EL FORMATO CON /
    //Y CEROS A LA IZQ EN VALORES DE UN DIGITO, TAMBIEN FECHAS VALIDAS
    public static boolean esFechaValida(String texto){
        boolean resultado = true;
        try {
            LocalDate.parse(
            texto,
            DateTimeFormatter.ofPattern("dd/MM/uuuu")
            .withResolverStyle(ResolverStyle.STRICT)
        );
        return true;}
        catch (Exception e){
            resultado = false;
        }
        return resultado;
 }
    

//REVISADO Y FUNCIONANDO
    //VALIDA QUE EL TEXTO INGRESADO SE LEA DE IGUAL FORMA AL DERECHO
    // Y AL REVES SIN CONSIDERAR ESPACIOS O MAYUSCULAS
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