package edu.xavier.csci;
import java.util.Random;

public class Lock {

    public int x;
    public int y;
    public int z;

    public Lock(){

        this.x = 0;
        this.y = 0;
        this.z = 0;

    }// end constuctor

    public void setcode(){

        Random rand = new Random();

        this.x = rand.nextInt((39 - 0)+ 1)+ 0;
        this.y = rand.nextInt((39 - 0)+ 1) + 0;
        this.z = rand.nextInt((39 - 0)+ 1)+ 0;

    }// end setCode

    public static boolean isClosed(int a, int b, int c){

        while (a == x && b == this.y && c == this.z) {
            return false;
        }
       return true;

    }// end isClosed

    public void lockStaus(){
        //tells the user whether the lock is open or closed


    }// end lock status

    public void code(int a, int b, int c){
        // while the lock is closed

        while (a == this.x && b == this.y && c == this.z){

        }//end while loop



    }// end code

    public static int onTop(int z){

        return z;

    }// end on top

    public void direction(){
        // direction in which to spin

    }

    public void lockReset(){
        Lock l1 = new Lock();
    }





}// end of class
