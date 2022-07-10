package org.example;

public class klasa {
    int[][] pary;

    klasa(int ilosc) {
        pary = new int[ilosc][];
        pary[0] = new int[2];
        pary[0][0] = 1;
        pary[0][1] = 2;
        for (int i = 0; i < pary.length - 1; i++) {
            pary[i + 1] = new int[2 * pary[i].length];
        }
    }

    @Override
    public String toString() {
        String wynik = "";
        for (int w = 0; w < pary.length; w++) {
            for (int k = 0; k < pary[w].length; k = k + 2) {
                wynik += pary[w][k] + ":" + pary[w][k + 1] + " ";
            }
            wynik += "\n";
        }
        return wynik;
    }

    void generujWiersz(int pozycja) {
        int suma = 1 + pary[pozycja + 1].length;
        for (int i = 0; i < pary[pozycja].length; i = i + 2) {
            pary[pozycja + 1][2 * i] = pary[pozycja][i];
            pary[pozycja + 1][2 * i + 1] = suma - pary[pozycja][i];
            pary[pozycja + 1][2 * (i + 1)] = suma - pary[pozycja][i + 1];
            pary[pozycja + 1][2 * (i + 1) + 1] = pary[pozycja][i + 1];
        }
    }

    void generuj() {
        for (int i = 0; i < pary.length - 1; i++) {
            generujWiersz(i);
        }
    }
}