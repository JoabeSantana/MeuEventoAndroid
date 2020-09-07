package br.com.meuevento.android.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import br.com.meuevento.android.interactor.LoginInteractor
import kotlin.Exception

class LoginViewModel(val app : Application) : AndroidViewModel(app) {

    private val loginInteractor = LoginInteractor()

    fun login(user: String, password: String, callback: (error: Exception?) -> Unit){
        //TODO: REGRAS DE APRESENTAÇÃO

        //CHAMAR A INTERECTOR

        loginInteractor.login(user, password, callback)
    }

    fun signup(user: String, password: String, repPassword: String, callback: (error: Exception?) -> Unit){
        //TODO: REGRAS DE APRESENTAÇÃO

        //CHAMAR A INTERECTOR

        loginInteractor.signup(user, password, repPassword, callback)
    }
}