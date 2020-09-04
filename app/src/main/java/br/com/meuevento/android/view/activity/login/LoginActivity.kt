package br.com.meuevento.android.view.activity.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.meuevento.android.R
import br.com.meuevento.android.viewmodel.LoginViewModel
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    //val viewModel = LoginViewModel(application)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btLogin.setOnClickListener {
            val user = etEmail.text.toString()
            val password = etPassword.text.toString()
        //    viewModel.login(user, password)
        }

        tvSignUp.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}