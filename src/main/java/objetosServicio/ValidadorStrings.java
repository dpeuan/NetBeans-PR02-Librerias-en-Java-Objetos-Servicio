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
    
    /**
     * verifica que el texto sea mas grande que el limite
     * @param texto String que sera medido
     * @param tamanioMaximo int que indica el limite para la longitud del texto
     * @return booleano, true si texto es mayor a tamanioMaximo, false si no
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
     * verifica que el texto ingresado sea mas chico que el minimo
     * @param texto
     * @param tamanioMinimo
     * @return booleano, true si texto es menor a tamanioMinimo, false si no
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
     * verifica que el texto ingresado no este en blanco
     * @param texto String ingresado que sera verificado si esta vacio
     * @return booleano, true si el texto tiene solo espacios, enters o esta vacio, false si no
     */
    public static boolean estaVacio(String texto){
        
        boolean resultado = texto.isBlank();

        return resultado;
    }

    /**
     * verifica que el String ingresado sean solo digitos
     * @param texto String que sera verificado si son solo digitos
     * @return booleano, true si son solo digitos, false si no
     */
    public static boolean contieneSoloNumeros(String texto){
    
        boolean resultado = texto.matches("\\d+");
        
        return resultado;
    }

    /**
     * verifica que el texto ingresado sean solo letras
     * @param texto String que sera verificado, si son solo letras
     * @return booleano, true si son solo letras, false si no
     */
    public static boolean contieneSoloLetras(String texto){
    
        boolean resultado = texto.matches("^\\p{L}+$");
         
        return resultado;
    }

    /**
     * verifica que la contraseña tenga entre 8 y 12 caracteres, al menos 
     * un numero, una letra minuscula, una mayuscula y un caracter especial
     * @param texto String que representa la contraseña y sera validado
     * @return booleano, true si cumple todas las condiciones, false si no
     */
    public static boolean esPasswordValido(String texto){

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,12}$";

        System.out.println(texto.matches(regex));

        return texto.matches(regex);
    }

    /**
     * valida que la fecha ingresada cumpla con formato XX/XX/XXXX, que mantenga
     * ceros a la izqueirda en valores de un solo digito y tenga fecha existente
     * @param texto String que es la fecha que sera validada  
     * @return booleano,
     */
    public static boolean esFechaValida(String texto){
    //VALIDA QUE LA FECHA INGRESADA CUMPLA CON EL FORMATO CON /
    //Y CEROS A LA IZQ EN VALORES DE UN DIGITO, TAMBIEN FECHAS VALIDAS
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
   
    public static boolean esPalindromo(String texto){
         //VALIDA QUE EL TEXTO INGRESADO SE LEA DE IGUAL FORMA AL DERECHO
    // Y AL REVES SIN CONSIDERAR ESPACIOS O MAYUSCULAS
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