package progtetelek;

import java.util.Scanner;

public class bmicalculator {
    public static void main(String[] args) {
        
    }
    
    public static void címkiiratás(){
        System.out.println("BMI index kiszámítása");
    }
    
    public static void adatbekeresek(int kilo, int magassag){
        kilo = 0;
        magassag = 0; 
        
        Scanner src = new Scanner(System.in);
        while(kilo > 40 && kilo < 150 ){
        System.out.println("Tömeg(kg): ");
        kilo = src.nextInt();
        }
        while(magassag > 100 && magassag< 200){
        System.out.println("magasság (cm)");
        magassag = src.nextInt();
        }
        
    }
}
