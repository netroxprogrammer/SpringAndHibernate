/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Configuration;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author mac
 */
public class HibernateSessionManagment {
    private  static SessionFactory sessionFactory = buildSessionFactory();
    private  static SessionFactory buildSessionFactory(){
        try{
        sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        return sessionFactory;
        }
        catch(HibernateException ex){
            System.err.println("Session Factory  Fail to Initializ..."+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 public static SessionFactory getSessionFactory(){
     return sessionFactory;
 }   
 
 public static void shutdownConnection(){
     getSessionFactory().close();
 }
}
