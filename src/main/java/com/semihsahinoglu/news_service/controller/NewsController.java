package com.semihsahinoglu.news_service.controller;

import com.semihsahinoglu.news_service.dto.NewsRequest;
import com.semihsahinoglu.news_service.dto.NewsResponse;
import com.semihsahinoglu.news_service.service.NewsService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {

    private final NewsService newsService;

    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @PostMapping
    public ResponseEntity<NewsResponse> create(@Valid @RequestBody NewsRequest newsRequest) {
        NewsResponse newsResponse = newsService.create(newsRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(newsResponse);
    }

    @GetMapping
    public ResponseEntity<Page<NewsResponse>> getAll(Pageable pageable) {
        Page<NewsResponse> newsResponses = newsService.getAll(pageable);
        return ResponseEntity.ok().body(newsResponses);
    }

}
