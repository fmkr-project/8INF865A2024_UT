package com.example.a8inf865

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a8inf865.ui.theme._8INF865Theme as ExampleTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingWithBg(
                        text = stringResource(R.string.splash_screen),
                        second = "Example",
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun GreetingWithBg(text: String, second: String, modifier: Modifier)
{
    val bg = painterResource(R.drawable.androidparty)
    Box(
        modifier
    ) {
        Image(
            painter = bg,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.8f)
        Greeting2(
            text = text,
            second = second,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Composable
fun Greeting2(text: String, second: String, modifier: Modifier = Modifier)
{
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = text,
            fontSize = 100.sp,
            lineHeight = 100.sp,
            textAlign = TextAlign.Center,
            color = Color.Yellow,
            modifier = Modifier
                .background(color = Color.Red))
        Text(
            text = stringResource(R.string.tu_tournes, second),
            fontSize = 35.sp,
            color = Color.White,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End))
    }
}

@Preview(showBackground = true)
@Composable
fun BCPreview()
{
    ExampleTheme {
        Greeting2(text = "Lorem ipsum dolor sit amet", second = "Example")
    }
}