package com.fizzbuzz;

public class FizzBuzz {
    private Integer number;

    public FizzBuzz(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static void main(String[] args) {
        int num;
        System.out.println("Secuencia de numeros");
        System.out.println("Del 1 al 100");
        System.out.print("Serie: ");

        for (num = 1; num <= 100; num++) {
            if(num % 3 == 0 && num % 5 == 0){
                System.out.print("fizzbuzz, ");
                continue;
            }
            if(num % 3 == 0){
                System.out.print("fizz, ");
                continue;
            }
            if(num % 5 == 0){
                System.out.print("buzz, ");
                continue;
            }
            System.out.print(num + ", ");
        }
    }

    public String fizzBuzz () {
        if(this.number % 3 == 0 && this.number % 5 == 0){
            return "fizzbuzz";
        }
        if(this.number % 3 == 0){
            return "fizz";
        }
        if(this.number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(this.number);
    }

}
