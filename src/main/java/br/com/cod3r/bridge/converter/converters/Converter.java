package br.com.cod3r.bridge.converter.converters;

import br.com.cod3r.bridge.converter.employees.Employee;

public interface Converter {

    String getEmployeeFormatted(Employee emp);

}