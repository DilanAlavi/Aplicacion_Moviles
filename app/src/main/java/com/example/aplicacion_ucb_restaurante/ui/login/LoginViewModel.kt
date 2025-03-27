package com.example.aplicacion_ucb_restaurante.ui.login

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.State
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    // Estado para el email, contraseña y recordar sesión
    private val _email = mutableStateOf("")
    val email: State<String> = _email

    private val _password = mutableStateOf("")
    val password: State<String> = _password

    private val _rememberMe = mutableStateOf(false)
    val rememberMe: State<Boolean> = _rememberMe

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

    // Función de login
    fun onLogin() {
        // Aquí deberías agregar la lógica para validar el login
        if (_email.value.isNotEmpty() && _password.value.isNotEmpty()) {
            // Mostrar los valores de los campos en la terminal
            println("Email: ${_email.value}")
            println("Password: ${_password.value}")

            // Lógica de autenticación
        } else {
            // Manejo de error si los campos están vacíos
            println("Por favor, complete ambos campos.")
        }
    }

}
