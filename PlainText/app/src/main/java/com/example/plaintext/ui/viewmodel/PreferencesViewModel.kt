package com.example.plaintext.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

data class PreferencesState(
    val login: String = "",
    val password: String = "",
    val preencher: Boolean = false,
    val loginDigitado: String = "",
    val passwordDigitado: String = ""
)

@HiltViewModel
class PreferencesViewModel @Inject constructor(
    handle: SavedStateHandle,
) : ViewModel() {
    var preferencesState by mutableStateOf(PreferencesState())
        private set

    fun updateLogin(login: String) {
        preferencesState = preferencesState.copy(
            login = login,
            loginDigitado = if (preferencesState.preencher) login else preferencesState.loginDigitado
        )
    }

    fun updatePassword(password: String) {
        preferencesState = preferencesState.copy(
            password = password,
            passwordDigitado = if (preferencesState.preencher) password else preferencesState.passwordDigitado
        )
    }

    fun updatePreencher(preencher: Boolean) {
        preferencesState = preferencesState.copy(
            preencher = preencher,
            loginDigitado = if (preencher) preferencesState.login else "",
            passwordDigitado = if (preencher) preferencesState.password else ""
        )
    }

    fun updateLoginDigitado(login: String) {
        preferencesState = preferencesState.copy(loginDigitado = login)
    }

    fun updatePasswordDigitado(password: String) {
        preferencesState = preferencesState.copy(passwordDigitado = password)
    }

    fun checkCredentials(): Boolean {
        return preferencesState.loginDigitado == preferencesState.login &&
                preferencesState.passwordDigitado == preferencesState.password &&
                preferencesState.login.isNotBlank() &&
                preferencesState.password.isNotBlank()
    }
}