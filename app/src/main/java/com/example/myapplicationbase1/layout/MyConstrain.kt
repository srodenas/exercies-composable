package com.example.myapplicationbase1.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

//@Preview
@Composable
fun MyFirstConstrain(modifier : Modifier = Modifier){
    //Creamos nuestro constrain de tamaño maximo de la pantalla.
    ConstraintLayout (modifier = modifier.fillMaxSize()){
        //Nos crearemos id's mediante referencias.
        val (boxRed, boxYellow, boxGreen, boxCyan, boxBlue) = createRefs()
        Box(modifier = Modifier.size(150.dp).background(Color.Red)
            .constrainAs(boxRed) {
                //codigo para el posicionamiento del Box.
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
            }
        )

        Box(modifier = Modifier.size(150.dp).background(Color.Yellow)
            .constrainAs(boxYellow){
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            }
        )

        Box (modifier = Modifier.size(150.dp).background(Color.Green)
            .constrainAs(boxGreen){
            bottom.linkTo(boxRed.top)
            start.linkTo(boxRed.end)
        })

        Box (modifier = Modifier.size(150.dp).background(Color.Cyan)
            .constrainAs(boxCyan){
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)
            })

        Box (modifier = Modifier.size(150.dp).background(Color.Blue)
            .constrainAs(boxBlue){
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            })
    }

}

@Preview
@Composable
fun MySecondConstrain(modifier : Modifier = Modifier){
    ConstraintLayout (modifier = modifier.fillMaxSize()){
        //Nos crearemos id's mediante referencias.
        val (boxRed, boxYellow, boxGreen, boxCyan, boxBlue) = createRefs()
        val (boxDark, boxMagenta, boxBlack, boxLightGray) = createRefs()
        Box(modifier = Modifier.size(100.dp).background(Color.Red)
            .constrainAs(boxRed) {
                //codigo para el posicionamiento del Box.
                top.linkTo(parent.top)
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
            }
        )
        Box (modifier = Modifier.size(200.dp).background(Color.DarkGray)
            .constrainAs(boxDark){
                top.linkTo(boxRed.bottom)
                end.linkTo(parent.end)
                start.linkTo(parent.start)
            })

        Box(modifier = Modifier.size(100.dp).background(Color.Yellow)
            .constrainAs(boxYellow){
                bottom.linkTo(boxRed.top)
                end.linkTo(boxRed.start)
            }
        )

        Box (modifier = Modifier.size(100.dp).background(Color.Green)
            .constrainAs(boxGreen){
                bottom.linkTo(boxRed.top)
                start.linkTo(boxRed.end)
            })

        Box (modifier = Modifier.size(100.dp).background(Color.Cyan)
            .constrainAs(boxCyan){
                top.linkTo(boxRed.bottom)
                end.linkTo(boxRed.start)
            })

        Box (modifier = Modifier.size(100.dp).background(Color.Blue)
            .constrainAs(boxBlue){
                top.linkTo(boxRed.bottom)
                start.linkTo(boxRed.end)
            })

        Box (modifier = Modifier.size(150.dp).background(Color.Magenta)
            .constrainAs(boxMagenta){
                bottom.linkTo(boxYellow.top)
                end.linkTo(boxYellow.end)
            })

        Box (modifier = Modifier.size(150.dp).background(Color.LightGray)
            .constrainAs(boxLightGray){
                bottom.linkTo(boxGreen.top)
                start.linkTo(boxGreen.start)
            })

        Box (modifier = Modifier.size(100.dp).background(Color.Black)
            .constrainAs(boxBlack){
                start.linkTo(boxMagenta.end)
                end.linkTo(boxLightGray.start)
                top.linkTo(boxMagenta.top)
                bottom.linkTo(boxMagenta.bottom)
            })
    }

}