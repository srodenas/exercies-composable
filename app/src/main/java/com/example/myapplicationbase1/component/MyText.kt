package com.example.myapplicationbase1.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun FirstText(modifier: Modifier = Modifier) {
    Column(modifier) {
        Text(text = "Santi")
        Text(text = "Santi Azul", color = Color.Red)
        Text(text = "Santi de tamaño", fontSize = 25.sp)
        Text(
            text = "Santi con estilo",
            fontStyle = FontStyle.Italic, fontSize = 25.sp
        )
        Text("texto con espacio", letterSpacing = 3.sp)
        Text(
            "texto con decoración",
            textDecoration = TextDecoration.Underline,
            color = Color.Blue,
            modifier = Modifier.clickable {}
        )
        Text(
            "Texto Alineado",
            textAlign = TextAlign.Center, //Lo centramos con respecto a lo que ocupa
            modifier = Modifier
                .fillMaxWidth()  //Que ocupe su espacio todo el ancho
                .background(color = Color.Magenta),

        )
        Text("blalb la bla blrtrr r grg gr grgrg rg rgrg  rga bla bla lb la bl ab  jkab jlkaj bkaj bka bkjab yyyyy",
            maxLines = 1, overflow = TextOverflow.Ellipsis)

    }

}