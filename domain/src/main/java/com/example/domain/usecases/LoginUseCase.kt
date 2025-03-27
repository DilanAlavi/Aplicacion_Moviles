package com.example.domain.usecases

import com.example.aplicacion_ucb_restaurante.domain.repository.LoginRepository

class LoginUseCase(private val loginRepository: LoginRepository) {

    fun execute(email: String, password: String): Boolean {
        return loginRepository.login(email, password)
    }
}