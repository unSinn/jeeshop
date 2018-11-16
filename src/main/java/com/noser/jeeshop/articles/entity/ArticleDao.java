package com.noser.jeeshop.articles.entity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class ArticleDao {

  @PersistenceContext
  private EntityManager em;

  public List<Article> getAll() {
    return em.createNamedQuery("Article.getAll", Article.class).getResultList();
  }

  public List<Article> getList(List<Long> articleIds) {
    return em.createNamedQuery("Article.getList", Article.class).setParameter("ids", articleIds).getResultList();
  }

  public Article find(Long id) {
    return em.createNamedQuery("Article.findOne", Article.class).setParameter("id", id).getSingleResult();
  }

  public void save(Article a) {
    em.persist(a);
  }

  public void update(Article a) {
    em.merge(a);
  }

  public void delete(Article a) {
    em.remove(a);
  }
}
