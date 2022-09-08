package com.Klasa3P;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Witaj w Javie");
        //komentarz jendoliniowy
        /*
        komentarz wieloliniowy
         */
        /**
         * javadoc
         */
        int wylosowana =(int)(Math.random()*100+1);
        //random() losuje liczbę rzeczywistą z zakresu od <0,1)
        //rzutowanie zawezające
        double innaLiczba =wylosowana;//konwersja rozszerzająca
        System.out.println("Wylosowano "+wylosowana);
    }
}
