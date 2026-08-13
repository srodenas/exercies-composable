package com.example.myapplicationbase1.component.scaffold

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion
import androidx.compose.ui.res.painterResource
import com.example.myapplicationbase1.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(modifier: Modifier = Modifier) {

    TopAppBar(
        title = {
            Text(text = "Mi Aplicacion")
        },
        navigationIcon = { //Puedo poner los iconos que queramos a la izquierda.
            Icon(
                painter = painterResource(R.drawable.outline_accessible_24),
                contentDescription = ""
            )
        },
        actions = {
            //Puedo poner los iconos que queramos a la derecha.
            Icon(
                painter = painterResource(R.drawable.outline_accessible_24),
                contentDescription = ""
            )
            Icon(
                painter = painterResource(R.drawable.outline_accessible_24),
                contentDescription = ""
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Red, //color de la barra de arriba
            titleContentColor = Color.White, //color del titulo
            navigationIconContentColor = Color.Yellow, //color de los iconos de la izquierda
            actionIconContentColor = Color.White, //color de los iconos de la derecha
            scrolledContainerColor = Color.Black //color de la barra de arriba
        )

    )

}