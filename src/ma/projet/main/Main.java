/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.main;

/**
 *
 * @author PC
 */
import ma.projet.Personne;
import ma.projet.bean.Developpeur;
import ma.projet.bean.Manager;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Developpeur(1, "Asmaa", "Sabri", 12500));
        personnes.add(new Manager(2, "Rania", "Qabli", 8500));

        afficherListe(personnes);
    }

    public static void afficherListe(List<? extends Personne> personnes) {
        for (Personne p : personnes) {
            p.affiche();
        }
    }
}

