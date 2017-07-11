package com.phearun.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.phearun.model.Article;	

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer>{
	
	Page<Article> findByTitleIgnoreCaseContaining(@Param("title") String title, Pageable pagable);
	
}
