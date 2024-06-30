package jdbc;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateRunner {
    private static SessionFactory sessionFactory;
    private static Configuration configuration;
    private static Session session;


    public static void main(String[] args) {
//        Configuration configuration = new Configuration();
//        configuration.configure();

//        try (SessionFactory sessionFactory = configuration.buildSessionFactory();
//             Session session = sessionFactory.openSession()) {
//
//            CriteriaBuilder cb = session.getCriteriaBuilder();
//            CriteriaQuery<Product> cq = cb.createQuery(Product.class);
//            Root<Product> root = cq.from(Product.class);
//            cq.select(root).where(cb.equal(root.get("id"), 731));
//
//            Product product = new Product();
//            product = session.createQuery(cq).getSingleResult();
//            System.out.println(product);
//        }




    }
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                configuration = new Configuration().configure();
                sessionFactory = configuration.buildSessionFactory();

            } catch (Exception e) {
                System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }

    public static Session getSession() {
        return getSessionFactory().openSession();
    }

    public static CriteriaBuilder getCriteriaBuilder(Session session, Class clazz) {
        CriteriaBuilder cb = session.getCriteriaBuilder();
        return cb;
    }

    public static <T> T findById(Object obj, int id) {
        return (T) HibernateRunner.getSession().get(obj.getClass(), id);
    }



}
