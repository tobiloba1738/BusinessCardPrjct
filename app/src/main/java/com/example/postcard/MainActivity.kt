package com.example.postcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.postcard.ui.theme.PostcardTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingImage(
                name = "Your Name",
                email = "yourname@gmail.com"
            )
        }
    }
}

@Composable
fun GreetingText(
    name: String,
    email: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "My Business Card",
            fontSize = 30.sp
        )

        Text(
            text = name,
            fontSize = 25.sp
        )

        Text(
            text = email,
            fontSize = 20.sp
        )

        Text(
            text = "Phone: 555-555-5555",
            fontSize = 20.sp
        )
    }
}

@Composable
fun GreetingImage(
    name: String,
    email: String,
    modifier: Modifier = Modifier
) {
    val image = painterResource(
        R.drawable.ic_launcher_foreground
    )

    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )

            GreetingText(
                name = name,
                email = email
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingImage(
        name = "Tobiloba Banjo",
        email = "banjotobi098@gmail.com"
    )
}
