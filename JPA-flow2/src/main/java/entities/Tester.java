/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Nicol
 */
public class Tester {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Person p1 = new Person("Jønke", 1963);
        Person p2 = new Person("blondie", 1959);
        Person p3 = new Person("Kokken", 1954);

        Adress a1 = new Adress("store tov 1", 2323, "nr. snede");
        Adress a2 = new Adress("Langgade 4", 2323, "Valby");
        Adress a3 = new Adress("Langgade 54", 2323, "Valby");

        p1.setAdress(a1);
        p2.setAdress(a2);
        p3.setAdress(a3);

        Fee f1 = new Fee(100);
        Fee f2 = new Fee(200);
        Fee f3 = new Fee(300);
        p1.addFee(f1);
        p2.addFee(f2);
        p2.addFee(f3);

        SwimStyle s1 = new SwimStyle("Crawl");
        SwimStyle s2 = new SwimStyle("ButterFly");
        SwimStyle s3 = new SwimStyle("Bryst");

        p1.addSwimStyle(s1);
        p1.addSwimStyle(s2);
        p2.addSwimStyle(s2);
        p2.addSwimStyle(s3);
        p3.addSwimStyle(s2);

        em.getTransaction().begin();
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.getTransaction().commit();

        em.getTransaction().begin();
        p1.removeSwimStyle(s2);
        em.getTransaction().commit();
        System.out.println("p1: " + p1.getP_id());
        System.out.println("p2: " + p2.getP_id());

        System.out.println("jønkes gade" + p1.getAdress().getStreet());

        System.out.println("Se her to vejs virker: " + a1.getPerson().getName());

        System.out.println("hvem har betalt f2? det har: " + f2.getPerson().getName());

        TypedQuery<Fee> q1 = em.createQuery("SELECT f FROM Fee f", Fee.class);
        List<Fee> fees = q1.getResultList();
        fees.forEach(f -> {
            System.out.println(f.getPerson().getName() + ": " + f.getAmount() + "kr. D." + f.getPayDate());
        });
    }
}
