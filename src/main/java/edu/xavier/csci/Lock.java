package edu.xavier.csci;
import java.util.Random;
import java.util.Scanner;

public class Lock {


    private int x;
    private int y;
    private int z;
    private boolean c;


    public Lock(){

        this.x = 0;
        this.y = 0;
        this.z = 0;
        this.c = true;


    }// end constuctor

    public int setCode(){

        Random rand = new Random();

         this.x = rand.nextInt((39 - 0)+ 1);
        this.y = rand.nextInt((39 - 0)+ 1) ;
        this.z = rand.nextInt((39 - 0) + 1);

        System.out.println("The code is " + x +" "+ y + " " + z);
        return  x + y + z;

    }// end setCode

    public boolean isClosed(){

        boolean status = true;

        if(c == true){
            status = true;
        }else{
            if(c== false){
                status = false;
            }
        }
        System.out.println("The Lock is " + status +" ");

        return status;

    }// end is status

    public boolean lockStatus(){
        return this.c;
    }


    public int onTop(){

        return this.z;

    }// end on top

    public int leftDirection(){

        Scanner scan2 = new Scanner(System.in);

        System.out.println("Input Second Number");

        while(!scan2.hasNextInt()){
            scan2.next();

        }// end while loop

        int input2 = scan2.nextInt();
        if(input2 ==y){
            System.out.println("Lock turns left");

        }else{
            System.out.println("Incorrect");
            input2 = scan2.nextInt();
        }

        return y;

    }// end left direction

    public int rightDirection() {// this may not be a void method

        Scanner scan = new Scanner(System.in);


        System.out.println("Input First Number");

        while (!scan.hasNextInt()) {
            scan.next();
        }

            int input = scan.nextInt();

            if(input == x){

                System.out.println("Lock Turns Right!");
            }else{
                System.out.println("Incorrect");
                input = scan.nextInt();
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

        if(input3 == z){

            System.out.println("Lock is Open");
            c = false;
        }else{
            System.out.println("Incorrect");
            input3 = scan3.nextInt();
        }

        return z;
    }// end turn right again

}// end of class
