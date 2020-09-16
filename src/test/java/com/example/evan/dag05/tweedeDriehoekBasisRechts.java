package com.example.evan.dag05;

import org.junit.jupiter.api.Test;

public class tweedeDriehoekBasisRechts {

    @Test
    void driehoekMetBasisRechterZijde() {

        int hoogteDriehoek = 5;
        int incrementSpaties = hoogteDriehoek - 1;
        int sterrenOpEenRij = 1;

        while (sterrenOpEenRij < hoogteDriehoek) {

            for (int i = incrementSpaties;i > 0; i--) {
                System.out.print(" ");
            }
            for (int j = 0; j < sterrenOpEenRij ; j++) {
                System.out.print("*");
            }
            System.out.println("");

            sterrenOpEenRij = sterrenOpEenRij + 1;
            incrementSpaties = incrementSpaties -1;

        }

        incrementSpaties = 5;
        sterrenOpEenRij = hoogteDriehoek -1;
        int decrementSpaties = 5;

        while (sterrenOpEenRij < hoogteDriehoek) {

            for (int i = incrementSpaties;i > 0; i--) {
                System.out.print("*");
            }

            System.out.println("");

            sterrenOpEenRij = sterrenOpEenRij + 1;
            incrementSpaties = incrementSpaties - 1;
            decrementSpaties = decrementSpaties -1;
        }
    }
}