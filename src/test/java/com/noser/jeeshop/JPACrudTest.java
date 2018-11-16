package com.noser.jeeshop;

import com.noser.jeeshop.articles.entity.Article;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class JPACrudTest extends JPAHibernateTest {
  @Test
  public void createArticleTest() {
    Article a = new Article();
    a.name = "Flupp";
    a.description = "Badreiniger";

    em.persist(a);

    Article b = em.find(Article.class, 1L);

    assertNotNull(b);
  }

}
