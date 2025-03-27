package com.example.data.repository

import com.example.domain.repository.LoginRepository

class LoginRepositoryImpl : LoginRepository {
    override fun login(email: String, password: String): Boolean {
        // Lógica de autenticación simulada
        return email == "user@example.com" && password == "password123"
    }
}