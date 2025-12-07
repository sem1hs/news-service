package com.semihsahinoglu.news_service.service;

import com.semihsahinoglu.news_service.dto.NewsRequest;
import com.semihsahinoglu.news_service.dto.NewsResponse;
import com.semihsahinoglu.news_service.entity.News;
import com.semihsahinoglu.news_service.mapper.NewsMapper;
import com.semihsahinoglu.news_service.repository.NewsRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class NewsService {

    private final NewsRepository newsRepository;
    private final NewsMapper newsMapper;

    public NewsService(NewsRepository newsRepository, NewsMapper newsMapper) {
        this.newsRepository = newsRepository;
        this.newsMapper = newsMapper;
    }

    public NewsResponse create(NewsRequest newsRequest) {
        News news = newsMapper.toEntity(newsRequest);
        News saved = newsRepository.save(news);
        return newsMapper.toDto(saved);
    }

    public Page<NewsResponse> getAll(Pageable pageable) {
        Page<News> newsList = newsRepository.findAll(pageable);
        return newsList.map(newsMapper::toDto);
    }
}
