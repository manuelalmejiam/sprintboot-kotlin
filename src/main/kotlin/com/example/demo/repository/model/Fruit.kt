package com.example.demo.repository.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("fruit")
data class Fruit(@Id val id: String?, val description: String)
