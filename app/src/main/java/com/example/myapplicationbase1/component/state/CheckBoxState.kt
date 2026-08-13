package com.example.myapplicationbase1.component.state

data class CheckBoxState(
    val id: String,  //contiene el identificador del campo de checkbox
    val label:String, //contiene la descripción de ese campo. Lo que se debe mostrar
    val checked:Boolean = false  //contiene el valor del estado true o false.
)
