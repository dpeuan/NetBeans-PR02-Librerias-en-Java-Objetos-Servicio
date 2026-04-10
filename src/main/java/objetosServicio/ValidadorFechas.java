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


public class ValidadorFechas {
//REVISADO 
    public static boolean esFechaFutura(LocalDate fecha){
        boolean resultado = fecha.isAfter(LocalDate.now());
        return resultado;
    }
//REVISADO
    public static boolean esFechaPasada(LocalDate fecha){
        boolean resultado = fecha.isBefore(LocalDate.now());
        return resultado;
    }
//REVISADO
    public static boolean esMayorEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now();
        boolean resultado = fechaNacimiento.isAfter(hoy.plusYears(18));
        return resultado;
    }
//REVISADO
    public static boolean estaDentroRango(LocalDate fecha, LocalDate desde, LocalDate hasta){
        boolean resultado1 = fecha.isAfter(desde); //deberia dar true
        boolean resultado2 = fecha.isBefore(hasta); //deberia dar true tambien
        boolean resultado3 = true;  
        
        if ((resultado1 != resultado2)) {    // en caso que no sean true ambos, no entraran en el rango
            resultado3 = false;              // y el resultado sera false
        }

        return resultado3;
    }
//REVISADO
    public static boolean esFinDeSemana(LocalDate fecha){
        
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        boolean resultado = true;

        if ((diaDeLaSemana != DayOfWeek.SATURDAY) && (diaDeLaSemana != DayOfWeek.SUNDAY)){
            resultado = false;
        }
        
        return resultado;
    }
//REVISADO
    public static boolean esHorarioLaboral(LocalDateTime fecha){
        
        boolean resultado = true;
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        LocalTime hora = fecha.toLocalTime();
        LocalTime inicioHorarioLaboral = LocalTime.of(8, 00);
        LocalTime finHorarioLaboralES = LocalTime.of(18, 00);
        LocalTime finHorarioLaboralFS = LocalTime.of(13, 00);
            //ENTRE SEMANA - ENTRE 8 Y 18
        if ((diaDeLaSemana == DayOfWeek.MONDAY) || (diaDeLaSemana == DayOfWeek.TUESDAY) || (diaDeLaSemana == DayOfWeek.WEDNESDAY) || (diaDeLaSemana == DayOfWeek.THURSDAY) || (diaDeLaSemana == DayOfWeek.FRIDAY)){
            if ((hora.isBefore(inicioHorarioLaboral)) || (hora.isAfter(finHorarioLaboralES))){
                resultado = false;
            }
        }
            //SABADO - ENTRE 8 Y 13
        if ((diaDeLaSemana == DayOfWeek.SATURDAY)){
            if ((hora.isBefore(inicioHorarioLaboral)) || (hora.isAfter(finHorarioLaboralFS))){
                resultado = false;    
            }
        }
            //DOMINGO - NO ADMITE NADA DE DOMINGO
        if ((diaDeLaSemana == DayOfWeek.SUNDAY)){
            resultado = false;    
        }
        System.out.println(resultado);
    return resultado;
    } 

}
