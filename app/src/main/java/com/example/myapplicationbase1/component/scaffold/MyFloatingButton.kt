package com.example.myapplicationbase1.component.scaffold

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplicationbase1.R

@Preview
@Composable
fun MyFloatingButtom() {
    FloatingActionButton(
        onClick = {  },// Accion del boton
        content = { // Contenido del boton
            Icon(painter = painterResource(R.drawable.outline_add_24), contentDescription = "")
        },
        shape = RoundedCornerShape(15), // Esquinas redondeadas
        containerColor = Color.Red,// Color del boton
        contentColor = Color.White, // Color del icono
        elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 15.dp) // Sombra del boton

    )
}