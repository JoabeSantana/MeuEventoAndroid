package br.com.meuevento.android.interactor

import android.text.TextUtils
import android.util.Patterns
import br.com.meuevento.android.repository.LoginRepository
import kotlin.Exception

class LoginInteractor {

    val repo = LoginRepository()

    fun login(user: String, password: String, callback: (error: Exception?) -> Unit) {
        //VALIDAR REGRA DE NEGÓCIO
        if(TextUtils.isEmpty(user)){
            callback(Exception("Email inválido"))
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(user).matches()) {
            callback(Exception("Senha inválida"))
            return
        }

        repo.login(user, password, callback)
    }

    fun signup(user: String, password: String, repPassword: String, callback: (error: Exception?) -> Unit) {
        //TODO: VALIDAR REGRAS PARA CRIAR USUARIOS
        if(TextUtils.isEmpty(user)){
            callback(Exception("Email inválido não informado"))
            return
        }

        if(!TextUtils.equals(password, repPassword)){
            callback(Exception("Senhas não batem"))
            return
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(user).matches()) {
            callback(Exception("Email inválido"))
            return
        }

        repo.signup(user, password, callback)
    }
}