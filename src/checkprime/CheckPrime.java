/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkprime;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author QuangAnh
 */
public class CheckPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        boolean isPrime = true;
        System.out.println("Input number need to check:");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        if (a < 1) {
            System.out.println("Number not valid!!!!");
        }
        switch (a) {
            case 1: {
                System.out.println("Not prime");
                break;
            }
            case 2: {
                System.out.println("Prime!!!!!");
                break;
            }
            default: {
                for (int i = 2; i < sqrt(a); i++) {
                    if (a % i == 0) {
                        System.out.println(a + " not a prime!!!!");
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime == true) {
                    System.out.println(a + " is Prime!!!!!");
                }
            }

        }
    }

}
