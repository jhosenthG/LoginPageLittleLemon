package com.example.loginpagelittlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable

fun UpperPanelLittleLemon() {
    Column (
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(color = Color(0xFF495E57))
            .fillMaxSize())
    {
        Text(
            text = stringResource(id = R.string.Little_Lemon),
            fontSize = 30.sp, fontWeight = FontWeight.SemiBold, color = Color(0xFFF4CE14),
            modifier = Modifier.padding(start = 16.dp, top = 16.dp))

        Text(
            text = stringResource(id = R.string.City),
            fontSize = 24.sp,
            color = Color(0xFFFFFFFF),
            modifier = Modifier.padding(start = 16.dp, top = 10.dp)
        )
        Row {
            Button(
                onClick = {},
                shape = RoundedCornerShape(10.dp)) {
                
            }
        }
    }
}
