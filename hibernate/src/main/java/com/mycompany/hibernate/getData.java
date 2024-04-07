/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hibernate;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author HP
 */
public class getData {
    public static void main(String[] args)
    {
        SessionFactory factory = new Configuration().configure(new File("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\hibernate\\src\\main\\java\\com\\mycompany\\hibernate\\hibernate.config.xml")).buildSessionFactory();
        try
        {
            Session session = factory.openSession();
            session.beginTransaction();
            Student student = new Student(1 , "Shubhvrat" , "sk@gmail.com");
            session.save(student);
            session.getTransaction().commit();
            session.close();
            System.out.println("Table created");
        }
        catch(Exception  ec)
        {
        }
        
    }
}
