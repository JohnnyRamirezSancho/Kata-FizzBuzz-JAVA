package com.fizzbuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int num;
        FizzBuzz myFizzBuzz = new FizzBuzz();
        String numberSequence = "";
        System.out.println("Secuencia de numeros del 1 al 100");
        System.out.print("Serie 1:\n");
    
        for (num = 1; num <= 100; num++) {
            myFizzBuzz.setNumber(num);
            numberSequence += myFizzBuzz.fizzBuzz();
            if(num < 100) {
                numberSequence += ", ";
            }
        }
        System.out.print(numberSequence);    

        numberSequence = "";
        System.out.println("\n\nSecuencia de numeros del 1 al 100");
        System.out.print("Serie 2:\n");
        
        for (num = 1; num <= 100; num++) {
            myFizzBuzz.setNumber(num);
            numberSequence += myFizzBuzz.fizzBuzzTwo();
            if(num < 100) {
                numberSequence += ", ";
            }
        }
        System.out.print(numberSequence);    
    }
    
}
