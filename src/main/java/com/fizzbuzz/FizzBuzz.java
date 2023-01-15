package com.fizzbuzz;

public class FizzBuzz {
    private Integer number;

    public FizzBuzz() {
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    public String fizzBuzzTwo () {
        String numberToString = String.valueOf(this.number);
        if((numberToString.contains("3") || this.number % 3 == 0) && (numberToString.contains("5") || this.number % 5 == 0)){
            return "fizzbuzz";
        }
        if(numberToString.contains("3") || this.number % 3 == 0){
            return "fizz";
        }
        if(numberToString.contains("5") || this.number % 5 == 0){
            return "buzz";
        }
        return String.valueOf(this.number);
    }
}