package br.com.lucasalbuquerque.di.component

import br.com.lucasalbuquerque.DarkApplication
import br.com.lucasalbuquerque.di.module.ApplicationModule
import br.com.lucasalbuquerque.di.module.RemoteRetrofitModule
import br.com.lucasalbuquerque.ui.activity.CharactersActivity
import br.com.lucasalbuquerque.ui.activity.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(ApplicationModule::class, RemoteRetrofitModule::class))
interface ApplicationComponent {
    fun inject(application: DarkApplication)

    fun inject(mainActivity: MainActivity)
    fun inject(mainActivity: CharactersActivity)
}
