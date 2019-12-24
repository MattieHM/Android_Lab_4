package ru.kultushev.contact_book.ui.activity

import android.os.Bundle
import com.arellomobile.mvp.MvpAppCompatActivity
import ru.kultushev.contact_book.R
import ru.kultushev.contact_book.di.DI
import ru.kultushev.contact_book.ui.common.BackButtonListener
import ru.kultushev.contact_book.ui.main.MainFragmentContainer
import toothpick.Toothpick

class MainActivity : MvpAppCompatActivity() {

    init {
        val scope = Toothpick.openScopes(DI.APP, DI.ACTIVITY)
        scope.installModules(

        )
        Toothpick.inject(this, scope)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.activity_content, MainFragmentContainer())
                .commit()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        Toothpick.closeScope(DI.ACTIVITY)
    }

    override fun onBackPressed() {
        val fragment = supportFragmentManager.findFragmentById(R.id.activity_content)
        if (fragment != null
            && fragment is BackButtonListener &&
            (fragment as BackButtonListener).onBackPressed()
        ) {
            return
        } else {
            super.onBackPressed()
        }
    }

}