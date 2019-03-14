package edu.xavier.csci;
import java.util.Random;
import java.util.Scanner;

public class Lock {


    private int x;
    private int y;
    private int z;


    public Lock(){

        this.x = 0;
        this.y = 0;
        this.z = 0;


    }// end constuctor

    public static int setCode(){

        Random rand = new Random();

        int x = rand.nextInt((39 - 0)+ 1);
        int y = rand.nextInt((39 - 0)+ 1) ;
        int z = rand.nextInt((39 - 0) + 1);

        System.out.println("The code is " + x +" "+ y + " " + z);
        return  x + y + z;

    }// end setCode

    public static boolean isClosed(boolean c){

        if(c== true){
            isClosed(true);
        }else{
            if(c== false){
                isClosed(false);
            }
        }
        return c;

    }// end is status


    public static int onTop(int z){

        return z;

    }// end on top

    public int leftDirection(){

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Input Second Number");

        while(!scan2.hasNextInt()){
            scan2.next();
        }// end while loop

        int input2 = scan2.nextInt();


        if (input2 == y) {
            System.out.println("Lock turns right");
            isClosed(false);

        }// end else statement


        return y;

    }// end left direction

    public int rightDirection() {// this may not be a void method

        Scanner scan = new Scanner(System.in);


        System.out.println("Input First Number");

        while (!scan.hasNextInt()) {
            scan.next();

            int input = scan.nextInt();

            if (input == x) {
                System.out.println("Lock turns right");
                isClosed(false);

            }// end  statment

            break;
        }

        return x;

    }
    // end if statement

    public int turnRightAgain() {

        Scanner scan3 = new Scanner(System.in);

        System.out.println("Input Third Number");

        while (!scan3.hasNextInt()) {
            scan3.next();

        }// end while loop

        int input3 = scan3.nextInt();

        while(input3 == z){
            isClosed(false);
            System.out.println("Lock is Open");
        }

        return z;
    }// end turn right again

}// end of class
