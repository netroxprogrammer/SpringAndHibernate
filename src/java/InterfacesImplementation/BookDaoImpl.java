/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesImplementation;

import Configuration.HibernateSessionManagment;
import Interfaces.BookDao;

import java.util.List;
import model.Books;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Service;

/**
 *
 * @author mac
 */
@Service
public class BookDaoImpl implements BookDao{
     Session session;
    @Override
    public String addSong(Books books) {
        SessionFactory sessionFactory = HibernateSessionManagment.getSessionFactory();
       session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try{
        session.save(books);
        session.flush();
        transaction.commit();
        return  "Data  enter SuccessFully";
        }catch(HibernateException ex){
            transaction.rollback();
            System.err.println("error.... "+ex);
            return "Sorry  Some Problem Occure";
        }
        finally{
            session.close();
        }
    }

    @Override
    public List getBookList() {
       
        SessionFactory sessionFactory = HibernateSessionManagment.getSessionFactory();
         session = sessionFactory.getCurrentSession();
         Transaction transaction;
        if(session.isOpen()){
        transaction = session.beginTransaction();
        }
        else{
            session = sessionFactory.openSession();
        }
        try{
            List booksList = session.createQuery("from Books").list();
            return booksList;
        }finally{
          session.close();
        }
    }
    
}
