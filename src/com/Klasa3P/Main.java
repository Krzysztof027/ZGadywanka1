package com.Klasa3P;

import java.util.Scanner;

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
        Scanner klawiatura = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int wczytana;
        wczytana = klawiatura.nextInt();//Pobieranie anstępnej liczb z klaiatury
        System.out.println("wpisałeś"+wczytana);
    }
}
