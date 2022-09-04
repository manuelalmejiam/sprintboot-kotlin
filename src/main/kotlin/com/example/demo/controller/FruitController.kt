package com.example.demo.controller

import com.example.demo.service.FruitService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping("/api/fruit")
class FruitController(private val service: FruitService) {

    @GetMapping("/")
    fun findAll(): ResponseEntity<Any> {
        try {
            return ResponseEntity.ok(service.findAll())
        } catch (e: Exception) {
            val msg = "Something went wrong: " + e.message
            return ResponseEntity(msg, HttpStatus.INTERNAL_SERVER_ERROR)
        }
    }

    @GetMapping("/{description}")
    fun findOne(@PathVariable description: String) =
        service.findByDescription(description) ?: throw ResponseStatusException(HttpStatus.NOT_FOUND, "This article does not exist")
}