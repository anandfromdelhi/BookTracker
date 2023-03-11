package com.example.areader.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ReaderHomeScreen(navController: NavController) {
    Scaffold(
        topBar = {},
        floatingActionButton = {
            FABContent {

            }
        }

    ) { paddingValues ->
        paddingValues
        Surface(modifier = Modifier.fillMaxSize()) {
        }
    }
}

@Composable
fun ReaderAppBar(
    title: String,
    showProfile: Boolean = true,
    navController: NavController
) {
    TopAppBar(
        title = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (showProfile) {
                    Image(
                        painter = painterResource(id = com.example.areader.R.drawable.ic_launcher_foreground),
                        contentDescription = null
                    )
                }
            }
        },
        actions = {},
        backgroundColor = Color.Transparent
    )

}

@Composable
fun FABContent(onTap: () -> Unit) {
    FloatingActionButton(
        onClick = { onTap }, shape = RoundedCornerShape(50.dp),
        backgroundColor = Color(0xFF92CBDF)
    ) {
        Icon(
            imageVector = Icons.Default.Add, contentDescription = "Add a book",
            tint = MaterialTheme.colors.onSecondary
        )
    }


}
