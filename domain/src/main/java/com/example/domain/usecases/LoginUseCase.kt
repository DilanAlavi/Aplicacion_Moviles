package com.example.domain.usecases

import com.example.domain.repository.LoginRepository

class LoginUseCase(private val loginRepository: LoginRepository) {

    fun execute(email: String, password: String): Boolean {
        return loginRepository.login(email, password)
    }
}