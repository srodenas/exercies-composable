package com.example.myapplicationbase1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationbase1.component.MyRadioButtonList
import com.example.myapplicationbase1.component.scaffold.MyFirstScaffold
import com.example.myapplicationbase1.component.scaffold.ProbeComponentByScaffold
import com.example.myapplicationbase1.component.scaffold.ProbeComponentByScaffold2
import com.example.myapplicationbase1.login.Greeting
import com.example.myapplicationbase1.ui.theme.MyApplicationBase1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationBase1Theme {
             //   ProbeComponent()  //Prueba todos los componentes.

                /*
                Sólo para prueba de Scaffold
                 */
             //   MyFirstScaffold()  // sencillo scaffold
             //   ProbeComponentByScaffold()  //contiene un snackbar
                ProbeComponentByScaffold2()  //Define el comportamiento del snackbar fuera del Scaffold.
                }
            }
        }
    }



@Composable
fun ProbeComponent() {
    Scaffold(modifier = Modifier) { innerPadding ->
        //  MyBox()
        //    MyColumn(modifier = Modifier.padding(innerPadding))
        //    MyRow(modifier = Modifier.padding( innerPadding))
        //    CombinandoBox(modifier = Modifier.padding(innerPadding))
        //     MyFirstConstrain(modifier = Modifier.padding(innerPadding))
        //     MySecondConstrain(modifier = Modifier.padding(innerPadding))
        //FirstState(modifier = Modifier.padding(innerPadding))
        //   FirstStateSavable(modifier = Modifier.padding(innerPadding))
        //   SecondStateSavable(modifier = Modifier.padding(innerPadding))
        //    FirstText(modifier = Modifier.padding(innerPadding))
        //    FirstTextField(modifier = Modifier.padding(innerPadding))

        //    FirstLogin(modifier = Modifier.padding(innerPadding))
        //   MyBottoms(modifier = Modifier.padding(innerPadding))
        //   MyImage(modifier = Modifier.padding(innerPadding))
        //   MyImageNetwork()
        //   MyIcon(modifier = Modifier.padding(innerPadding))
        //  MyAvanceProgress(modifier = Modifier.padding(innerPadding))
        //     MySwitch(modifier = Modifier.padding(innerPadding))
        //    MyCheckBox(modifier = Modifier.padding(innerPadding))
        //  MyParentCheckBox(modifier = Modifier.padding(innerPadding))
        MyRadioButtonList(modifier = Modifier.padding(innerPadding))
    }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationBase1Theme {
        Greeting("Android")
    }
}