package com.example.practicabanderas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BanderaMexico(modifier : Modifier = Modifier){
    Row(modifier = modifier.fillMaxSize()){
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFF006341))
        )

        Box(modifier = Modifier
            .weight(1f)
            .fillMaxHeight().
            background(Color.White),
            contentAlignment = Alignment.Center) {
            Image(
                painter = painterResource(id = R.drawable.escudo_mexico),
                contentDescription = "Escudo nacional",
                modifier = Modifier.size(60.dp)
            )
        }

        Box(
            modifier = Modifier.weight(1f)
                .fillMaxHeight()
                .background(Color(0xFFCE1126))
        )

    }
}

@Preview(showBackground = true)
@Composable
fun BanderaMexicoPreview(){
    Surface {
        BanderaMexico(modifier = Modifier.fillMaxSize())
    }
}
