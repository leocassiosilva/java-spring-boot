package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.NumberConverter;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    
    @RequestMapping("/sum/{numerberOne}/{numerberTwo}")
    public Double sum(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        NumberConverter converter = new NumberConverter();

        if (!converter.isNumeric(numerberOne) || !converter.isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return math.sum(converter.convertToDouble(numerberOne), converter.convertToDouble(numerberTwo));
    }


    @RequestMapping("/subtraction/{numerberOne}/{numerberTwo}")
    public Double subtraction(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        NumberConverter converter = new NumberConverter();

        if (!converter.isNumeric(numerberOne) || !converter.isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return math.subtraction(converter.convertToDouble(numerberOne), converter.convertToDouble(numerberTwo));
    }



    @RequestMapping("/multiplication/{numerberOne}/{numerberTwo}")
    public Double multiplication(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {
        NumberConverter converter = new NumberConverter();

        if (!converter.isNumeric(numerberOne) || !converter.isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
        
        return math.multiplication(converter.convertToDouble(numerberOne), converter.convertToDouble(numerberTwo));
    }

    @RequestMapping("/division/{numerberOne}/{numerberTwo}")
    public Double division(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        NumberConverter converter = new NumberConverter();

        if (!converter.isNumeric(numerberOne) || !converter.isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
        
        return math.division(converter.convertToDouble(numerberOne) , converter.convertToDouble(numerberTwo));
    }


    @RequestMapping("/mean/{numerberOne}/{numerberTwo}")
    public Double mean(
        @PathVariable("numerberOne") String numerberOne,
        @PathVariable("numerberTwo") String numerberTwo
    ) throws Exception {

        NumberConverter converter = new NumberConverter();

        if (!converter.isNumeric(numerberOne) || !converter.isNumeric(numerberTwo)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return math.mean(converter.convertToDouble(numerberOne) , converter.convertToDouble(numerberTwo));
    }

    @RequestMapping("/square-root/{number}")
    public Double squareRoot(
        @PathVariable("number") String number
    ) throws Exception {
        NumberConverter converter = new NumberConverter();

        if (!converter.isNumeric(number)) 
            throw new UnsupportedOperationException("Please set a numeric value!");
    
        return math.squareRoot(converter.convertToDouble(number));
    }

}
