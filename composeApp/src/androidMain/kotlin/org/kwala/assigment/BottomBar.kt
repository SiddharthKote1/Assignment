package org.kwala.assigment

import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BottomBar() {

    var selectedIndex by remember { mutableStateOf(0) }

    val icons = listOf(
        R.drawable.inventorybg,
        R.drawable.cartbg,
        R.drawable.homebg,
        R.drawable.rankingbg,
        R.drawable.lauchbg
    )

    val barGradient = Brush.horizontalGradient(
        colors = listOf(
            Color(0xFF4A1410),
            Color(0xFF050A18),
            Color.Black
        )
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(barGradient)
    ) {

        NavigationBar(
            containerColor = Color.Transparent,
            tonalElevation = 8.dp
        ) {

            icons.forEachIndexed { index, icon ->

                NavigationBarItem(
                    selected = selectedIndex == index,
                    onClick = { selectedIndex = index },

                    interactionSource = remember { MutableInteractionSource() },

                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = Color(0xFFFFC107),
                        unselectedIconColor = Color(0xFF8FA3BF),
                        indicatorColor = Color.Transparent
                    ),

                    icon = {
                        Icon(
                            painter = painterResource(icon),
                            contentDescription = null,
                            tint = Color.Unspecified
                        )
                    }
                )
            }
        }
    }
}