package br.com.meuevento.android.interactor

import android.text.TextUtils
import android.util.Patterns
import br.com.meuevento.android.repository.LoginRepository
import java.lang.Exception

class LoginInteractor {

    val repo = LoginRepository()

    fun login(user: String, password: String) {
        //VALIDAR REGRA DE NEGÓCIO
        if(TextUtils.isEmpty(user)){
            throw Exception("Email inválido");
        }

        if(!Patterns.EMAIL_ADDRESS.matcher(user).matches()) {
            throw Exception("Senha inválida");
        }

        repo.login(user, password)
    }
}