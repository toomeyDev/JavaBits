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
    public class Main {
    public static void main(String[] arg){
        Numerical test = new Numerical();
        test.showOperation("add", 5);
        test.showOperation("divide", 2);
        test.showOperation("multiply", 5);
        test.showOperation("subtract", 2345);
        System.out.println(test.isPositive());
    }
}
