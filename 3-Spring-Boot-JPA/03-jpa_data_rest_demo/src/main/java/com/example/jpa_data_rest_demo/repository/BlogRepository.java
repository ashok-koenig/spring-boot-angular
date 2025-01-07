package com.example.jpa_data_rest_demo.repository;

import com.example.jpa_data_rest_demo.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
