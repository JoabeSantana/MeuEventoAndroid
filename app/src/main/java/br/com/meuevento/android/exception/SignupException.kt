package br.com.meuevento.android.exception

class SignupException(val code: Int, override val message: String?): Exception(message)