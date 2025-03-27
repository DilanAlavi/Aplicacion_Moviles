package com.example.domain.repository

interface LoginRepository {
    fun login(email: String, password: String): Boolean
}