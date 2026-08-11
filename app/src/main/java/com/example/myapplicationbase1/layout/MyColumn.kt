package com.example.myapplicationbase1.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun MyColumn(modifier: Modifier= Modifier){  //Para que funcione el Preview
    Column (modifier = modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
        Text(text="santi", modifier = Modifier.background(Color.Red))
        Text(text="Sonia", modifier = Modifier.background(Color.Blue))
        Text("Guille", modifier = Modifier.background(Color.Cyan))
        Text("Diego", modifier = Modifier.background(Color.Yellow))
    }

}