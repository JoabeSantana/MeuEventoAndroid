package br.com.meuevento.android.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import br.com.meuevento.android.interactor.LoginInteractor

class LoginViewModel(val app : Application) : AndroidViewModel(app) {

    val LOGIN_SUCCESS = "LOGIN_SUCCESS"
    val LOGIN_ERROR = "LOGIN_ERROR"

    private val loginInteractor = LoginInteractor()

    val checkPassword = MutableLiveData<String>()
    val password = MutableLiveData<String>()
    val email = MutableLiveData<String>()

    var result = MutableLiveData<String>()

    fun login() {
        loginInteractor.login(email.value.toString(), password.value.toString()) { error ->
            result.value = if (error == null) LOGIN_SUCCESS else LOGIN_ERROR
        }
    }

    fun signup() {
        loginInteractor.signup(email.value.toString(), password.value.toString(), checkPassword.value.toString()) { error ->
            result.value = if (error == null) LOGIN_SUCCESS else LOGIN_ERROR
        }
    }

    fun forgot() {
        loginInteractor.forgot(email.value.toString()) { error ->
            result.value = if (error == null) LOGIN_SUCCESS else LOGIN_ERROR
        }
    }
}