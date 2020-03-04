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
public class EmployeDeBase extends Employe {

    public EmployeDeBase(String nom, String prenom, int matricule, int indiceSalaire) {
        super(nom, prenom, matricule, indiceSalaire);
    }

    public double calculSalaire() {
        return this.getIndiceSalaire() * 12;
    }

    @Override
    public String toString() {
        return "Employe de base : " + super.toString();
    }


    /*public void hieAide(int nb) {
        System.out.println("Aucune hierarchie en dessous de " + this);
    }*/
}
