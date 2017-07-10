package com.phearun.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phearun.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer>{

	List<Article> findByTitleIgnoreCaseContaining(@Param("title") String title);

}
