package com.example.cihangir.dag05;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class JavaTestDag05 {
    @Test // Annotatie
    void JavaTest(){

        System.out.println("Hallo Java!");
    }
    @Test // Annotatie
    void JavaTest1(){
        double doubleVar1 = 1.033;
        double doubleVar2 = 0.033;
        double difference = doubleVar1 - doubleVar2;
        boolean isGelijk = difference == 1.0;
        Offset<Double> offset = Offset.offset(1.0E-2);
        assertThat(difference).isEqualTo(1.0,offset);

    }

    @Test // Annotatie
    void JavaTest2(){
        double doubleVar1 = 1.033;
        double doubleVar2 = 0.033;
        double difference = doubleVar1 - doubleVar2;
        boolean isGelijk = difference == 1.0;
        assertThat(difference).isEqualTo(1.0);
    }

    @Test // Annotatie
    void JavaTest3(){
        byte b1 = 1;
        char char1 = 'a';
        char char2 = 'b';
        System.out.println("String test " + char1 + char2);
    }

    @Test // Annotatie
    void Tafels() {
        int num = 5;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        System.out.println(" ");

        int num1 = 6;
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d \n", num1, i, num1 * i);
        }

    }

    @Test // Annotatie
    void JavaTest5(){
        double cijfer1 = 0.0;
        double cijfer2 = 0.0;
        System.out.println(cijfer1 / cijfer2);
    }

    @Test // Annotatie
    void HalveDriehoekMetSterren() {
        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }

    @Test // Annotatie
    void DriehoekMetSterren(){
        for (int i=1; i<10; i += 2)
        {
            for (int k=0; k < (4 - i / 2); k++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<i; j++)
            {
                System.out.print("'");
            }
            System.out.println("");
        }
    }

    @Test // Annotatie
    void OmgekeerdeHalveDriehoek() {
        for (int i = 1; i < 10; i += 2) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    // Huiswerkopdracht 3&4
    @Test
    void driehoekMetBasisBoven(){
        int lengteDriehoeksBasis = 11;
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
        sterrenOpEenRij = 0;
        int decrementSpaties = 5;

        while (sterrenOpEenRij < hoogteDriehoek) {

            for (int j = 0; sterrenOpEenRij > j; j++ ){
                System.out.print(" ");
            }
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
