package com.example.logincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun login(navController: NavController) {

    var email by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Image(
            painter = painterResource(id = R.drawable.rectangle_19),
            contentDescription = "Login image",
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Welcome back",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold


        )
        Text(text = "login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Email address")
        })

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Passwaord")
        })
        Spacer(modifier = Modifier.height(16.dp))


        Button(onClick = {

        }) {
            Text(text = "Log In")

        }
        Spacer(modifier = Modifier.height(32.dp))



        Text(
            text = "Forget password",
            modifier = Modifier.clickable {

            }
        )
        Spacer(modifier = Modifier.height(42.dp))


        Text(
            text = "WANT TO CREATE AN ACCOUNT",

            modifier = Modifier.clickable {
                navController.navigate("sign_up")

            }
        )
        Spacer(modifier = Modifier.height(16.dp))


//        Row(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(40.dp),
//            horizontalArrangement = Arrangement.SpaceEvenly
//
//        ) {
//            Image(
//                painter = painterResource(id = R.drawable.google),
//                contentDescription = "google",
//                modifier = Modifier
//                    .size(50.dp)
//                    .clickable {
//
//                    }
//            )
//            Image(
//                painter = painterResource(id = R.drawable.facebook),
//                contentDescription = "google",
//                modifier = Modifier
//                    .size(50.dp)
//                    .clickable {
//
//                    }
//            )
//            Image(
//                painter = painterResource(id = R.drawable.twitter),
//                contentDescription = "google",
//                modifier = Modifier
//                    .size(50.dp)
//                    .clickable {
//
//                    }
//            )
//
//
//        }



    }

}

