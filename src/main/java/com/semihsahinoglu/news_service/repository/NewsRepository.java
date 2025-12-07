package com.semihsahinoglu.news_service.repository;

import com.semihsahinoglu.news_service.entity.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
}
