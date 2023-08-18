package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

    public static void main(String[] args) {
        Converter csvConverter = new CSVConverter();
        Converter jsonConverter = new JsonConverter();

        ITGuy it = new ITGuy("Maurice Moss", 32, 4000d);
        ProjectManager pm = new ProjectManager("Jen Barber", 40, 6000d);

        System.out.println();

        System.out.println("---------- CSV Formatted ----------");
        System.out.println(csvConverter.getEmployeeFormatted(it));

        System.out.println("---------- JSON Formatted ----------");
        System.out.println(jsonConverter.getEmployeeFormatted(it));

        System.out.println("---------- CSV Formatted ----------");
        System.out.println(csvConverter.getEmployeeFormatted(pm));

        System.out.println("---------- JSON Formatted ----------");
        System.out.println(jsonConverter.getEmployeeFormatted(pm));
    }

}