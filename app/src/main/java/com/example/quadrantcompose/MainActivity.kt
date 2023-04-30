package com.example.quadrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.defaultDecayAnimationSpec
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrantcompose.ui.theme.QuadrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

// CONTENU DE MON ECRAN :
@Composable
fun MyContent() {
    MyFourQuadrant(
        title1 = "Text composable",
        corps1 = "Displays text and follows Material Design guidelines.",
        color1 = Color.Green,

        title2 = "Row composable",
        corps2 = "A layout composable that places its children in a horizontal sequence.",
        color2 = Color.Cyan,

        title3 = "Image composable",
        corps3 = "Creates a composable that lays out and draws a given Painter class object.",
        color3 = Color.Yellow,

        title4 = "Column composable",
        corps4 = "A layout composable that places its children in a vertical sequence.",
        color4 = Color.LightGray,
    )
}

// STRUCTURE D'UN ECRAN 4 QUADRANT :
@Composable
fun MyFourQuadrant(
    title1: String, corps1: String, color1: Color,
    title2: String, corps2: String, color2: Color,
    title3: String, corps3: String, color3: Color,
    title4: String, corps4: String, color4: Color,
    modifier: Modifier = Modifier
){
    Column(modifier = Modifier.fillMaxWidth()){
        Row(
            modifier = Modifier
                .weight(1f),
            //verticalArrangement = Arrangement.,
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MyQuadrant(
                title = title1,
                corps = corps1,
                color = color1,
                modifier = Modifier.weight(1f)
            )
            MyQuadrant(
                title = title2,
                corps = corps2,
                color = color2,
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            modifier = Modifier
                .weight(1f),
            //verticalArrangement = Arrangement.,
            //horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MyQuadrant(
                title = title3,
                corps = corps3,
                color = color3,
                modifier = Modifier.weight(1f)
            )
            MyQuadrant(
                title = title4,
                corps = corps4,
                color = color4,
                modifier = Modifier.weight(1f)
            )
        }
    }
}


// STRUCTURE D'UN QUADRANT :
@Composable
private fun MyQuadrant(
    title: String,
    corps: String,
    color: Color,
    modifier: Modifier = Modifier)
{
    Column (
        modifier = Modifier
            .background(color)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
        )
        Text(
            text = corps,
            //fontSize = default ???
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    QuadrantComposeTheme {
        MyFourQuadrant(
            title1 = "Text composable",
            corps1 = "Displays text and follows Material Design guidelines.",
            color1 = Color.Green,

            title2 = "Row composable",
            corps2 = "A layout composable that places its children in a horizontal sequence.",
            color2 = Color.Cyan,

            title3 = "Image composable",
            corps3 = "Creates a composable that lays out and draws a given Painter class object.",
            color3 = Color.Yellow,

            title4 = "Column composable",
            corps4 = "A layout composable that places its children in a vertical sequence.",
            color4 = Color.LightGray,
        )
    }
}