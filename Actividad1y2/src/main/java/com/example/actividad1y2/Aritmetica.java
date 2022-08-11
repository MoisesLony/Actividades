package com.example.actividad1y2;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;

@WebService
public class Aritmetica {
    @WebMethod(operationName ="Sum")
    public String sum (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 + val2;
        return "Result: " + result;
    }

    @WebMethod(operationName ="Rest")
    public String rest (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 - val2;
        return "Result: " + result;
    }

    @WebMethod(operationName ="Multi")
    public String multi (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        double result = val1 * val2;
        return "Result: " + result;
    }

    @WebMethod(operationName ="Div")
    public String div (@WebParam(name="val1")double val1, @WebParam(name ="val2")double val2)
    {
        if(val2 == 0)
        {
            return "no se puede dividir entre 0";
        }

        double result = val1 / val2;
        return "Result: " + result;
    }
}
