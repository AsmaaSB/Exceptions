/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.bean;

/**
 *
 * @author PC
 */
import ma.projet.Personne;

public class Developpeur extends Personne {
    public Developpeur(int id, String nom, String prenom, double salaire) {
        super(id, nom, prenom, salaire);
    }

    @Override
    public double calculerSalaire() {
        return salaire * 1.10;
    }
}
