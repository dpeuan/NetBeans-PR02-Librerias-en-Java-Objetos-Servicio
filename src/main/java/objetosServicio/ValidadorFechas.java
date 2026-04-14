package objetosServicio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dpeuan
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * Clase que contiene métodos estáticos para validar fechas
 */
public class ValidadorFechas {
    
    /**
     * Verifica si una fecha es futura respecto a la fecha actual.
     * 
     * @param fecha Fecha a evaluar
     * @return true si es futura, false en caso contrario
     */
    public static boolean esFechaFutura(LocalDate fecha){ 
        boolean resultado = fecha.isAfter(LocalDate.now());
        return resultado;
    }

    /**
     * Verifica si una fecha es pasada respecto a la fecha actual.
     * 
     * @param fecha Fecha a evaluar
     * @return true si es pasada, false en caso contrario
     */
    public static boolean esFechaPasada(LocalDate fecha){
        boolean resultado = fecha.isBefore(LocalDate.now());
        return resultado;
    }

    /**
     * Verifica si una persona es mayor de edad (18 años).
     * 
     * @param fechaNacimiento Fecha de nacimiento
     * @return true si es mayor de edad, false en caso contrario
     */
    public static boolean esMayorEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        boolean resultado = fechaNacimiento.isAfter(hoy.plusYears(18));
        return resultado;
    }

    /**
     * Verifica si una fecha se encuentra dentro de un rango.
     * 
     * @param fecha Fecha a evaluar
     * @param desde Fecha inicial
     * @param hasta Fecha final
     * @return true si está dentro del rango, false en caso contrario
     */
    public static boolean estaDentroRango(LocalDate fecha, LocalDate desde, LocalDate hasta){
        boolean resultado1 = fecha.isAfter(desde);
        boolean resultado2 = fecha.isBefore(hasta);
        boolean resultado3 = true;
        
        if ((resultado1 != resultado2)) {
            resultado3 = false;
        }
        return resultado3;
    }

    /**
     * Verifica si una fecha corresponde a fin de semana.
     * 
     * @param fecha Fecha a evaluar
     * @return true si es sábado o domingo, false en caso contrario
     */
    public static boolean esFinDeSemana(LocalDate fecha){
        
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        boolean resultado = true;

        if ((diaDeLaSemana != DayOfWeek.SATURDAY) && (diaDeLaSemana != DayOfWeek.SUNDAY)){
            resultado = false;
        }
        
        return resultado;
    }

    /**
     * Verifica si una fecha y hora están dentro del horario laboral.
     * 
     * @param fecha Fecha y hora a evaluar
     * @return true si está dentro del horario laboral, false en caso contrario
     */
    public static boolean esHorarioLaboral(LocalDateTime fecha){
        
        boolean resultado = true;
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        LocalTime hora = fecha.toLocalTime();
        LocalTime inicioHorarioLaboral = LocalTime.of(8, 00);
        LocalTime finHorarioLaboralES = LocalTime.of(18, 00);
        LocalTime finHorarioLaboralFS = LocalTime.of(13, 00);
        
        if ((diaDeLaSemana == DayOfWeek.MONDAY) || (diaDeLaSemana == DayOfWeek.TUESDAY) || (diaDeLaSemana == DayOfWeek.WEDNESDAY) || (diaDeLaSemana == DayOfWeek.THURSDAY) || (diaDeLaSemana == DayOfWeek.FRIDAY)){
            if ((hora.isBefore(inicioHorarioLaboral)) || (hora.isAfter(finHorarioLaboralES))){
                resultado = false;
            }
        }
        
        if ((diaDeLaSemana == DayOfWeek.SATURDAY)){
            if ((hora.isBefore(inicioHorarioLaboral)) || (hora.isAfter(finHorarioLaboralFS))){
                resultado = false;    
            }
        }
        
        if ((diaDeLaSemana == DayOfWeek.SUNDAY)){
            resultado = false;    
        }

        return resultado;
    } 
}