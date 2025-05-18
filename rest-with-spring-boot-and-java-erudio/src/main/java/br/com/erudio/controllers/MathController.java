package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numerberOne}/{numerberTwo}")
    public Double sum(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        if (!isNumeric(numerberOne) || !isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return convertToDouble(numerberOne) + convertToDouble(numerberTwo);
    }


    @RequestMapping("/subtraction/{numerberOne}/{numerberTwo}")
    public Double subtraction(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        if (!isNumeric(numerberOne) || !isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return convertToDouble(numerberOne) - convertToDouble(numerberTwo);
    }

    @RequestMapping("/multiplication/{numerberOne}/{numerberTwo}")
    public Double multiplication(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        if (!isNumeric(numerberOne) || !isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return convertToDouble(numerberOne) * convertToDouble(numerberTwo);
    }

    @RequestMapping("/division/{numerberOne}/{numerberTwo}")
    public Double division(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        if (!isNumeric(numerberOne) || !isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return convertToDouble(numerberOne) / convertToDouble(numerberTwo);
    }


    @RequestMapping("/mean/{numerberOne}/{numerberTwo}")
    public Double mean(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        if (!isNumeric(numerberOne) || !isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return (convertToDouble(numerberOne) + convertToDouble(numerberTwo)) / 2;
    }

    @RequestMapping("/square-root/{number}")
    public Double squareRoot(
        @PathVariable("number") String number
    ) throws Exception {

        if (!isNumeric(number)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return Math.sqrt(convertToDouble(number));
    }



    // Metodo para converter String para Double
    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
        // Verifica se a string é nula ou vazia
        if (strNumber == null || strNumber.isEmpty()) 
            throw new UnsupportedOperationException("Please set a numeric value!");

        // Aplica a substituição de vírgula por ponto
        String number = strNumber.replace(",", ".");
        
        // retorna o valor convertido para Double
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        // Verifica se a string é nula ou vazia
        if (strNumber == null || strNumber.isEmpty()) return false;

        // Aplica a substituição de vírgula por ponto
        String number = strNumber.replace(",", ".");

        // Verifica se a string é numérica
        // O regex verifica se a string é um número inteiro ou decimal
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }

}
