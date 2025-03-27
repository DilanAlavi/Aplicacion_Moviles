package com.example.framework.mappers

import com.example.domain.model.User
import com.example.framework.dto.LoginRequestDTO
import com.example.framework.dto.LoginResponseDTO

class LoginMapper {
    fun mapToDomain(request: LoginRequestDTO): User {
        return User(
            email = request.email,
            password = request.password
        )
    }

    fun mapFromDomain(user: User): LoginRequestDTO {
        return LoginRequestDTO(
            email = user.email,
            password = user.password
        )
    }

    fun mapToResponse(success: Boolean): LoginResponseDTO {
        return LoginResponseDTO(
            success = success,
            message = if (success) "Login exitoso" else "Credenciales incorrectas"
        )
    }
}
