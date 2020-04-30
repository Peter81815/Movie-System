package com.dao;

import com.pojo.MovieItem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.security.auth.login.Configuration;

import org.apache.commons.dbutils.DbUtils;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;



public class Dao {
    private static final SessionFactory sf = new org.hibernate.cfg.Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    private Session session = null;
    private Session getSession(){
        if(session == null || !session.isOpen()){
        session = sf.openSession();
    }
        return session;
        
    }
    
//    private SessionFactory sessionFactory;
//    private static Session session;
//    protected SessionFactory setUp() {
//        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
//        configuration.configure("hibernate.cfg.xml");
//        try {
//            sessionFactory = configuration.buildSessionFactory();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return sessionFactory;
//    }
//    private Session getSession(){
//        if (session == null || !session.isOpen()){
//            session = setUp().openSession();
//        }
//        return session;
//    }
    private void beginTransaction(){
        getSession().beginTransaction();
    }
    
     private void commit(){
        getSession().getTransaction().commit();;
    }
    
    
    private void close(){
        if (session !=null)
        {
            getSession().close();
        }
    }
    
    private void rollbackTransaction(){
        getSession().getTransaction().rollback();
    }
	
  public MovieItem getMovie(int id){
        //List<MovieItem> courses = new ArrayList<>();
        MovieItem m = null;
        try{
            beginTransaction();
            Session session = getSession();
            m=(MovieItem) session.get(MovieItem.class, id);
//            Query q = session.createQuery("from movie where id= :id");
//            System.out.println(q.toString());
//            q.setInteger("id", id);
            
            
//            courses = q.list();
//            System.out.println(q.toString());
            commit();
            
        } catch(HibernateException e){
            e.printStackTrace();
            rollbackTransaction();
        } 
        finally {
            close();
        }
        return m ;
    }
    
    public int addMovie(MovieItem movie){
        int result = 0;
        try {
//            beginTransaction();
//            MovieItem movie = new MovieItem();
//            movie.setTitle(title);
//            movie.setActor(actor);
//            movie.setActress(actress);
//            movie.setGenre(genre);
//            movie.setYear(year);
            
            beginTransaction();
            Session session = getSession();
            session.save(movie);
            commit();
            result = 1;
        } catch (HibernateException e) {
            e.printStackTrace();
             rollbackTransaction();
        } 
        finally {
            close();
        }
        
        return result;
    }
   
}
