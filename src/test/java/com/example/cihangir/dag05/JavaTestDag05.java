package com.example.cihangir.dag05;

import com.example.cihangir.dag05.Persoon;
import org.assertj.core.data.Offset;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import static org.assertj.core.api.Assertions.assertThat;


public class JavaTestDag05 {


    @Test
    void TestDate() { // Dit print de huidige datum uit naar de console
        LocalDate localedatum = LocalDate.now();
        System.out.println(localedatum);
    }

    @Test
    void TestDate2() { // Dit print de huidige tijd uit naar de console
        LocalTime localetijd = LocalTime.now();
        System.out.println(localetijd);
    }

    @Test
    void TestDate3() { // Dit print de huidige datum en tijd uit naar de console
        LocalDateTime datumTijd = LocalDateTime.now();
        System.out.println(datumTijd);
    }


    @Test // OOP test 17-9
    void HuiswerkTest() {
        Persoon persoon = new Persoon("Cihangir", 18);

        System.out.println("Naam: " + persoon.getNaam());
        System.out.println("Leeftijd: " + persoon.getLeeftijd());;
        System.out.println(persoon.toStringPersoon());
    }

    @Test // OOP test 17-9
    void HuiswerkTest2() {
        Adres adres = new Adres("Amersfoort", "Kruisstraat",2, "Nederland" );

        System.out.println("Woonplaats: " + adres.getWoonplaats());
        System.out.println("Straat: " + adres.getStraat());;
        System.out.println("nummer: " + adres.getNummer());
        System.out.println("land: " + adres.getLand());;
        System.out.println(adres.toStringAdres());
    }

    @Test // OOP test 17-9
    void PersoonTest() {
        Persoon persoon = new Persoon("Cihangir", 18);
        System.out.println("Naam: " + persoon.getNaam());
        System.out.println("Leeftijd: " + persoon.getLeeftijd());;
        System.out.println(persoon.toStringPersoon());
        }



        // Huiswerk Opdracht: Deel 1 & 2
    @Test
    // Annotatie
    void DriehoekMetBasisLinks() {
        int rij = 5;
        for (int count= 0; count<= rij-1 ; count++)
        {
            for (int tel=0; tel<=count; tel++)
            {
                System.out.print("-"+ " ");
            }
            System.out.println("");
        }
        for (int count=rij-1; count>=0; count--)
        {
            for(int tel=0; tel <= count-1;tel++)
            {
                System.out.print("-"+ " ");
            }
            System.out.println("");
        }
    }

    @Test // Annotatie
    void DriehoekMetBasisOnder() {
        int rij = 5;
        for (int count = 1; count <= rij; count++) {

            for (int tel = rij; tel >= count; tel--) {
                System.out.print(" ");
            }

            for (int tel = 1; tel <= count; tel++) {
                System.out.print("- ");
            }
            System.out.println();
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


    // Verschillende tests
    @Test
    // Annotatie
    void JavaTest() {

        System.out.println("Hallo Java!");
    }

    @Test
        // Annotatie
    void JavaTest1() {
        double doubleVar1 = 1.033;
        double doubleVar2 = 0.033;
        double difference = doubleVar1 - doubleVar2;
        boolean isGelijk = difference == 1.0;
        Offset<Double> offset = Offset.offset(1.0E-2);
        assertThat(difference).isEqualTo(1.0, offset);

    }

    @Test
        // Annotatie
    void JavaTest2() {
        double doubleVar1 = 1.033;
        double doubleVar2 = 0.033;
        double difference = doubleVar1 - doubleVar2;
        boolean isGelijk = difference == 1.0;
        assertThat(difference).isEqualTo(1.0);
    }

    @Test
        // Annotatie
    void JavaTest3() {
        byte b1 = 1;
        char char1 = 'a';
        char char2 = 'b';
        System.out.println("String test " + char1 + char2);
    }

    @Test
        // Annotatie
    void Tafels() {
        int num = 5;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num, i, num * i);
        }
        System.out.println(" ");

        int num1 = 6;
        for (int i = 1; i <= 10; ++i) {
            System.out.printf("%d * %d = %d \n", num1, i, num1 * i);
        }

    }

