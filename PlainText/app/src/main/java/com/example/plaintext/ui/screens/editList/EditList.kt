package com.example.plaintext.ui.screens.editList

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.plaintext.data.model.PasswordInfo
import com.example.plaintext.ui.screens.Screen
import com.example.plaintext.ui.screens.login.TopBarComponent

data class EditListState(
    val nomeState: MutableState<String>,
    val usuarioState: MutableState<String>,
    val senhaState: MutableState<String>,
    val notasState: MutableState<String>,
)

fun isPasswordEmpty(password: PasswordInfo): Boolean {
    return password.name.isEmpty() &&
            password.login.isEmpty() &&
            password.password.isEmpty() &&
            password.notes.isNullOrEmpty()
}

@Composable
fun EditList(
    args: Screen.EditList,
    navigateBack: () -> Unit,
    savePassword: (password: PasswordInfo) -> Unit
) {
    val password = args.password
    val title = if (isPasswordEmpty(password)) {
        "Adicionar nova senha"
    } else {
        "Editar senha"
    }

    val nomeState = rememberSaveable { mutableStateOf(password.name) }
    val usuarioState = rememberSaveable { mutableStateOf(password.login) }
    val senhaState = rememberSaveable { mutableStateOf(password.password) }
    val notasState = rememberSaveable { mutableStateOf(password.notes ?: "") }

    Scaffold(
        topBar = {
            TopBarComponent()
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
                .background(Color(0xFF1B0B02)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = title,
                color = Color.White,
                fontSize = 22.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFF9AC42F))
                    .padding(horizontal = 30.dp, vertical = 14.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            EditInput(
                textInputLabel = "Nome",
                textInputState = nomeState
            )

            EditInput(
                textInputLabel = "Usuário",
                textInputState = usuarioState
            )

            EditInput(
                textInputLabel = "Senha",
                textInputState = senhaState
            )

            EditInput(
                textInputLabel = "Notas",
                textInputState = notasState,
                textInputHeight = 170
            )

            Spacer(modifier = Modifier.height(20.dp))

            Button(
                onClick = {
                    savePassword(
                        PasswordInfo(
                            id = password.id,
                            name = nomeState.value,
                            login = usuarioState.value,
                            password = senhaState.value,
                            notes = notasState.value
                        )
                    )
                    navigateBack()
                }
            ) {
                Text("Salvar")
            }
        }
    }
}

@Composable
fun EditInput(
    textInputLabel: String,
    textInputState: MutableState<String> = mutableStateOf(""),
    textInputHeight: Int = 60
) {
    val padding: Int = 30

    var textState by rememberSaveable { textInputState }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(textInputHeight.dp)
            .padding(horizontal = padding.dp),
        horizontalArrangement = Arrangement.Center,
    ) {
        OutlinedTextField(
            value = textState,
            onValueChange = { textState = it },
            label = { Text(textInputLabel) },
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.White,
                unfocusedTextColor = Color.White,
                focusedLabelColor = Color.White,
                unfocusedLabelColor = Color.White,
                cursorColor = Color.White,
                focusedBorderColor = Color.White,
                unfocusedBorderColor = Color.White
            ),
            modifier = Modifier
                .height(textInputHeight.dp)
                .fillMaxWidth()
        )
    }

    Spacer(modifier = Modifier.height(10.dp))
}

@Preview(showBackground = true)
@Composable
fun EditListPreview() {
    EditList(
        Screen.EditList(PasswordInfo(1, "Nome", "Usuário", "Senha", "Notas")),
        navigateBack = {},
        savePassword = {}
    )
}

@Preview(showBackground = true)
@Composable
fun EditInputPreview() {
    EditInput("Nome")
}