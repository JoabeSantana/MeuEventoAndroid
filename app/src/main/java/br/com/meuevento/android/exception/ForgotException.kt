package br.com.meuevento.android.exception

class ForgotException(val code: Int, override val message: String?): Exception(message)