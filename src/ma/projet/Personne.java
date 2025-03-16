/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet;

/**
 *
 * @author PC
 */
public abstract class Personne {
    protected int id;
    protected String nom;
    protected String prenom;
    protected double salaire;

    public Personne(int id, String nom, String prenom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
    }

    public abstract double calculerSalaire();
    
    public void affiche() {
        System.out.println(nom + " " + prenom + " : " + calculerSalaire() + " dh");
    }
}
