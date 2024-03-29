package com.clinton.composecalculator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import java.text.DateFormatSymbols

@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    OnClick: () -> Unit
) {
    Box (
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { OnClick() }
            .then(modifier)

            ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = Color.White,

        )

    }
    
}