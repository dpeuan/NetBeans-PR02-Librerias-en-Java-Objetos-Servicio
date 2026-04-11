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
    
    public static boolean esFechaFutura(LocalDate fecha){ 
        boolean resultado = fecha.isAfter(LocalDate.now()); //true si la fecha ingresada es despues de la fecha actual del sistema
        return resultado;
    }

    public static boolean esFechaPasada(LocalDate fecha){
        boolean resultado = fecha.isBefore(LocalDate.now()); //true si la fecha ingresada es antes de la fecha actual del sistema
        return resultado;
    }

    public static boolean esMayorEdad(LocalDate fechaNacimiento){
        LocalDate hoy = LocalDate.now(); //asigna la fecha de hoy
        boolean resultado = fechaNacimiento.isAfter(hoy.plusYears(18)); //calcula si se hacen 18 años desde la fecha de nacimiento a hoy
        return resultado;                                    //da true si cumple
    }

    public static boolean estaDentroRango(LocalDate fecha, LocalDate desde, LocalDate hasta){
        boolean resultado1 = fecha.isAfter(desde); //true si es despues del inicio 
        boolean resultado2 = fecha.isBefore(hasta); //true si es antes de la fecha limite
        boolean resultado3 = true;  //esta se quedara si ambas anteriores son true
        
        if ((resultado1 != resultado2)) {    // en caso que no sean true ambos, no entraran en el rango
            resultado3 = false;              // y el resultado sera false
        }

        return resultado3;
    }

    public static boolean esFinDeSemana(LocalDate fecha){
        
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek(); //obtiene dia de la semana
        boolean resultado = true;

        if ((diaDeLaSemana != DayOfWeek.SATURDAY) && (diaDeLaSemana != DayOfWeek.SUNDAY)){
            resultado = false;  //si es un dia diferente a sabado o domingo, dara false
        }
        
        return resultado;
    }

    public static boolean esHorarioLaboral(LocalDateTime fecha){
        
        boolean resultado = true;
        DayOfWeek diaDeLaSemana = fecha.getDayOfWeek();
        LocalTime hora = fecha.toLocalTime();
        LocalTime inicioHorarioLaboral = LocalTime.of(8, 00);
        LocalTime finHorarioLaboralES = LocalTime.of(18, 00);
        LocalTime finHorarioLaboralFS = LocalTime.of(13, 00);
        
            //verifica que sea ENTRE SEMANA, con la hora ENTRE 8 Y 18
        if ((diaDeLaSemana == DayOfWeek.MONDAY) || (diaDeLaSemana == DayOfWeek.TUESDAY) || (diaDeLaSemana == DayOfWeek.WEDNESDAY) || (diaDeLaSemana == DayOfWeek.THURSDAY) || (diaDeLaSemana == DayOfWeek.FRIDAY)){
            if ((hora.isBefore(inicioHorarioLaboral)) || (hora.isAfter(finHorarioLaboralES))){
                resultado = false;
            }
        }
        
            //verifica que sea SABADO, con la hora ENTRE 8 Y 13
        if ((diaDeLaSemana == DayOfWeek.SATURDAY)){
            if ((hora.isBefore(inicioHorarioLaboral)) || (hora.isAfter(finHorarioLaboralFS))){
                resultado = false;    
            }
        }
        
            //verifica que sea DOMINGO - false directamente
        if ((diaDeLaSemana == DayOfWeek.SUNDAY)){
            resultado = false;    
        }
        System.out.println(resultado);
    return resultado;
    } 

}
