package Hibernate.hibernate_test;

import Hibernate.hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class).buildSessionFactory();
            try {
                Session session = factory.getCurrentSession();
//                Employee emp = new Employee("Zaur", "Tregulov", "IT", 500);
//                Employee emp = new Employee("Mikhail", "Ivanov", "HR", 750);
//                Employee emp = new Employee("Aleksandr", "Smirnov", "Sales", 700);
                Employee emp = new Employee("Aleksandr", "Ivanov", "IT", 600);
                session.beginTransaction();
                session.save(emp);
                session.getTransaction().commit();

                System.out.println("Done!");
            } finally {
                factory.close();
            }




    }
}
