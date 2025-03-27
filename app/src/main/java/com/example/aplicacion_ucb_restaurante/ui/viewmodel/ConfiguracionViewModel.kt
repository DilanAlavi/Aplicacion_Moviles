package com.example.aplicacion_ucb_restaurante.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.example.domain.model.MenuItem
import com.example.usecase.GetMenuItemsUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class ConfiguracionViewModel(
    private val getMenuItemsUseCase: GetMenuItemsUseCase
) : ViewModel() {
    private val _menuItems = MutableStateFlow<List<MenuItem>>(emptyList())
    val menuItems: StateFlow<List<MenuItem>> = _menuItems.asStateFlow()

    init {
        cargarMenuItems()
    }

    private fun cargarMenuItems() {
        _menuItems.value = getMenuItemsUseCase()
    }
}