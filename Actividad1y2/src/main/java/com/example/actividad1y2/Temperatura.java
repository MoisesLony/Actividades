package com.example.actividad1y2;

import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class Temperatura {
    @WebMethod(operationName = "Fahrenheit2Celcius")
    public String Fahrneit2Celcius(@WebParam(name = "temperaturaFahrenheit") Double grad) {
        double cels = ((grad - 32)* 5)/9;
        return "Celsius :" + cels;
    }

    @WebMethod(operationName = "Celsius2Fahrenheit")
    public String Celcius2Fahrenheit (@WebParam(name = "temperaturaCelcius") Double grad)
    {
        double fahren = (grad * 9/5) + 32;
        return "Fahrenheit :" + fahren;
    }
}
