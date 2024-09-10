package com.example.a8inf865

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                    Greeting2(
                        text = "Never gonna give you up",
                        second = "Example",
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
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
            textAlign = TextAlign.Center)
        Text(
            text = "$second Tu tournes",
            fontSize = 35.sp,
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