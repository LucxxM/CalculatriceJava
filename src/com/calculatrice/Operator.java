package com.calculatrice;

import java.util.Objects;
import java.util.Scanner;

public class Operator {


    public Operator(String operator) {
        //System.out.println("Entrez votre opérateur :");
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez votre 1ere valeur :");
        float nb1 = sc.nextInt();
        System.out.println("Entrez votre 2eme valeur :");
        float nb2 = sc.nextInt();
        float resultat;

        if (Objects.equals(operator, "addition")){
            resultat = nb1+nb2;
            System.out.println("le résulat est :" + resultat);
        }else if (Objects.equals(operator, "soustraction")){
            resultat = nb1-nb2;
            System.out.println("le résulat est :" +resultat);
        }else if (Objects.equals(operator, "multiplication")){
            resultat = nb1*nb2;
            System.out.println("le résulat est :" +resultat);
        }else if (Objects.equals(operator, "division") && nb2 != 0){
            resultat = nb1/nb2;
            System.out.println("le résulat est :" +resultat);
        }else if (Objects.equals(operator, "division") && nb2 == 0){
            System.out.println("la division par 0 n'est pas possible");
        }else{
            System.out.println("Votre Opérateur n'est pas correct!!!");
        }

    }

}
