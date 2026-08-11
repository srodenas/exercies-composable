package com.example.myapplicationbase1.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myapplicationbase1.R

@Preview
@Composable
fun MyImage(modifier : Modifier = Modifier){
    Image(
        painter = painterResource(R.drawable.leon),
        contentDescription = "Descripcion de la imagen",
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(50))
            .border(width = 10.dp, shape = RoundedCornerShape(50),
                brush = Brush.linearGradient(listOf<Color>(Color.Red, Color.Green, Color.Blue))),
        contentScale = ContentScale.Crop
        )
}

@Composable
fun MyImageNetwork(){
    AsyncImage(
        model = "https://raw.githubusercontent.com/srodenas/images-for-android/refs/heads/main/leon.jpg",
        contentDescription = null,
        modifier = Modifier
            .size(300.dp)
            .clip(RoundedCornerShape(50))
            .border(width = 10.dp, shape = RoundedCornerShape(50),
                brush = Brush.linearGradient(listOf<Color>(Color.Red, Color.Green, Color.Blue))),
        contentScale = ContentScale.Crop
    )
}

@Preview
@Composable
fun MyIcon(modifier: Modifier = Modifier){
    Column(modifier = modifier){
        Icon(painterResource(R.drawable.outline_accessible_24),
            contentDescription = null,
            modifier=Modifier.size(100.dp),
            tint = Color.Blue
            )
    }
}