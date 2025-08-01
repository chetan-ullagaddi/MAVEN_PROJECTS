package org.jsp.chetan.hibooo;

import java.util.Scanner; 
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, dept");
        String name = sc.next();
        String dept = sc.next();

        // Create employee object
        Employee e1 = new Employee(name, dept);
        System.out.println("step1");

        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        System.out.println("Step2");

        SessionFactory factory = configuration.buildSessionFactory();
        System.out.println("Step3");

        Session session = factory.openSession();
        System.out.println("step4");

        Transaction transaction = session.beginTransaction();
        System.out.println("step5");

        session.persist(e1);
        System.out.println("step6");

        transaction.commit();
        session.close();
        factory.close();
    }
}
