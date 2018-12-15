package ch.bibbias.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRespository extends JpaRepository<Article, Long> {

}
