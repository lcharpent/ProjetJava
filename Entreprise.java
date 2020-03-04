/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojet2020;

import java.util.*;

/**
 *
 * @author julie
 */
public class Entreprise {
// a remplacer par payable interface ?

    private TreeSet<Employe> lesEmployes;

    public Entreprise(TreeSet<Employe> lesEmployes) {
        this.lesEmployes = lesEmployes;
    }

    public Entreprise() {
        lesEmployes = new TreeSet<>();
    }

    public void ajEmploye(Employe empl) {
        lesEmployes.add(empl);
    }

    public double calculSalairesEntreprise() {
        double salaire = 0;
        for (Employe empl : lesEmployes) {
            salaire = salaire + empl.calculSalaire();
        }
        return salaire;
    }

    @Override
    public String toString() {
        return "Entreprise : " + lesEmployes;
    }

}
