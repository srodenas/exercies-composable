package com.example.myapplicationbase1.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun MyBox(){
    //El Box, si no tiene nada, es como un wrap_content y no se vería nada.
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter){
        Box(modifier = Modifier
            .size(200.dp)
            .background(Color.Blue), contentAlignment = Alignment.Center){
            Box(modifier = Modifier
                .size(100.dp)
                .background(Color.Red)
                .verticalScroll(rememberScrollState()), contentAlignment = Alignment.Center){
                Text (text = "hola Santi, como estas")
            }
        }
    }
}