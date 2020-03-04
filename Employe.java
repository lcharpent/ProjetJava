/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojet2020;

/**
 *
 * @author julie
 */
public abstract class Employe implements Comparable<Employe> {

    private String nom;
    private String prenom;
    private int matricule;
    private int indiceSalaire;

    //methode : 1 indinceSalaire = 12€
    public Employe(String nom, String prenom, int matricule, int indiceSalaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.indiceSalaire = indiceSalaire;
    }

    @Override
    public String toString() {
        return nom + " " + prenom + " (matricule : " + matricule + ", salaire : " + this.calculSalaire() + "€)\n";
    }

    public abstract double calculSalaire();

    public int getIndiceSalaire() {
        return indiceSalaire;
    }

    @Override
    public int compareTo(Employe empl) {
        if (this.matricule < empl.matricule) {
            return -1;
        } else {
            return 1;
        }
    }

    /*public abstract void hieAide(int nb);
    
    public void affHierarchie() {
        this.hieAide(1);
    }*/
}
