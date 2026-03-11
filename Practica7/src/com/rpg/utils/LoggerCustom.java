package com.rpg.utils;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LoggerCustom {
    public LoggerCustom(){
    }
    public void escribirLog(String mensaje){
        try (PrintWriter file = new PrintWriter("practica7\\ficheros\\errores.log")){

            file.println("["+ LocalDate.now()+" "+ LocalTime.now()+"]: ERROR - "+mensaje);
            //file.close();
            System.out.println("Escritura realizada.");
        }
        catch(FileNotFoundException e){
            System.err.println("No se ha encontrado el fichero errores.log");
        }
    }
}
