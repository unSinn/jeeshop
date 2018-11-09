package com.noser.jeeshop.articles.entity;

import javax.persistence.*;

@Entity
@NamedQueries({
    @NamedQuery(name = "Article.findOne", query = "select a from Article a where a.id = :id"),
    @NamedQuery(name = "Article.getAll", query = "select a from Article a")
})
public class Article {

  @Id
  @GeneratedValue
  public long id;
  public String name;
  public String lastName;

  public Article() {
  }

  public Article(String name, String lastName) {
    this.name = name;
    this.lastName = lastName;
  }

}