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
public class JavaProjet2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//creation des employes
        Responsable a = new Responsable("A", "Agnes", 15600, 45);
        System.out.println(a);
        Employe b = new EmployeDeBase("B", "Borian", 15601, 100);
        Responsable c = new Responsable("C", "Corie", 15602, 10);
        Responsable d = new Responsable("D", "Dora", 15603, 50);
        Responsable e = new Responsable("E", "Eleonore", 15604, 60);
        Employe f = new EmployeDeBase("F", "Felix", 15605, 60);
        Responsable g = new Responsable("G", "Guillaume", 15606, 50);
        Responsable h = new Responsable("H", "Harry", 15607, 50);
        Employe i = new EmployeDeBase("I", "Ines", 15608, 50);
        Responsable j = new Responsable("J", "Julie", 15609, 50);
        Employe k = new EmployeDeBase("K", "Kriss", 15610, 50);
        Employe l = new EmployeDeBase("L", "Lola", 15611, 50);
        Employe m = new EmployeDeBase("M", "Manon", 15612, 50);
        Employe n = new EmployeDeBase("N", "Noe", 15613, 50);
        Employe o = new Commercial("O", "Olivier", 15614, 50, 1000);
        Employe p = new Commercial("P", "Patrick", 15615, 50, 1000);

//ajout des subs
        a.ajSub(b);
        a.ajSub(c);
        a.ajSub(d);
        System.out.println(a);
        c.ajSub(e);
        c.ajSub(f);
        d.ajSub(g);
        e.ajSub(h);
        e.ajSub(i);
        e.ajSub(j);
        g.ajSub(k);
        h.ajSub(l);
        h.ajSub(m);
        j.ajSub(n);
   
//creation entreprise
        Entreprise foxnot = new Entreprise();
//        System.out.println(foxnot);

        foxnot.ajEmploye(a);
        foxnot.ajEmploye(b);
        foxnot.ajEmploye(c);
        foxnot.ajEmploye(d);
        foxnot.ajEmploye(e);
        foxnot.ajEmploye(f);
        foxnot.ajEmploye(g);
        foxnot.ajEmploye(h);
        foxnot.ajEmploye(i);
        foxnot.ajEmploye(j);
        foxnot.ajEmploye(k);
        foxnot.ajEmploye(l);
        foxnot.ajEmploye(m);
        foxnot.ajEmploye(n);

        System.out.println(foxnot);

//afficher hierarchie a partir de quelqu'un
        //a.affHierarchie();

    }

}
