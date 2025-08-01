package org.jsp.chetan.demo_hib;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter id,name,percetage");
       int id=sc.nextInt();
       String name=sc.next();
       double per=sc.nextDouble();
       
       //obj creation
       Student s=new Student(id,name,per);
       System.out.println("step1 executed");
       
       Configuration conf=new Configuration();
       conf.configure("hibernate.cfg.xml");
       System.out.println("step2 executed");
       
       SessionFactory factory=conf.buildSessionFactory();
       System.out.println("step3 exexuted");
       
       Session session=factory.openSession();
       System.out.println("step4 exexuted");
       
       Transaction transaction=session.beginTransaction();
       System.out.println("step5 executed");
       
       session.persist(s);
       System.out.println("executed 6th done");
       
       transaction.commit();
       session.close();
       factory.close();
       
       
    }
}
