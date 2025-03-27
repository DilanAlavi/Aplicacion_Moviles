package com.example.aplicacion_ucb_restaurante.ui.login

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun LoginGustoUI(navController: NavController, viewModel: LoginViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    val email = viewModel.email.value
    val password = viewModel.password.value
    val rememberMe = viewModel.rememberMe.value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(130.dp))

        // Título estilizado
        Text(
            text = "Gusto Total",
            fontSize = 52.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF4E0E07)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Bienvenido", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Inicie sesión para acceder a su cuenta", fontSize = 14.sp, color = Color.Gray)

        Spacer(modifier = Modifier.height(100.dp))

        // Campo de correo
        OutlinedTextField(
            value = email,
            onValueChange = { viewModel.onEmailChanged(it) },
            label = { Text("Introduzca su correo electrónico") },
            leadingIcon = { Icon(Icons.Filled.Email, contentDescription = "Email") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Campo de contraseña
        OutlinedTextField(
            value = password,
            onValueChange = { viewModel.onPasswordChanged(it) },
            label = { Text("Contraseña") },
            leadingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Lock") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Recordarme y Olvidé mi contraseña
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Checkbox(checked = rememberMe, onCheckedChange = { viewModel.onRememberMeChanged(it) })
                Text(text = "Recuérdame")
            }
            Text(text = "¿Has olvidado la contraseña?", color = Color.Red, fontSize = 12.sp)
        }

        Spacer(modifier = Modifier.height(130.dp))

        // Botón de Next
        Button(
            onClick = { viewModel.onLogin(navController) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            shape = RoundedCornerShape(8.dp)
        ){
            Text(text = "Next", color = Color.White, fontSize = 18.sp)
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Registro
        Row {
            Text(text = "¿Es nuevo? ")
            Text(text = "Regístrese ahora", color = Color.Red, fontWeight = FontWeight.Bold)
        }
    }
}
