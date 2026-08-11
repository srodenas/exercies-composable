package com.example.myapplicationbase1.exercites

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun CombinandoBox(modifier: Modifier = Modifier){

    Column (modifier = modifier){
        Box(modifier = Modifier
            .padding(bottom = 20.dp) //Se aplica antes del weight
            .background(Color.Blue)
            .weight(1f)
            .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){
            Text(text="texto 1")
        }
        Box(modifier = Modifier.background(Color.Green).weight(1f).fillMaxWidth()){
            Row{
                Box (modifier = Modifier
                    .background(Color.Red)
                    .weight(1f)
                    .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ){
                    Text (text = "Texto 2")
                }
                Box (modifier = Modifier
                    .background(Color.Yellow)
                    .weight(1f)
                    .fillMaxHeight(),
                    contentAlignment = Alignment.Center
                ){
                    Text (text = "Texto 3")

                }

            }
        }
        Spacer(Modifier.height(20.dp)) //Mejor aplicar un Spacer a un padding.

        Box(modifier = Modifier
            .background(Color.Cyan)
            .weight(1f)
            .fillMaxWidth(),
            contentAlignment = Alignment.BottomCenter
        ){
            Text (text = "Texto 4")

        }

    }
}