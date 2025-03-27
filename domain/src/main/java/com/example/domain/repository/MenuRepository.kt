package com.example.domain.repository
import com.example.domain.model.MenuItem
interface MenuRepository {
    fun getMenuItems(): List<MenuItem>
}