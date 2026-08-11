package com.example.myapplicationbase1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplicationbase1.component.FirstLogin
import com.example.myapplicationbase1.component.FirstText
import com.example.myapplicationbase1.component.FirstTextField
import com.example.myapplicationbase1.component.MyAvanceProgress
import com.example.myapplicationbase1.component.MyBottoms
import com.example.myapplicationbase1.component.MyIcon
import com.example.myapplicationbase1.component.MyImage
import com.example.myapplicationbase1.component.MyImageNetwork
import com.example.myapplicationbase1.login.Greeting
import com.example.myapplicationbase1.states.SecondStateSavable
import com.example.myapplicationbase1.ui.theme.MyApplicationBase1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationBase1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
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
                    MyAvanceProgress(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationBase1Theme {
        Greeting("Android")
    }
}