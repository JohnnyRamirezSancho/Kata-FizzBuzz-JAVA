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
            System.out.print(num + ", ");
        }
    }

    public String fizz () {
        if(this.number % 3 == 0){
            return "fizz";
        }
        return String.valueOf(this.number);
    }

    public String buzz () {
        if(this.number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(this.number);
    }
}
