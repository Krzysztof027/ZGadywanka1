package com.Klasa3P;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w Javie");
        int wylosowana = (int) (Math.random() * 100 + 1);
        //system.out.println("Wylosowano "+wylosowana)
        //zgaduj 10 razy chyba, że wcześniej ci się uda

        Scanner klawiatura = new Scanner(System.in);
        int wczytana;
        boolean czyWygrana = false;
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Podaj liczbę");
            wczytana = klawiatura.nextInt();//Pobieranie anstępnej liczb z klaiatury
            if (wczytana == wylosowana)
            {
                System.out.println("gratulację liczba znaleziona");
                czyWygrana=true;
                break;
            }
            if(wczytana<wylosowana)
            {
                System.out.println("Wpisz więcej");
            }
            else
            {
                System.out.println("Wpisz mniej");
            }
        }
        if(!czyWygrana)
        {
            System.out.println("Niestety, ale nie udalo się, ale...");
        }
    }
}
