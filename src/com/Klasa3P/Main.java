package com.Klasa3P;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w Javie");
        int wylosowana = (int) (Math.random() * 100 + 1);
        //system.out.println("Wylosowano "+wylosowana)
        //zgaduj tak długo aż zgadniesz

        Scanner klawiatura = new Scanner(System.in);
        int wczytana;
        do
        {
            System.out.println("Podaj liczbę");
            wczytana = klawiatura.nextInt();//Pobieranie anstępnej liczb z klaiatury
            if (wczytana == wylosowana)
            {
                System.out.println("gratulację liczba znaleziona");
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
        while(true);//dopóki warunek jest prawidłowy to wykonuj dalej pętlę
    }
}
