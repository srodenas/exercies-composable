package com.example.myapplicationbase1.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplicationbase1.R
import com.example.myapplicationbase1.component.state.CheckBoxState

@Preview
@Composable
fun MySwitch (modifier: Modifier = Modifier) {
    var switState by remember { mutableStateOf(true) }
    Box (modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
        )
    {
        Switch(
            checked = switState,
            onCheckedChange = { switState = it } ,
            thumbContent = {
                Icon (
                    painter = painterResource(id=R.drawable.outline_accessible_24),
                    contentDescription = null
                )
            },
            enabled = true,  //esto desactiva el switch
            colors = SwitchDefaults.colors(
                checkedThumbColor = Color.Red,  //pinta el thumb (fondo del icono) en rojo activado
                uncheckedThumbColor = Color.Blue, //pinta el thum en azul desactivado (enable = true)
                disabledCheckedThumbColor = Color.Yellow, //pinta el thumb en amarillo desactivado (enable = false), checked true
                disabledUncheckedThumbColor = Color.Green, //pinta el thumb en verde desactivado (enable = false), checked false
                checkedIconColor = Color.Green, //pinta el icono en verde (checked = true)
                uncheckedIconColor = Color.White, //pinta el icono en negro (checked = false)
                disabledCheckedIconColor = Color.Black, //pinta el icono en negro desactivado (enable = false), checked true
                disabledUncheckedIconColor = Color.Yellow, //pinta el icono en negro desactivado (enable = false), checked false
                checkedBorderColor = Color.Magenta, //pinta el borde en magenta (checked = true)
                uncheckedBorderColor = Color.Magenta, //pinta el borde en magenta (checked = false)
                disabledCheckedBorderColor = Color.Magenta, //pinta el borde en magenta desactivado (enable = false), checked true
                disabledUncheckedBorderColor = Color.Magenta, //pinta el borde en magenta desactivado (enable = false), checked false
                checkedTrackColor = Color.Cyan, //pinta el track en magenta (checked = true)
                uncheckedTrackColor = Color.DarkGray, //pinta el track en magenta (checked = false)
            )
        )

    }
}

@Preview
@Composable
fun MyCheckBox (modifier: Modifier = Modifier) {
    var checkSelect : Boolean by remember { mutableStateOf(false) }
    Box (modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center,
        )
    {
        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable { checkSelect = !checkSelect }) {
            Checkbox(
                checked = checkSelect,
                onCheckedChange = { checkSelect = it } ,
                enabled = true,  //esto desactiva el checkbox
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Yellow,  //pinta el fondo en rojo activado
                    uncheckedColor = Color.Blue, //pinta el fondo en azul desactivado (enable = true)
                    disabledCheckedColor = Color.Yellow, //pinta el fondo en amarillo desactivado (enable = false), checked true
                    disabledUncheckedColor = Color.Green, //pinta el fondo en verde desactivado (enable = false), checked false
                    checkmarkColor = Color.Green   //pinta el icono en verde (checked = true)

                )
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = "Aceptamos los términos y condiciones")
        }

    }
}

@Composable
fun MyCheckBoxComponent(modifier: Modifier = Modifier,
                        checkBoxState: CheckBoxState,
                        onCheckedChange: (CheckBoxState) -> Unit) {

        Row(verticalAlignment = Alignment.CenterVertically,
            modifier = modifier.clickable { onCheckedChange(checkBoxState) }) {
            Checkbox(
                checked = checkBoxState.checked,
                onCheckedChange = { onCheckedChange(checkBoxState) } ,
                enabled = true,  //esto desactiva el checkbox
                colors = CheckboxDefaults.colors(
                    checkedColor = Color.Yellow,  //pinta el fondo en rojo activado
                    uncheckedColor = Color.Blue, //pinta el fondo en azul desactivado (enable = true)
                    disabledCheckedColor = Color.Yellow, //pinta el fondo en amarillo desactivado (enable = false), checked true
                    disabledUncheckedColor = Color.Green, //pinta el fondo en verde desactivado (enable = false), checked false
                    checkmarkColor = Color.Green   //pinta el icono en verde (checked = true)
                )
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(text = checkBoxState.label)
        }
}

@Composable
fun MyParentCheckBox(modifier: Modifier = Modifier) {
    var state by remember { mutableStateOf(
        listOf (
            CheckBoxState("terms", "Aceptar los términos y condiciones", false),
            CheckBoxState("privacy", "Aceptar la política de privacidad", true),
            CheckBoxState("marketing", "Aceptar marketing", true),
        )
    ) }
    Column (modifier = Modifier.fillMaxSize()){

        state.forEach { myState ->
            MyCheckBoxComponent(checkBoxState = myState){
                state = state.map{
                    if (it.id == myState.id){
                        it.copy(checked = !it.checked)
                    }else{
                        it
                    }
                }
            }
        }
    }
}

@Composable
fun MyRadioButtonComponent(name: String, selectedName: String, onItemSelected: (String) -> Unit) {
    Row(modifier = Modifier.clickable { onItemSelected(name) }, verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = name == selectedName, //debe ser un booleano que indica si está seleccionado
            onClick = { onItemSelected(name) })
        Text(text = name)

    }
    
}

@Composable
fun MyRadioButtonList(modifier: Modifier = Modifier) {
    var selectedName by remember { mutableStateOf("") }
    Column(modifier=modifier) {
        MyRadioButtonComponent (name ="Pepe", selectedName = selectedName){ selectedName = it }
        MyRadioButtonComponent (name =" Paco", selectedName = selectedName){ selectedName = it }
        MyRadioButtonComponent (name =" Juan", selectedName = selectedName){ selectedName = it }
        MyRadioButtonComponent (name =" Antonio", selectedName = selectedName){ selectedName = it }
    }
    
}