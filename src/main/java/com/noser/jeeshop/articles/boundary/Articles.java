package com.noser.jeeshop.articles.boundary;

import com.noser.jeeshop.articles.entity.AddArticle;
import com.noser.jeeshop.articles.entity.Article;
import io.swagger.annotations.Api;
import org.slf4j.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@Api(value = "Articles service")
@Path("articles")
public class Articles {

  @Inject
  private Logger logger;

  @Inject
  private ArticlesCatalog articlesCatalog;

  @GET
  public List<Article> getArticles() {
    logger.info("Sending all Articles");
    return articlesCatalog.getAll();
  }

  @POST
  public void add(AddArticle a) {
    logger.info("Got {}", a);
    articlesCatalog.add(a);
  }

}
