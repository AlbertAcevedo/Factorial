/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;



import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author aaacevedo
 */
public class Factorial {

    public static BigInteger factorial(int n) {
       BigInteger fact = new BigInteger("1");
       for (int i = 1; i <= n; i++) {
           fact = fact.multiply(new BigInteger(i + ""));
       }
       return fact;
   }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
       System.out.println("Ingrese un numero ");
       int n = sc.nextInt();
       System.out.println("La serie es la siguiente:");
        System.out.println(""+factorial(n));
        // TODO code application logic here
    }
    
}
