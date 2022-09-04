package com.example.demo.exception

import org.springframework.http.HttpStatus

class FruitNotFoundException(val statusCode: HttpStatus, val reason: String) : Exception()