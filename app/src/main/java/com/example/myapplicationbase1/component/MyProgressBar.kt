package com.example.myapplicationbase1.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

//@Preview
@Composable
fun MyFirstProgress(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Box(Modifier.size(200.dp).background(color = Color.Blue))
        CircularProgressIndicator(
            color = Color.Blue,
            strokeWidth = 10.dp,
            trackColor = Color.Yellow
        )
        Spacer(Modifier.height(20.dp))
        LinearProgressIndicator(
            color = Color.Green, //color verde.
            trackColor = Color.Yellow, //parte de atrás de la barra.
            strokeCap = StrokeCap.Round //borde redondeeado
        )
    }
}

@Preview
@Composable
fun MyAvanceProgress(modifier: Modifier = Modifier) {
    var progress: Float by remember { mutableFloatStateOf(0.5f) }
    var isLoading: Boolean by remember { mutableStateOf (value = true)}

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.Red),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //Box(Modifier.size(200.dp).background(color = Color.Blue))
        if (isLoading) {
            CircularProgressIndicator(
                color = Color.Blue,
                strokeWidth = 10.dp,
                trackColor = Color.Yellow,
                progress = { progress }

            )
            Spacer(Modifier.height(20.dp))
            Row(modifier = Modifier.padding(20.dp)) {
                Button(
                    onClick = { progress -= 0.1f },
                    content = {
                        Text(text = "--")
                    })
                Spacer(modifier = Modifier.width(24.dp))

                Button(content = {
                    Text(text = "++")
                }, onClick = { progress += 0.1f })

            }
        }
        Button(
            onClick = { isLoading  = !isLoading},
            content = {Text (text = if (isLoading) "Mostrar" else "Ocultar")})

    }
}