package com.example.composecalculatorpackage

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CalculatorSmallButton(
    symbol: String,
    modifier: Modifier,
    onClic: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clickable { onClic() }
            .then(modifier)
    ){
        Text(
            text= symbol,
            fontSize = 25.sp,
            color = Color.White
        )
    }
}

