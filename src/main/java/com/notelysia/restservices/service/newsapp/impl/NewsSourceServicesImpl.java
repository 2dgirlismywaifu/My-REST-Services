package com.notelysia.restservices.service.newsapp.impl;

import com.notelysia.restservices.model.dto.newsapp.RSSList;
import com.notelysia.restservices.model.entity.newsapp.NewsDetail;
import com.notelysia.restservices.model.entity.newsapp.NewsSource;
import com.notelysia.restservices.repository.NewsDetailRepo;
import com.notelysia.restservices.repository.NewsSourceRepo;
import com.notelysia.restservices.service.newsapp.NewsSourceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsSourceServicesImpl implements NewsSourceServices {
    @Autowired
    private NewsSourceRepo newsSourceRepo;
    @Autowired
    private NewsDetailRepo newsDetailRepo;

    @Override
    public List<NewsSource> findAllNewsSource() {
        return newsSourceRepo.findAllNewsSource();
    }

    @Override
    public Optional<NewsSource> findByUserId(int useId) {
        return newsSourceRepo.findByUserId(useId);
    }

    @Override
    public List<NewsDetail> findByUrlTypeAndSourceName(String urlType, String sourceName) {
        return newsDetailRepo.findByUrlTypeAndSourceName(urlType, sourceName);
    }

    @Override
    public List<NewsDetail> findBySourceName(String sourceName) {
        return newsDetailRepo.findBySourceName(sourceName);
    }

    @Override
    public List<RSSList> findUrlBySourceName(String sourceName) {
        return newsDetailRepo.findUrlBySourceName(sourceName);
    }
}