    @Test
        // Annotatie
    void JavaTest5() {
        double cijfer1 = 0.0;
        double cijfer2 = 0.0;
        System.out.println(cijfer1 / cijfer2);
    }

    @Test
        // Annotatie
    void HalveDriehoekMetSterren() {
        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print("-");
            }
            System.out.println("");
        }
    }

    @Test
        // Annotatie
    void DriehoekMetSterren() {
        for (int i = 1; i < 10; i += 2) {
            for (int k = 0; k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("'");
            }
            System.out.println("");
        }
    }

    @Test
        // Annotatie
    void OmgekeerdeHalveDriehoek() {
        for (int i = 1; i < 10; i += 2) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    @Test
        // Annotatie
    void TestVanSubstrings() {
        String tekst = "Hello world!";
        String tekst1 = tekst.substring(6);
        System.out.println(tekst1);
    }

    @Test
        // Annotatie
    void Optellen() {
        int[] a = {1, 1, 1, 1, 1};
        int sum = IntStream.of(a).sum();
        System.out.println("sum is " + sum);
    }




    // Work in progress
    @Test
    void Namen() {
        // Dit is de array met strings met namen van de klas
        String[] namen = {"Cihangir", "Sjoerd", "Majdid", "Rein", "Dave", "Evan", "Dennis", "Mike", "Joshua", "Sam", "Joris"};

        // Hier print ik de eerste naam uit naar de console als een test
        System.out.println(namen[0]);
        // Hier print ik het totaal aantal namen uit naar de console als een test
        System.out.println("Totaal aantal namen: " + namen.length);


        // Hier geef ik elke naam een eigen variabele
        String naam1 = namen[0];
        String naam2 = namen[1];
        String naam3 = namen[2];
        String naam4 = namen[3];
        String naam5 = namen[4];
        String naam6 = namen[5];
        String naam7 = namen[6];
        String naam8 = namen[7];
        String naam9 = namen[8];
        String naam10 = namen[9];
        String naam11 = namen[10];


        // Variabele voor het totaal aantal woorden
        int totaalAantalLetters = 0;
        // Hier maak ik een for loop waarbij
        for (int bereken = 0; bereken < namen.length; bereken++) {
            totaalAantalLetters += namen[bereken].length();
        }
        // Hier print ik het totaal aantal letters uit naar de console
        System.out.println("Totaal aantal letters: " + totaalAantalLetters);


        // Hier geef ik de lengte van de namen een eigen nieuwe int variabele
        int naam1int = naam1.length();
        int naam2int = naam2.length();
        int naam3int = naam3.length();
        int naam4int = naam4.length();
        int naam5int = naam5.length();
        int naam6int = naam6.length();
        int naam7int = naam7.length();
        int naam8int = naam8.length();
        int naam9int = naam9.length();
        int naam10int = naam10.length();
        int naam11int = naam11.length();


        // Hierbij maak ik een nieuwe array voor de int variabele
        int[] namenlengte = {naam1int, naam2int, naam3int, naam4int, naam5int, naam6int, naam7int, naam8int, naam9int, naam10int, naam11int};

        // Hier doe ik alle variabele uit de array in een variabele om deze te printen naar de console
        List alleArrays = Arrays.asList(namenlengte);
        System.out.println(alleArrays);


        int kortsteNaam = 0;

        // for (int bereken = 0; bereken < namen.length; bereken++) {
        //            totaalAantalLetters += namen[bereken].length();


        for (int tel = 0; tel < namen.length; tel++) {
            if (tel < 0) {
                // block of code to be executed if the condition is true
            } else {
                // block of code to be executed if the condition is false
            }
        }


    }

}