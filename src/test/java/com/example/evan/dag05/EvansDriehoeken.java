package com.example.evan.dag05;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class EvansDriehoeken {

    @Test
    void test(){
        System.out.println("******");
        System.out.println(" **** ");
        System.out.println("  **  ");
    }

    @Test
    void driehoekStap1() {
        int basis = 7;
        int i = basis;
        int driehoekRij = 0;

        while(i > 0){
            for(int q = 0; driehoekRij > q; q++){
                System.out.print(" ");
            }

            for(int j = 0; j < basis; j++){
                System.out.print("*");
            } System.out.println("");
            basis = basis -2;
            i = i-2;
            driehoekRij = driehoekRij + 1;


        }


    }

    @Test
    void driehoekBasisBovenNetjesAfgewerktMetMethodesEtc(){
        int lengteDriehoeksBasis = 10;
        int decrement = lengteDriehoeksBasis;
        int driehoekRij = 0;

        while(decrement > 0) {
            plaatsenVanSpatiesVoorElkeDriehoekRij(driehoekRij);

            driehoekVullenMetSterren(lengteDriehoeksBasis);

            System.out.println("");
            lengteDriehoeksBasis = lengteDriehoeksBasis - 2;
            decrement = decrement - 2;
            driehoekRij = driehoekRij + 1;
        }
    }

    void plaatsenVanSpatiesVoorElkeDriehoekRij(int driehoekRij){
        for(int q = 0; driehoekRij > q; q++){
            System.out.print(" ");
        }
    }

    void driehoekVullenMetSterren(int basis){
        for(int j = 0; j < basis; j++){
            System.out.print("*");
        }
    }

    Scanner scanGebruikersInvoerBasisDriehoek(){
        System.out.println("Hoe groot moet de basis van de driehoek zijn?");
        System.out.println("Voer een getal groter dat 0 in: ");
        Scanner lengteDriehoeksBasis = new Scanner(System.in);
        return lengteDriehoeksBasis;
    }

}
