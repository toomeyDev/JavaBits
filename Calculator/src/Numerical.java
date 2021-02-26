/*
Copyright 2021, Matthew Toomey

This file is part of JavaBits Calculator.

    JavaBits Calculator is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    JavaBits Calculator is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with JavaBits Calculator.  If not, see <https://www.gnu.org/licenses/>.
*/
public class Numerical {
    // setup instance variables to hold the integer, double variations of a number
    private int intVal;
    private double doubleVal;

    // is the number positive or negative?
    private boolean positive;

    /* default construction of a number object */
    public Numerical()
    {
        intVal = 0;
        doubleVal = 0;
        positive = true;
    }

    public Numerical(int number)
    {
        intVal = number;
        positive = number > 0 ? true : false; // check to see if the number is positive or negative
        doubleVal = Double.valueOf(number);

    }

    public Numerical(double number)
    {
        doubleVal = number;
        positive = number > 0 ? true : false; // check to see if the number is positive or negative
        intVal = (int)number;
    }

    /*
    Addition operations
    for both integers & floating point
    */
    public int sum(int addend)
    {
        intVal += addend;
        positive = intVal > 0 ? true : false; // check to see if the number is positive or negative
        doubleVal = Double.valueOf(intVal);
        return intVal;
    }

    public double sum(double addend)
    {
        doubleVal += addend;
        positive = doubleVal > 0 ? true : false; // check to see if the number is positive or negative
        intVal = (int)doubleVal;
        return doubleVal;
    }

    /*
    Subtraction operations
    for both integers & floating point
    */
    public int subtract(int subtrahend)
    {
        intVal -= subtrahend;
        positive = intVal > 0 ? true : false; // check to see if the number is positive or negative
        doubleVal = Double.valueOf(intVal);
        return intVal;
    }

    public double subtract(double subtrahend)
    {
        doubleVal -= subtrahend;
        positive = doubleVal > 0 ? true : false; // check to see if the number is positive or negative
        intVal = (int)doubleVal;
        return doubleVal;
    }


    /*
    Multiplication operations
    for both integers & floating point
    */
    public int multiply(int multiplier)
    {
        intVal *= multiplier;
        positive = intVal > 0 ? true : false; // check to see if the number is positive or negative
        doubleVal = Double.valueOf(intVal);
        return intVal;
    }

    public double multiply(double multiplier)
    {
        doubleVal *= multiplier;
        positive = doubleVal > 0 ? true : false; // check to see if the number is positive or negative
        intVal = (int)doubleVal;
        return doubleVal;
    }


    /*
    Division operations
    for both integers & floating point
    */
    public int divide(int divisor)
    {
        intVal /= divisor;
        positive = intVal > 0 ? true : false; // check to see if the number is positive or negative
        doubleVal = Double.valueOf(intVal);
        return intVal;
    }

    public double divide(double divisor)
    {
        doubleVal /= divisor;
        intVal = (int)doubleVal;
        positive = doubleVal > 0 ? true : false; // check to see if the number is positive or negative
        return doubleVal;
    }

    /*
    Return the value of this number as either an int or a double
    */
    public int getValueInt()
    {
        return intVal;
    }

    public double getValueDouble()
    {
        return doubleVal;
    }

    // return the positive/negative status of this numerical
    public boolean isPositive()
    {
        return positive;
    }

    /*
    Methods to execute the specified operation
    and print out the resultant values
    for integer/double values
    */
    public void showOperation(String op, int n)
    {
        op = op.toLowerCase();
        switch (op) {
            case "add":
                System.out.println(sum(n));
                break;
            case "subtract":
                System.out.println(subtract(n));
                break;
            case "multiply":
                System.out.println(multiply(n));
                break;
            case "divide":
                System.out.println(divide(n));
                break;
            default: System.out.println("Invalid input, valid inputs are 'add', 'subtract' 'multiply' and 'divide' ");
        }
    }

    public void showOperation(String op, double n)
    {
        op = op.toLowerCase();
        switch (op) {
            case "add":
                System.out.println(sum(n));
                break;
            case "subtract":
                System.out.println(subtract(n));
                break;
            case "multiply":
                System.out.println(multiply(n));
                break;
            case "divide":
                System.out.println(divide(n));
                break;
            default: System.out.println("Invalid input, valid inputs are 'add', 'subtract' 'multiply' and 'divide' ");
        }
    }

}
