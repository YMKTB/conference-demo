package com.ymktb.conferencedemo.controllers;

import com.ymktb.conferencedemo.models.News;
import com.ymktb.conferencedemo.repositories.NewsRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private NewsRepository newsRepository;

    @GetMapping
    @RequestMapping("/anno")
    public String gets(Map<String, Object> model){
        Map map = new HashMap<String,String>();
        map.put("test","test app");
        model.put("message", map);
        return "annoAdmin";
    }

    @GetMapping
    @RequestMapping("/news")
    public String getss(Map<String, Object> model){
        Map map = new HashMap<String,String>();
        map.put("test","test app");
        model.put("message", map);
        return "newsAdmin";
    }
    @GetMapping
    @RequestMapping("{id}")
    public News get(@PathVariable Long id){
        return newsRepository.getOne(id);
    }

    @PostMapping
    public News create(@RequestBody final News news){
        return newsRepository.saveAndFlush(news);
    }
    @RequestMapping(value = "{id}" , method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        newsRepository.deleteById(id);
    }

    @RequestMapping(value = "{id}" , method = RequestMethod.PUT)
    public News update(@PathVariable Long id, @RequestBody News news){
        News existingNews = newsRepository.getOne(id);
        BeanUtils.copyProperties(news,existingNews,"id");
        return newsRepository.saveAndFlush(existingNews);
    }

    }
