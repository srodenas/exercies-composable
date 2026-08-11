package com.example.myapplicationbase1.component

import android.R.attr.text
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun FirstTextField(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        var textState by remember { mutableStateOf(value = "") }

        TextField(textState, onValueChange = { textState = it })
    }

}

@Preview
@Composable
fun FirstLogin(modifier: Modifier = Modifier) {
    var name: String by remember { mutableStateOf("") }
    val passwordState = remember { mutableStateOf("") }  //sin delegación
    var phone: String by remember {mutableStateOf(value = "")}

    Column(modifier = modifier) {
        TextName(name, onChange = { name = it })
        Spacer(Modifier.height(20.dp))
        TextPassword(value = passwordState.value, onChange = {
            passwordState.value = it
        })
        Spacer(Modifier.height(20.dp))
        TextPhone(phone, onChange = { phone = it })
        TextButtom()
    }
}

@Composable
fun TextPassword(value: String, onChange: (String) -> Unit) {
    var passHidden : Boolean by remember { mutableStateOf(value = true) }
    TextField(
        value = value,
        onValueChange = {
            onChange(it)
        },
        singleLine = true,
        placeholder = {
            Text(text = "Introduce password")
        },
        label = {
            Text(text = "password")
        },
        //Transformaremos en visible los caracteres, si passHidden es true, en caso contrario no hacemos nada **
        visualTransformation = if (passHidden) PasswordVisualTransformation() else VisualTransformation.None,  //se sustituye por *

        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password  //muestra teclado de password
        ),
        trailingIcon = { //Si pulsamos Mostrar, cambiamos el estado del booleano.
            Text (if (passHidden) "Mostrar" else "Ocultar", Modifier.clickable{passHidden = !passHidden})
        }
    )
}

@Composable
fun TextName(name: String, onChange: (String) -> Unit) {
    TextField(name, onValueChange = { onChange(it) },
        placeholder = {
            Text ("Introduce el nombre: ")
        })  //invoco a la función de ord. super.
}

@Composable
fun TextPhone(phone: String, onChange: (String) -> Unit) {
    OutlinedTextField(phone, onValueChange = { onChange(it) },
        placeholder = {
            Text ("Introduce el teléfono: ")
        },
        label = {Text ("Teléfono")},
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)

    )  //invoco a la función de ord. super.
}


@Composable
fun TextButtom() {
    // TODO("Not yet implemented")
}


