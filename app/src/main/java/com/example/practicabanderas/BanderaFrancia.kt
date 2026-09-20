package com.example.practicabanderas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun BanderaFrancia(modifier : Modifier = Modifier){
    Row(modifier = modifier.fillMaxSize()){
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFF0055A4))
        )

        Box(
            modifier = Modifier.weight(1f)
                .fillMaxHeight()
                .background(Color.White)
        )

        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFFEF4135))

        )
    }

}

@Preview(showBackground = true)
@Composable
fun BanderaFranciaPreview() {
    Surface {
        BanderaFrancia(modifier = Modifier.fillMaxSize())
    }
}