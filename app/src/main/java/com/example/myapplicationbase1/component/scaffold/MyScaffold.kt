package com.example.myapplicationbase1.component.scaffold

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Preview
@Composable
fun MyFirstScaffold() {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding),
            contentAlignment = Alignment.Center) {
            Text ("Contenido...")
        }
    }
}

@Composable
fun ProbeComponentByScaffold(modifier: Modifier = Modifier) {
    val snackbarHostState = remember { SnackbarHostState() } //para crear un snackbar que se pueda mostrar en la pantalla.
    val scope = rememberCoroutineScope() //para crear una corrutina que se pueda ejecutar en el hilo principal.
    val context = LocalContext.current
    Scaffold(
        modifier  = Modifier.fillMaxSize(),
        topBar = { MyTopAppBar(modifier = modifier)},
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) } //para mostrar el snackbar en la pantalla,

    ) { innerPadding ->

        Box (modifier = Modifier
            .padding(innerPadding)
            .background(Color.Yellow)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
            ){
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

    }

}

//
@Composable
fun ProbeComponentByScaffold2 (modifier: Modifier = Modifier) {
    val snackbarHostState = remember { SnackbarHostState() } //para crear un snackbar que se pueda mostrar en la pantalla.

    Scaffold(
        modifier  = Modifier.fillMaxSize(),
        topBar = { MyTopAppBar(modifier = modifier)},
        snackbarHost =  {MySnackBar(snackbarHostState)},// Llamo al composable que cree el SnackbarHost
        floatingActionButton = { MyFloatingButtom() },
        floatingActionButtonPosition = FabPosition.Start, //para que el boton flotante se muestre en la esquina superior izquierda de la pantalla.
        bottomBar = {MyGoodNavigateBar()}

    ) { innerPadding ->

        //content
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .background(Color.Yellow)
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            //Logica del
            LogicMySnackBar(snackbarHostState)
        }
    }
}

@Composable
fun ProbeComponentByScaffold3(modifier: Modifier = Modifier) {
    val snackbarHostState = remember { SnackbarHostState() } //para crear un snackbar que se pueda mostrar en la pantalla.
    val scope = rememberCoroutineScope() //para crear una corrutina que se pueda ejecutar en el hilo principal.
    val context = LocalContext.current
    Scaffold(
        modifier  = Modifier.fillMaxSize(),
        topBar = { MyTopAppBar(modifier = modifier)},
        snackbarHost = { SnackbarHost(hostState = snackbarHostState) } //para mostrar el snackbar en la pantalla,

    ) { innerPadding ->

        Box (modifier = Modifier
            .padding(innerPadding)
            .background(Color.Yellow)
            .fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            MySnackBarController(
                msg="Algún tipo de Aviso",
                onClick = {
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
    }
}