/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojet2020;

import java.util.ArrayList;

/**
 *
 * @author julie
 */
public class Responsable extends Employe {

    private ArrayList<Employe> lesSubs;

    public Responsable(String nom, String prenom, int matricule, int indiceSalaire) {
        super(nom, prenom, matricule, indiceSalaire);
        lesSubs = new ArrayList<>();
    }

    public void ajSub(Employe empl) {
        lesSubs.add(empl);
    }

    public double calculSalaire() {
        return this.getIndiceSalaire() * 12;
    }

    public double calculSalaireBranche() {
        return this.calculSalaireBrancheEtape(0);
    }

    public double calculSalaireBrancheEtape(double sal) {
        double salaire = sal + this.calculSalaire();
        for (Employe empl : this.lesSubs) {
            if (empl.getClass().equals(Responsable.class)) {
                salaire = empl.calculSalaireBrancheEtape(salaire);
            } else {
                salaire = salaire + empl.calculSalaire();
            }
        }
        return salaire;
    }

    @Override
    public String toString() {
        return "Responsable : " + super.toString() + " Subs " + lesSubs + "\n";
    }

    /*public void hieAide(int nb) {
        System.out.println(nb + ") " + this);
        nb = nb + 1;
        for (Employe empl : this.lesSubs) {
            if (empl.getClass().equals(EmployeDeBase.class)) {
                System.out.println(nb + ") " + empl + " STOP");
            }
            if (empl.getClass().equals(Responsable.class)) {
                empl.hieAide(nb);
            }
        }
    }*/
}
