package com.example.myapplicationbase1.states

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Composable
fun FirstState(modifier: Modifier = Modifier) {
    //inicializamos el estado de state a 0
    val state1 = remember { mutableStateOf(0) }
    val state2 = remember { mutableStateOf(0) }

    Column {
        Text(
            text = "Pulsar texto1 veces(${state1.value})",
            modifier
                .clickable { state1.value += 1 })
        Text(
            text = "Pulsar texto2 veces(${state2.value})",
            modifier
                .clickable { state2.value += 1 })
        Text(text = "Texto sin estado")
    }
}

@Preview
@Composable
fun FirstStateSavable(modifier: Modifier = Modifier) {
    //inicializamos el estado de state a 0
    val state1 = rememberSaveable { mutableStateOf(0) }
    var state2 by rememberSaveable { mutableStateOf(0) }

    Column {
        Text(
            text = "Pulsar texto1 veces(${state1.value})",
            modifier
                .clickable { state1.value += 1 })
        Text(
            text = "Pulsar texto2 veces(${state2})",
            modifier
                .clickable { state2 += 1 })
        Text(text = "Texto sin estado")
    }
}

@Preview
@Composable
fun SecondStateSavable(modifier: Modifier = Modifier) {
    var value by rememberSaveable { mutableStateOf(0) }
    Column(modifier = modifier) {
        StateText1(value) { value += 1 }
        StateText2(value) { value += 1 }
        Text(text = "Texto sin estado")
    }
}

@Composable
fun StateText1(value: Int, onClick: () -> Unit) {
    Text(
        text = "Pulsar texto1 veces($value)",
        Modifier
            .clickable { onClick() })
}

@Composable
fun StateText2(value: Int, onClick: () -> Unit) {
    Text(
        text = "Pulsar texto2 veces($value})",
        Modifier
            .clickable { onClick() })
}