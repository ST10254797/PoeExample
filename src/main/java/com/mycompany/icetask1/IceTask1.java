/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.icetask1;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class IceTask1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Sname= " Sammy's Seashore Supplies";
        final double IHOUR= 40;
        final double IMIN= 1;   
        int ikayak ,icanoes , ichairs , iumbrella;
        double dtotalH, dtotalI, dtotalboth;  // totals for the program
       
        System.out.print(Sname);
        System.out.println("===============================");
        // This is for hours
        System.out.print("Enter number of hours");
       System.out.print("Enter Number of hours the kayak were rented for");
       ikayak = input.nextInt();
       
        System.out.print("Enter Number of hours the Canoes were rented for ");
       icanoes = input.nextInt();
       
        System.out.print("Enter Number of hours the beach chairs were rented for");
       ichairs = input.nextInt();
       
        System.out.print("Enter Number of hours the Umbrella were rented for ");
       iumbrella = input.nextInt();
       System.out.println("===============================");
       
       // this is for minutes
       System.out.print("Enter number of minutes");
       int NumofMins = input.nextInt();
       dtotalI= NumofMins*IMIN;
      // dtotalI= (NumofMins)+(IMIN/60 * NumofMins) * (NumofMins % 60) ; // hectic calculation
      
       System.out.println("===============================");
       dtotalH =(ikayak+icanoes+ichairs+iumbrella) * IHOUR;
       System.out.println(dtotalH +"is number of hours the equipment was rented for");
      // dtotalI =(ikayak+icanoes+ichairs+iumbrella) * IMIN;  // Another kind of calculation
       System.out.println(dtotalI + "is number of minutes over time");
       dtotalboth= dtotalH+dtotalI;
       System.out.println("===============================");
       System.out.println(dtotalboth +" is your final total");
       System.out.println("===============================");
       System.out.println("""
                          Thank you for renting with us 
                          we hope that you will rent with us again""");
    }
}
