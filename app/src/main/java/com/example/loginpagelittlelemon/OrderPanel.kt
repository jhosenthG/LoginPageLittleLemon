package com.example.loginpagelittlelemon

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable

fun OrderPanelTop()   {

    Column (
        modifier =
        Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF495E57)),

        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top)
    {

            Text(text = stringResource(
                id = R.string.Little_Lemon),

                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier.padding(top = 30.dp , start = 20.dp))


            Spacer(modifier = Modifier.height(5.dp))

            Text(
                text = stringResource(id = R.string.City),
                fontSize = 20.sp,
                modifier = Modifier.padding(top = 2.dp , start = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp , start = 20.dp)){

            Text(
                text = stringResource(id = R.string.Description),
                fontSize = 15.sp,
                modifier = Modifier.weight(8f))

            Image(
                painter = painterResource(id = R.drawable.upperpanelimage), contentDescription = "Upper Panel Image",
                modifier = Modifier
                    .padding(end = 20.dp)
                    .size(150.dp)
                    .clip(RoundedCornerShape(15.dp)))


        }

        FilledTonalButton(
            onClick = { /*TODO*/ },
            modifier = Modifier
                .size(200.dp, 65.dp)
                .padding(top = 5.dp, start = 20.dp, bottom = 20.dp))
        {
            Text(text = "Order Take Away", fontWeight = FontWeight.SemiBold, fontSize = 15.sp)
        }

            Column(
                Modifier
                    .fillMaxSize()
                    .background(Color.White)) {
                Text(text = "prueba")

            }
    }


}

