package com.noser.jeeshop;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAHibernateTest {
  protected static EntityManagerFactory emf;
  protected static EntityManager em;

  @BeforeClass
  public static void init() {
    emf = Persistence.createEntityManagerFactory("noser-persistence-test");
    em = emf.createEntityManager();
  }


  @AfterClass
  public static void tearDown() {
    em.clear();
    em.close();
    emf.close();
  }
}
