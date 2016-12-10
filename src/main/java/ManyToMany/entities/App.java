package ManyToMany.entities;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import org.hibernate.SessionFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory = (SessionFactory) Persistence.createEntityManagerFactory( "org.hibernate.tutorial.jpa" );
        EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        Room r1=new Room();
        r1.setRoomNo("2345");
        
        Room r2=new Room();
        r2.setRoomNo("5464565");
        
        entityManager.persist(r1);
        entityManager.persist(r2);
        
        User u1=new User();
        u1.setName("dweqweqwe");
        u1.setSurname("retfrterrte");
        u1.setRoom(r1);
        
        User u2=new User();
        u2.setName("d4rereweqweqwe");
        u2.setSurname("retfgddsfdgfdfgfrterrte");
        u2.setRoom(r2);
        
        entityManager.persist(u1);
        entityManager.persist(u2);
        entityManager.getTransaction().commit();

    
        entityManager.close();
        sessionFactory.close();
    }
}
