package com.example.demo.service

import com.example.demo.repository.model.Fruit

interface FruitService {
    fun findByDescription(description: String): Fruit?
    fun findAll(): Iterable<Fruit>
}