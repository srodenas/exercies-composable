package com.example.myapplicationbase1.component

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyBottoms(modifier: Modifier = Modifier){

    Column(modifier = modifier) {

        Button(
            content = {
                Text("Pulsar")
            },
            enabled = true,
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Black),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Red, //Color del contenido
                containerColor = Color.Yellow, //color de fondo.
                disabledContentColor = Color.Blue, //Color contenido deshabi
                disabledContainerColor = Color.Magenta //Color fondo deshabi


            ),
            onClick = {
                Log.i("pulsado", "He pulsado el boton")
            },
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp)
        )
        OutlinedButton(
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color.LightGray
            ),
            content = {
                Text ("Pulsar")
            },
            onClick = {
            Log.i("pulsado", "He pulsado un outlinedBotom")
        }
        )
    }
}
