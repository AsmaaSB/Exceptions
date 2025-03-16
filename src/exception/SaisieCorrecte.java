/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author PC
 */

import java.util.InputMismatchException;
import java.util.Scanner;


class NombreTropPetitException extends Exception {
    public NombreTropPetitException(String message) {
        super(message);
    }
}

public class SaisieCorrecte {
    public static int saisieCorrecte() {
        Scanner scanner = new Scanner(System.in);
        int nombre = 0;
        boolean valide = false;

        while (!valide) {
            try {
                System.out.print("Entrez un nombre entier supérieur à 10 : ");
                nombre = scanner.nextInt();

                if (nombre <= 10) {
                    throw new NombreTropPetitException("Erreur : Le nombre doit être supérieur à 10 ");
                }

                valide = true; 

            } catch (InputMismatchException e) {
                System.out.println("Erreur : Vous devez entrer un entier valide ");
                scanner.next();
            } catch (NombreTropPetitException e) {
                System.out.println(e.getMessage());
            }
        }

        return nombre;
    }

    public static void main(String[] args) {
        int nombre = saisieCorrecte();
        System.out.println("Nombre saisi correctement : " + nombre);
    }
}