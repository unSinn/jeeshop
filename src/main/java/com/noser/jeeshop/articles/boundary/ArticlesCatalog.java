package com.noser.jeeshop.articles.boundary;

import com.noser.jeeshop.articles.entity.AddArticle;
import com.noser.jeeshop.articles.entity.Article;
import com.noser.jeeshop.articles.entity.ArticleDao;
import org.eclipse.microprofile.metrics.annotation.Gauge;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;
import java.util.concurrent.atomic.LongAdder;

@ApplicationScoped
public class ArticlesCatalog {

  private LongAdder requests;

  @Inject
  ArticleDao articles;

  @PostConstruct
  public void init() {
    requests = new LongAdder();
  }

  List<Article> getAll() {
    requests.increment();
    return articles.getAll();
  }

  void add(AddArticle a) {
    articles.save(new Article(a.name, a.description));
  }

  @Gauge(unit = "count")
  public int numberOfRequests() {
    return requests.intValue();
  }

}
