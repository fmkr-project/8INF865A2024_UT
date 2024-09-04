package com.example.a8inf865

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
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
                ) {}
            }
        }
    }
}

@Composable
fun Greeting2(text: String, modifier: Modifier = Modifier)
{
    Text(text = text)
}

@Preview(showBackground = true)
@Composable
fun BCPreview()
{
    ExampleTheme {
        Greeting2(text = "Lorem ipsum dolor sit amet")
    }
}