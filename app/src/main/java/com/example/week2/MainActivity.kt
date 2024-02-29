package com.example.week2

import android.inputmethodservice.Keyboard
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.week2.ui.theme.Week2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Week2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LayoutsPractice()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//Task 1
@Composable
fun ButtonFun() {
    var color by remember {
        mutableStateOf(Color.Red)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                color = if (color == Color.Red)
                    Color.Blue
                else
                    Color.Red
            },
            colors = ButtonDefaults.buttonColors(containerColor = color) ,
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Click me")
        }
    }
}


//Task 2
@Composable
fun LayoutsPractice() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription = "null",
            modifier = Modifier
                .size(100.dp)
                .clip(RoundedCornerShape(20.dp))
        )
        Column(
            modifier = Modifier.padding(10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Hammadullah",
                modifier = Modifier.padding(10.dp),
                style = TextStyle(fontSize = 24.sp)
            )
            Text(
                text = "0311-3493754",
                modifier = Modifier.padding(10.dp),
                style = TextStyle(fontSize = 24.sp)
            )
        }
    }
}

//Task 3
@Composable
fun ColumnLayout(){
    Column(modifier = Modifier.fillMaxSize().background(Color.LightGray)) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp).background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(100.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hammadullah",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
                Text(
                    text = "0311-3493754",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White)
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(100.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hammadullah",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
                Text(
                    text = "0311-3493754",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(100.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hammadullah",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
                Text(
                    text = "0311-3493754",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(100.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hammadullah",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
                Text(
                    text = "0311-3493754",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(100.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hammadullah",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
                Text(
                    text = "0311-3493754",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(100.dp)

            )
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hammadullah",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
                Text(
                    text = "0311-3493754",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .background(Color.White)
            ,
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "null",
                modifier = Modifier
                    .size(100.dp)
            )
            Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Hammadullah",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
                Text(
                    text = "0311-3493754",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontSize = 24.sp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Week2Theme {
//        ButtonFun()
//        LayoutsPractice()
        ColumnLayout()
    }
}