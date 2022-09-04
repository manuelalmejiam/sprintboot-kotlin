package com.example.demo.repository

import com.example.demo.repository.model.Fruit
import org.springframework.data.repository.CrudRepository

interface FruitRepository : CrudRepository<Fruit, String>{

    fun findByDescription(description: String): Fruit?
}