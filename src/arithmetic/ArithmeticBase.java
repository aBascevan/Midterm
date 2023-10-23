/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * 
 *   Student Alexander Bascevan ID:991566471
 */
public class ArithmeticBase 
{
    public enum Operations{
        PLUS,
        MINUS,
        TIMES,
        DIVIDE
    }
    
 public double x,y;
    double calculate(double x, double y) 
        {
            
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter arithmetic operation to Perform: ");
        String s= sc.next();
        
        switch (s.toUpperCase()) 
        {
            case s.equals(Operations.valueOf("PLUS")):
                return x + y;
            case s.equals(Operations.valueOf("MINUS")):
                return x - y;
            case s.equals(Operations.valueOf("TIMES")):
                return x * y;
            case s.equals(Operations.valueOf("DIVIDE")):
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
   
}
