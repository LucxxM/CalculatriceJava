package com.calculatrice;


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public Calculator() {

        // on crée les 2 nombres qui vont nous servir.
        int nb1;
        int nb2;
        // on crée le scanner qui va permettre de faire rentrer les informations à l'utilisateur.
        Scanner sc = new Scanner(System.in);
        // on crée une variable "operator" qui va nous permettre de déterminer l'action à réaliser, on récupère la ligne suivante rentrée par l'utilisateur.
        String operator = sc.nextLine();

        // on va regarder quel opérateur a été choisi et on décrit les opérations pour chaque cas (un switch aurait été mieux)

        if (Objects.equals(operator, "addition")) {
            // on informe l'utilisateur de son choix et l'invite à rentrer un chiffre.
            System.out.println("Vous avez choisis addition. Entrez le 1er chiffre :");
            nb1 = sc.nextInt();
            // on l'invite à choisir un autre chiffre.
            System.out.println("Entrez le second chiffre");
            nb2 = sc.nextInt();
            // on déclare le résultat
            int resultat = nb1 + nb2;
            System.out.println(resultat);

            //restart option

            String restart;
            System.out.println("voulez vous essayer à nouveau? O/N");
            restart = sc.next();

            if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
                System.out.println("Entrez un Opérateur (addition, soustraction, multiplication, division, trunc)");
                new Calculator();
            } else {
                System.out.println("Merci à Bientôt");
            }

        } else if (Objects.equals(operator, "soustraction")) {
            // on informe l'utilisateur de son choix et l'invite à rentrer un chiffre.
            System.out.println("Vous avez choisis soustraction. Entrez le 1er chiffre :");
            nb1 = sc.nextInt();
            // on l'invite à choisir un autre chiffre.
            System.out.println("Entrez le second chiffre");
            nb2 = sc.nextInt();
            // on déclare le résultat
            int resultat = nb1 - nb2;
            System.out.println(resultat);

            //restart option

            String restart;
            System.out.println("voulez vous essayer à nouveau? O/N");
            restart = sc.next();

            if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
                System.out.println("Entrez un Opérateur (addition, soustraction, multiplication, division, trunc)");
                new Calculator();
            } else {
                System.out.println("Merci à Bientôt");
            }

        } else if (Objects.equals(operator, "multiplication")) {
            // on informe l'utilisateur de son choix et l'invite à rentrer un chiffre.
            System.out.println("Vous avez choisis multiplication. Entrez le 1er chiffre :");
            nb1 = sc.nextInt();
            // on l'invite à choisir un autre chiffre.
            System.out.println("Entrez le second chiffre");
            nb2 = sc.nextInt();
            // on déclare le résultat
            int resultat = nb1 * nb2;
            System.out.println(resultat);

            //restart option

            String restart;
            System.out.println("voulez vous essayer à nouveau? O/N");
            restart = sc.next();

            if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
                System.out.println("Entrez un Opérateur (addition, soustraction, multiplication, division, trunc)");
                new Calculator();
            } else {
                System.out.println("Merci à Bientôt");
            }

        } else if (Objects.equals(operator, "division")) {
            // on informe l'utilisateur de son choix et l'invite à rentrer un chiffre.
            System.out.println("Vous avez choisis division. Entrez le 1er chiffre :");
            nb1 = sc.nextInt();
            // on l'invite à choisir un autre chiffre.
            System.out.println("Entrez le second chiffre");
            nb2 = sc.nextInt();
            // on déclare le résultat
            int resultat = nb1 / nb2;
            System.out.println(resultat);

            //restart option
            String restart;
            System.out.println("voulez vous essayer à nouveau? O/N");
            restart = sc.next();

            if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
                System.out.println("Entrez un Opérateur (addition, soustraction, multiplication, division, trunc)");
                new Calculator();
            } else {
                System.out.println("Merci à Bientôt");
            }

        } else if (Objects.equals(operator, "trunc")) {
            // on informe l'utilisateur de son choix et l'invite à rentrer un chiffre.
            System.out.println("Vous avez choisis trunc. Entrez les charactères à trunc :");
            String chaineATruncBrut = sc.nextLine();
            String chaineATrunc = chaineATruncBrut.replaceAll(",", "");
            // on l'invite à choisir la valeur selon laquelle on "trunc".
            System.out.println("Entrez la valeur du trunc");
            int truncValue = sc.nextInt();
            // on crée un tableau pour stocker notre résultat.
            ArrayList<Object> tableauRetour = new ArrayList<>();

            // on détermine l'int qui renverra l'index le plus loin dans le tableau.
            int maxStopValue = chaineATrunc.length();
            // on initie un start et un stop, le stop prend la valeur du "trunc".
            int start = 0;
            int stop = truncValue;
            // dans ce cas on crée un tableau qu'on stockera dans notre tableau principal.
            ArrayList<Object> tableauIntermediaire = new ArrayList<>();
            // on récupère la 1ere partie du "trunc" grâce à nos "start & stop" pour on l'ajoute à un tableau qui lui même est ajouté à notre tableau principal.
            String c = chaineATrunc.substring(start, stop);
            tableauIntermediaire.add(c);
            tableauRetour.add(tableauIntermediaire);

            // on crée une boucle tant que notre stop n'est pas supérieur à notre maxStopValue.
            while (stop < maxStopValue) {

                // start devient de le stop précédent.
                start = stop;
                stop = stop + truncValue;

                // on déclare que si stop > à maxStopValue alors il prend la valeur de ce dernier.
                if (stop > maxStopValue) {
                    stop = maxStopValue;
                }
                // On récupère chaque autre partie de notre "trunc" tant qu'il est possible.
                String d = chaineATrunc.substring(start, stop);
                // dans ce cas on crée un tableau qu'on stockera dans notre tableau principal.
                ArrayList<Object> tableauIntermediaired = new ArrayList<>();
                tableauIntermediaired.add(d);
                tableauRetour.add(tableauIntermediaired);

            }


            System.out.println(tableauRetour);

            //restart option

            String restart;
            System.out.println("voulez vous essayer à nouveau? O/N");
            restart = sc.next();

            if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
                System.out.println("Entrez un Opérateur (addition, soustraction, multiplication, division, trunc)");
                new Calculator();
            } else {
                System.out.println("Merci à Bientôt");
            }


        } else {

            //restart option

            String restart;
            System.out.println("votre opérateur n'est pas valide!!");
            System.out.println("voulez vous essayer à nouveau? O/N");
            restart = sc.next();

            if (Objects.equals(restart, "O") || Objects.equals(restart, "o")) {
                System.out.println("Entrez un Opérateur (addition, soustraction, multiplication, division, trunc)");
                new Calculator();
            } else {
                System.out.println("Merci à Bientôt");
            }


        }
    }

}
