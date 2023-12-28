/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author SWAMI COMPUTERS
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Admin Ad=new Admin();
        Hr H=new Hr();
        Tech Tc=new Tech();
       Scanner myvariable = new Scanner(System.in);  // Create a Scanner object
       System.out.println("Enter variable");
       int i=myvariable.nextInt();
       if(i==1)
       {
       String a=Ad.departmentName();
       System.out.println(a);
       String b=Ad.getTodaysWork();
       System.out.println(b);
       String c=Ad.getWorkDeadLine();
       
       System.out.println(c);
       String d=Ad.isTodayHolidaywillreturn();
       System.out.println(d);
    }
       if(i==2)
       {
           System.out.println("Welcome to HR department");
       String e=H.departmentName();
       System.out.println(e);
       String f=H.getTodaysWork();
       System.out.println(f);
       String g=H.getWorkDeadLine();
       System.out.println(g);
       String h=H.isTodayHolidaywillreturn();
       System.out.println(h);
       }
    if(i==3)
       {
           System.out.println("Welcome to Tech department");
       String m=Tc.departmentName();
       System.out.println("Welcome to");
       
       System.out.println(m);
       String j=Tc.getTodaysWork();
       System.out.println(j);
       String k=Tc.getWorkDeadLine();
       System.out.println(k);
       String l=Tc.getTechStackInformation();
       System.out.println(l);
       String n=Tc.isTodayHolidaywillreturn();
       System.out.println(n);
       }
}}
