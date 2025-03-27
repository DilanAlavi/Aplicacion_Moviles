package com.example.data.repository

import com.example.domain.repository.MenuRepository
import com.example.domain.model.MenuItem

class MenuRepositoryImpl : MenuRepository {
    override fun getMenuItems(): List<MenuItem> {
        return listOf(
            MenuItem(1, "Mi cuenta", "mi_cuenta"),
            MenuItem(2, "Filtros de comida", "filtros_comida"),
            MenuItem(3, "Mis pedidos", "mis_pedidos"),
            MenuItem(4, "Mi carro de compras", "mi_carro"),
            MenuItem(5, "My Rewards", "rewards"),
            MenuItem(6, "Ofertas", "ofertas"),
            MenuItem(7, "Reservas", "reservas"),
            MenuItem(8, "Preferencia de notificaciones", "notificaciones"),
            MenuItem(9, "Centro de ayuda", "ayuda"),
            MenuItem(10, "Políticas de privacidad", "privacidad"),
            MenuItem(11, "Legal", "legal")
        )
    }
}
