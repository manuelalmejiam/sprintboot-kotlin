package com.example.demo.service.impl

import com.example.demo.repository.FruitRepository
import com.example.demo.repository.model.Fruit
import com.example.demo.service.FruitService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional(readOnly = true)
class FruitServiceImpl(private val fruitRepository: FruitRepository)  : FruitService {

    override fun findByDescription(description: String): Fruit? = fruitRepository.findByDescription(description)

    override fun findAll(): MutableList<Fruit> = mutableListOf(Fruit("1","et"), Fruit("2","et"), Fruit("3","et"), Fruit("4","et"), Fruit("5","et"))//fruitRepository.findAll()
}