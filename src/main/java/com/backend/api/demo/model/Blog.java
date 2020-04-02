package com.backend.api.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String title;
    String content;
    String author;
    String description;
    String blogImage;
}
