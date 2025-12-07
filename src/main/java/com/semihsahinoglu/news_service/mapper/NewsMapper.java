package com.semihsahinoglu.news_service.mapper;

import com.semihsahinoglu.news_service.dto.NewsRequest;
import com.semihsahinoglu.news_service.dto.NewsResponse;
import com.semihsahinoglu.news_service.entity.News;
import org.springframework.stereotype.Component;

@Component
public class NewsMapper {

    public NewsResponse toDto(News news) {
        if (news == null) return null;

        NewsResponse newsResponse = NewsResponse.builder()
                .title(news.getTitle())
                .slug(news.getSlug())
                .content(news.getContent())
                .spot(news.getSpot())
                .category(news.getCategory())
                .subCategory(news.getSubCategory())
                .tags(news.getTags())
                .imageUrl(news.getImageUrl())
                .views(news.getViews())
                .createdBy(news.getCreatedBy())
                .createdDate(news.getCreatedDate())
                .build();

        return newsResponse;
    }

    public News toEntity(NewsRequest newsRequest) {
        if (newsRequest == null) return null;

        News news = News.builder()
                .title(newsRequest.title())
                .slug(newsRequest.slug())
                .content(newsRequest.content())
                .spot(newsRequest.spot())
                .category(newsRequest.category())
                .subCategory(newsRequest.subCategory())
                .tags(newsRequest.tags())
                .imageUrl(newsRequest.imageUrl())
                .views(newsRequest.views())
                .build();

        return news;
    }
}
