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


class NombreNegatifException extends Exception {
    public NombreNegatifException(String message) {
        super(message);
    }
}

public class Fibonacci {
    public static int fibonacci(int n) throws NombreNegatifException {
        if (n <= 0) {
            throw new NombreNegatifException("Erreur : Le nombre doit être supérieur à 0 ");
        }
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Entrez un entier positif : ");
            int n = scanner.nextInt();
            System.out.println("Le " + n + "e nombre de Fibonacci est : " + fibonacci(n));
        } catch (NombreNegatifException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Veuillez entrer un entier valide ");
        }
    }
}