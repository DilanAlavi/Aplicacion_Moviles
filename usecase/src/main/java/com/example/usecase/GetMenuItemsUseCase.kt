package com.example.usecase

import com.example.domain.model.MenuItem
import com.example.domain.repository.MenuRepository

class GetMenuItemsUseCase(private val repository: MenuRepository) {
    operator fun invoke(): List<MenuItem> {
        return repository.getMenuItems()
    }
}