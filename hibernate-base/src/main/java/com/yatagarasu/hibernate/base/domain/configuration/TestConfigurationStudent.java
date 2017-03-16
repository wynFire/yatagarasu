package com.yatagarasu.hibernate.base.domain.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestConfigurationStudent {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    SessionFactory sessionFactory = configuration.configure().buildSessionFactory();
    // Session session = sessionFactory.openSession();
    Session session = sessionFactory.getCurrentSession();
    Student student = new Student();
    student.setName("s1");
    student.setAge(10);

    session.beginTransaction();
    session.save(student);
    session.getTransaction().commit();
    session.close();
    sessionFactory.close();

  }
}
