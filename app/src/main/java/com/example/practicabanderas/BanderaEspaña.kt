package com.example.practicabanderas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.transformable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BanderaEspaña(modifier : Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize()) {
        Box(
             Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFFAA151B))
        )

        Box (
            Modifier
                .weight(2f)
                .fillMaxWidth()
                .background(Color(0xFFF1BF00)),
            contentAlignment = Alignment.CenterStart){
            Image(
                painter = painterResource(id = R.drawable.escudo_espana),
                contentDescription = "Escudo nacional ES",
                modifier = Modifier
                    .padding(start = 32.dp)
                    .size(120.dp)
            )
        }

        Box (
            Modifier
                .weight(1f)
                .fillMaxWidth()
                .background(Color(0xFFAA151B))
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BanderaEspañaPreview(){
    Surface {
        BanderaEspaña(modifier = Modifier.fillMaxSize())
    }
}