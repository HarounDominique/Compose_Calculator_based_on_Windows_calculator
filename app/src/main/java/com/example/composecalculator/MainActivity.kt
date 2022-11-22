package com.example.composecalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.composecalculator.ui.theme.*
import com.example.composecalculatorpackage.CalculatorSmallButton

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeCalculatorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CalculatorInterface()
                }
            }
        }
    }
}

@Composable
fun CalculatorInterface(
    spacing: Dp = 4.dp
) {
    Box() {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(Color.Black),
            verticalArrangement = Arrangement.spacedBy(spacing)
        ) {

            Text(
                //modifier = Modifier.weight(2f),
                color = Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                text = "0"
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing)
            ) {
                CalculatorSmallButton(
                    symbol = "MC", modifier = Modifier
                        .background(DarkGray)
                        .weight(1f)
                ) {

                }
                CalculatorSmallButton(
                    symbol = "MR", modifier = Modifier
                        .background(DarkGray)
                        .weight(1f)
                ) {

                }
                CalculatorSmallButton(
                    symbol = "M+", modifier = Modifier
                        .background(DarkGray)
                        .weight(1f)
                ) {

                }
                CalculatorSmallButton(
                    symbol = "M-", modifier = Modifier
                        .background(DarkGray)
                        .weight(1f)
                ) {

                }
                CalculatorSmallButton(
                    symbol = "MS", modifier = Modifier
                        .background(DarkGray)
                        .weight(1f)
                ) {

                }
                CalculatorSmallButton(
                    symbol = "Mv", modifier = Modifier
                        .background(DarkGray)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing)
            ) {
                CalculatorButton(
                    symbol = "%", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "CE", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "C", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "␡", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing)
            ) {
                CalculatorButton(
                    symbol = "1/x", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "x²", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "√x", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "÷", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing)
            ) {
                CalculatorButton(
                    symbol = "7", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "8", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "9", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "×", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing)
            ) {
                CalculatorButton(
                    symbol = "4", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "5", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "6", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "–", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing)
            ) {
                CalculatorButton(
                    symbol = "1", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "2", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "3", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "+", modifier = Modifier
                        .background(Gray)
                        .weight(1f)
                ) {

                }
            }
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(spacing)
            ) {
                CalculatorButton(
                    symbol = "±", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "0", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = ",", modifier = Modifier
                        .background(LightGray)
                        .weight(1f)
                ) {

                }
                CalculatorButton(
                    symbol = "=", modifier = Modifier
                        .background(LightBlue)
                        .weight(1f)

                ) {

                }
            }
        }
    }
}