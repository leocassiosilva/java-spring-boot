package br.com.erudio.request.converters;

public class NumberConverter {
    
    // Metodo para converter String para Double
    public Double convertToDouble(String strNumber) throws IllegalArgumentException {
        // Verifica se a string é nula ou vazia
        if (strNumber == null || strNumber.isEmpty()) 
            throw new UnsupportedOperationException("Please set a numeric value!");

        // Aplica a substituição de vírgula por ponto
        String number = strNumber.replace(",", ".");
        
        // retorna o valor convertido para Double
        return Double.parseDouble(number);
    }

    public boolean isNumeric(String strNumber) {
        // Verifica se a string é nula ou vazia
        if (strNumber == null || strNumber.isEmpty()) return false;

        // Aplica a substituição de vírgula por ponto
        String number = strNumber.replace(",", ".");

        // Verifica se a string é numérica
        // O regex verifica se a string é um número inteiro ou decimal
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }

}
