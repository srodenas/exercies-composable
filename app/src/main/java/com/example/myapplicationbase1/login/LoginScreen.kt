package com.example.myapplicationbase1.login

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview



@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!*********",
        modifier = modifier
    )
}

@Preview
@Composable
fun MyText(){
    Text("Santi")
}

@Preview
@Composable
fun MyText2(){
    Text("Guille")
}
@Preview
@Composable
fun MyTextWithParametersPreview(){
    MyTextWithParameters("Santi")
}
@Composable
fun MyTextWithParameters(a: String){
    Text("Mi texto con $a")
}
@Preview
@Composable
fun MyText1(){
    Text("Sonia")
}