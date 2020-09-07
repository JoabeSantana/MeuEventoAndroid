package br.com.meuevento.android.repository

import com.google.firebase.auth.FirebaseAuth

class LoginRepository {

    fun login(user: String, password: String, callback: (error: Exception?) -> Unit) {
        //EFETUAR CHAMADA SERVIDOR DE AUTENTICACAO
        val auth = FirebaseAuth.getInstance()

        val task = auth.signInWithEmailAndPassword(user, password)
        task.addOnCompleteListener { result ->
            if(result.isSuccessful){
                callback(null)
            } else {
                callback(result.exception)
            }
        }
    }

    fun signup(user: String, password: String, callback: (error: Exception?) -> Unit) {
        //EFETUAR CHAMADA SERVIDOR DE AUTENTICACAO
        val auth = FirebaseAuth.getInstance()

        val task = auth.createUserWithEmailAndPassword(user, password)
        task.addOnCompleteListener { result ->
            if(result.isSuccessful){
                callback(null)
            } else {
                callback(result.exception)
            }
        }
    }
}