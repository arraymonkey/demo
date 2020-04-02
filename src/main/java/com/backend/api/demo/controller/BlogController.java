package com.backend.api.demo.controller;

import com.backend.api.demo.model.Blog;
import com.backend.api.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class BlogController {

    @Autowired
    BlogRepository blogRepository;

    @PostMapping("/blogs")
    public Blog createBlog(@Valid @RequestBody Blog blog) {
        return blogRepository.save(blog);
    }

    @GetMapping("/blogs/{blogId}")
    public Object getBlog(@PathVariable("blogId") int blog) {
        return blogRepository.findById(blog);
    }

}
