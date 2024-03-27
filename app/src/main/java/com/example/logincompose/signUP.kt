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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
 fun signin(navController: NavController) {
    var name by remember {
        mutableStateOf("")
    }

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
            painter = painterResource(id = R.drawable.rectangle_19__1_),
            contentDescription = "top img",
            modifier = Modifier.size(200.dp)
        )

        Text(
            text = "Create An account",
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            fontSize = 30.sp
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Hello $name",
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(value = name, onValueChange = {
                                                        name=it
        }, label = {
            Text(text = "Enter your name")
        })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = email , onValueChange = {
                                                          email =it
        }, label = {
            Text(text = "Enter your Email")
        })
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = password, onValueChange = {
                                                            password=it
        }, label = {
            Text(text = "Enter Password")
        })
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            navController.navigate("Log_in")
        }) {
            Text(text = "Sign up")
            
        }
        Spacer(modifier = Modifier.height(32.dp))
        Text(text = "OR SIGN-IN WITH")
        Spacer(modifier = Modifier.height(16.dp))

        Row(modifier = Modifier.fillMaxSize().padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly

        ) {
            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "google",
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )
            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "google",
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )
            Image(
                painter = painterResource(id = R.drawable.twitter),
                contentDescription = "google",
                modifier = Modifier
                    .size(50.dp)
                    .clickable {

                    }
            )

        }



    }


}