package ru.kultushev.contact_book.di.modules

import ru.kultushev.contact_book.di.providers.navigation.CiceroneProvider
import ru.kultushev.contact_book.di.providers.navigation.NavigatorHolderProvider
import ru.kultushev.contact_book.di.providers.navigation.RouterProvider
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.NavigatorHolder
import ru.terrakok.cicerone.Router
import toothpick.config.Module
import toothpick.ktp.binding.bind

class NavigationModule : Module() {

    init {
        bind<Cicerone<Router>>().toProvider(CiceroneProvider::class.java).providesSingleton()
        bind<Router>().toProvider(RouterProvider::class.java).providesSingleton()
        bind<NavigatorHolder>().toProvider(NavigatorHolderProvider::class.java).providesSingleton()
    }

}