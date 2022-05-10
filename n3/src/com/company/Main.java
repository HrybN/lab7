package com.company;

public class Main {

    public static void main(String[] args) {
	    int i = (int) Math.round(Math.random() * 101);
        System.out.println(i);

        if(i/100>0)
            System.out.println("Це трицифрове число");
        else if(i/10>0)
            System.out.println("Це двоцифрове число");
        else
            System.out.println("Це одноцифрове число");
    }
}
