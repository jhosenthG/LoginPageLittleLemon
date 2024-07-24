package com.example.loginpagelittlelemon

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen()   {
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Image(painter = painterResource
            (id = R.drawable.littlelemon),
            contentDescription ="Login Image", modifier = Modifier.size(280.dp) )

        Text(text = "Welcome Back", fontSize = 28.sp, fontWeight = FontWeight.Bold)
        
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Email address")
        })
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Password")
        })
        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {}) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(32.dp))

        TextButton(onClick = {}) {
            Text(text = "Forgot Password")
        }
    }

}