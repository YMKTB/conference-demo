package com.ymktb.conferencedemo.repositories;

import com.ymktb.conferencedemo.models.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News,Long> {
}
