package com.Klasa3P;

import java.util.Scanner;

public class Main2
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
        if (wczytana == wylosowana)
        {
            System.out.println("gratulację liczba znaleziona");
        }
        else
        {
            System.out.println("niestety nie udało się, ale ...");
            int roznica =wylosowana>wylosowana ? wylosowana - wczytana : wczytana - wylosowana;
            //wyrażenie warunkowe zwraca wartosc
            //warunek ? zwracana wart jeżeli warunek jest prawdziwy: zwr wart war fałszywy
            roznica =roznica/10;//dzielenie całkowite, bo różnica jest int
            switch (roznica)
            {
                case 0:
                    System.out.println("Było bardzo blisko");
                    break;
                case 1:
                    System.out.println("Było blisko");
                    break;
                case 2:
                    System.out.println("Trochę brakowało");
                    break;
                default:
                    System.out.println("Spróbuj szczęścia gdzieś indziej");
            }
            //switch jako wyrażenie warunkowe
            System.out.println(switch (roznica)
                    {
                        case 0 -> "Było bardzo blisko";
                        case 1 -> "Było blisko";
                        case 2 -> "Trochę brakowało";
                        default -> "Dużo brakowało";
                    }
                    );
        }
    }
}
