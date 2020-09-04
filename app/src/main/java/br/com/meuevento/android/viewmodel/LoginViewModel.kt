package br.com.meuevento.android.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import br.com.meuevento.android.interactor.LoginInteractor

class LoginViewModel(app : Application) : AndroidViewModel(app) {

    private val loginInteractor = LoginInteractor()

    fun login(user: String, password: String){
        //TODO: REGRAS DE APRESENTAÇÃO

        //CHAMAR A INTERECTOR
        try {
            loginInteractor.login(user, password)
        }catch (Ex: Exception){
            //Tratar apresentação

        }

    }
}