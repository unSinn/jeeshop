package com.noser.jeeshop.articles.entity;

import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name = "Article.findOne", query = "select a from Article a where a.id = :id"),
    @NamedQuery(name = "Article.getAll", query = "select a from Article a"),
    @NamedQuery(name = "Article.getList", query = "SELECT a FROM Article a WHERE a.id IN :ids")
})
public class Article {

  @Id
  @GeneratedValue
  public long id;
  public String name;
  public String description;

  public Article() {
  }

  public Article(String name, String description) {
    this.name = name;
    this.description = description;
  }

}