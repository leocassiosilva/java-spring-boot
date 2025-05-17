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
