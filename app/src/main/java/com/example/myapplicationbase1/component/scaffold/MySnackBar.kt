package com.example.myapplicationbase1.component.scaffold

import android.os.Message
import android.widget.Toast
import androidx.compose.material3.Button
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.launch

@Composable
fun MySnackBar(state: SnackbarHostState) {
    SnackbarHost(hostState = state)
}

@Composable
fun LogicMySnackBar( snackbarHostState: SnackbarHostState) {

    val scope = rememberCoroutineScope ()
    val context = LocalContext.current

    Button(
        content = {
            Text(text = "Algún tipo de Aviso")
        },
        onClick = {
            //para mostrar el snackbar en la pantalla, lo hago dentro de una corrutina
            scope.launch {
                val result = snackbarHostState.showSnackbar(
                    message = "Hola, soy un snackbar",
                    actionLabel = "¿Deshacer?",
                    duration = SnackbarDuration.Short)

                if (result == SnackbarResult.ActionPerformed){
                    Toast.makeText(context, "Has Deshecho la acción", Toast.LENGTH_SHORT).show()
                }
                else{
                    Toast.makeText(context, "No has Deshecho la acción", Toast.LENGTH_SHORT).show()
                }
            }
        }
    )
}



@Composable
fun MySnackBarController ( msg: String, onClick: () -> Unit) {
    Button(
        content = {
            Text(text = msg)
        }, onClick = onClick
    )

}