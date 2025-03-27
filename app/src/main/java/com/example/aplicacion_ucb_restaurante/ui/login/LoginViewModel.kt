package com.example.aplicacion_ucb_restaurante.ui.login

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.framework.dto.LoginRequestDTO
import com.example.framework.services.LoginService

class LoginViewModel(private val loginService: LoginService = LoginService()) : ViewModel() {

    // Estado para el email, contraseña y recordar sesión
    private val _email = mutableStateOf("")
    val email: State<String> = _email

    private val _password = mutableStateOf("")
    val password: State<String> = _password

    private val _rememberMe = mutableStateOf(false)
    val rememberMe: State<Boolean> = _rememberMe

    // Estado para el mensaje de login
    private val _loginStatus = mutableStateOf("")
    val loginStatus: State<String> = _loginStatus

    // Funciones para manejar los cambios en los campos
    fun onEmailChanged(newEmail: String) {
        _email.value = newEmail
    }

    fun onPasswordChanged(newPassword: String) {
        _password.value = newPassword
    }

    fun onRememberMeChanged(checked: Boolean) {
        _rememberMe.value = checked
    }

    fun onLogin(navController: NavController) {
        val request = LoginRequestDTO(email.value, password.value)
        val response = loginService.login(request)

        _loginStatus.value = response.message

        if (response.success) {
            // Si el login es exitoso, navega al HomeScreen
            navController.navigate("home")
        }
    }
}