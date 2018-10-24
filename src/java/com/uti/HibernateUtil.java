
package com.uti;
import java.util.Properties;  
import org.hibernate.SessionFactory;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
import org.hibernate.cfg.Configuration;  
import org.hibernate.service.ServiceRegistry;  
import com.model.pojo.User;  
import org.hibernate.HibernateException;
/**
 *
 * @author Andrew
 */  
public class HibernateUtil  
{  
    //Annotation based configuration  
    private static SessionFactory sessionFactory;  
    private static SessionFactory buildSessionFactory()  
    {  
        try  
        {  
            // Create the SessionFactory from hibernate.cfg.xml  
            Configuration configuration = new Configuration();  
            configuration.configure("/hibernate.cfg.xml");  
            System.out.println("Hibernate Annotation Configuration loaded");  
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();  
            System.out.println("Hibernate Annotation serviceRegistry created");  
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);  
            return sessionFactory;  
        }  
        catch (HibernateException ex)  
        {  
            // Make sure you log the exception, as it might be swallowed  
            System.err.println("Initial SessionFactory creation failed." + ex);  
            throw new ExceptionInInitializerError(ex);  
        }  
    }  
    public static SessionFactory getSessionFactory()  
    {  
        if (sessionFactory == null) sessionFactory = buildSessionFactory();  
        return sessionFactory;  
    }  
    public static void shutdown()  
    {  
        // Close caches and connection pools  
        sessionFactory.close();  
    }  
}  