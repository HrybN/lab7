package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введіть 3 числа через кому (від 1 до 3): ");
        Scanner scan = new Scanner(System.in);
        String chysla = scan.nextLine();
        scan.close();

        String[] strMasyvChysel = chysla.split(",");

        int[] rozigrash = new int[3];
        Random r = new Random();
        int i = 0;
        while (i != 3) {
            boolean isnue = false;
            int a1 = r.nextInt(3);

            for (int b1 : rozigrash) {
                if (b1 == a1) {
                    isnue = true;
                    break;
                }
            }
            if(isnue!=true){
                rozigrash[i++] = a1;
            }
        }
        int kst = 0;
        for(int k = 0; k < strMasyvChysel.length; k++){
            int chyslo = Integer.parseInt(strMasyvChysel[k]);
            for(int vygrash: rozigrash){
                if(chyslo == vygrash){
                    kst++;
                }
            }
        }
        String vse = "";
        for(int Chyslo: rozigrash){
            vse = vse + Chyslo + " ";
        }
        System.out.println("У розіграші співпало (" + vse + ") " + kst);
    }
}
