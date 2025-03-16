/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classGenerique;

/**
 *
 * @author PC
 */

public class Triplet<T> {
    private T premier;
    private T second;
    private T troisieme;

    public Triplet(T premier, T second, T troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }

    public T getPremier() { return premier; }
    public T getSecond() { return second; }
    public T getTroisieme() { return troisieme; }

    public void affiche() {
        System.out.println("[" + premier + ", " + second + ", " + troisieme + "]");
    }

    public static void main(String[] args) {
        Triplet<Integer> tripletInt = new Triplet<>(1, 2, 3);
        tripletInt.affiche();

        Triplet<String> tripletString = new Triplet<>("Asmaa", "Rania", "Chaymae");
        tripletString.affiche();
    }
}

