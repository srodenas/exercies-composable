package com.example.myapplicationbase1.component.scaffold

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myapplicationbase1.R
import com.example.myapplicationbase1.component.model.NavItem

//Barra de navegación
@Composable
fun MyNavigateBar(modifier: Modifier = Modifier) {
    NavigationBar {
        //Necesitamos cada uno de los Item de tipo NavigationBarItem
        NavigationBarItem(
            selected = true,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.outline_accessibility_new_24),
                    contentDescription = ""
                )
            },
            label = { Text("Op1") },
            alwaysShowLabel = false, //para que no muestre el texto siempre
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color.Red, //para que el icono sea rojo
                selectedTextColor = Color.White, //para que el texto sea rojo
                indicatorColor = Color.Red, //para que el color del icono sea rojo
                unselectedIconColor = Color.Blue, //para que el icono sea azul
                unselectedTextColor = Color.Blue, //para que el texto sea azul
                disabledIconColor = Color.Gray, //para que el icono sea gris
                disabledTextColor = Color.Gray //para que el texto sea gris
            )
        )
        //-->
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.outline_accessibility_new_24),
                    contentDescription = ""
                )
            },
            label = { Text("Op1") }
        )
        //-->
        NavigationBarItem(
            selected = false,
            onClick = { },
            icon = {
                Icon(
                    painter = painterResource(R.drawable.outline_accessibility_new_24),
                    contentDescription = ""
                )
            },
            label = { Text("Op1") }
        )
        //-->

    }
}

    @Composable
    fun MyGoodNavigateBar(modifier: Modifier = Modifier) {
        var selectedItem:Int by remember { mutableStateOf(1) }
        val listBarItem : List<NavItem> = listOf (
            NavItem("Home", Icons.Default.Home),
            NavItem("Add", Icons.Default.Add),
            NavItem("Build", Icons.Default.Build)
        )
        NavigationBar(
            containerColor = Color.Red,
            tonalElevation = 10.dp //elevación funciona si le ponemos un color de elevación diferente
        ) {
            listBarItem.forEachIndexed { index, navItem ->
                MyNavigationItemComponent(item = navItem, isSelected = selectedItem == index){
                  selectedItem = index
                }
            }
        }
    }



/*
Internamente, un NAvigationBarItem se debe ejecutar dentro de un RowScope.
Si nos damos cuenta, todo content del NavigationBar, debe ser una función de
extensión de RowScope. Por tanto, se debe incluir dentro de ese contexto.
NavigationBar, internamente tiene un Row y el contenido de ese Row, se debe ejecutar dentro
de un RowScope.
 */
@Composable
fun RowScope.MyNavigationItemComponent(item : NavItem, isSelected : Boolean, onItemClick: ()->Unit) {

    NavigationBarItem(
        selected = isSelected,
        onClick = { onItemClick()},
        icon = {
            Icon(imageVector = item.icon, contentDescription = "")
        },
        label = {
            Text(item.name)
                },
        alwaysShowLabel = false, //para que no muestre el texto siempre
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = Color.Red, //para que el icono sea rojo
            selectedTextColor = Color.Red, //para que el texto sea rojo
            indicatorColor = Color.White, //para que el color del icono sea rojo
            unselectedIconColor = Color.White, //para que el icono sea azul
            unselectedTextColor = Color.Blue, //para que el texto sea azul
            disabledIconColor = Color.Gray, //para que el icono sea gris
            disabledTextColor = Color.Gray //para que el texto sea gris
        )
    )
}

