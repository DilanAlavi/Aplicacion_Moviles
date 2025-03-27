package com.example.framework.services


import com.example.framework.dto.LoginRequestDTO
import com.example.framework.dto.LoginResponseDTO
import com.example.framework.mappers.LoginMapper

class LoginService {
    private val mapper = LoginMapper()

    fun login(request: LoginRequestDTO): LoginResponseDTO {
        // Datos de usuario simulados
        val validEmail = "user@example.com"
        val validPassword = "password123"

        val user = mapper.mapToDomain(request)

        return if (user.email == validEmail && user.password == validPassword) {
            mapper.mapToResponse(true)
        } else {
            mapper.mapToResponse(false)
        }
    }
}
