package com.joel.interviewdemo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joel.interviewdemo1.ui.theme.InterviewDemo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InterviewDemo1Theme {
                // A surface container using the 'background' color from the theme
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .fillMaxSize()
                ){
                    AndroidLarge()
                }
            }
        }
    }
}

@Composable
fun AndroidLarge(){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(15.dp)
    ) {
        Text(
            text = "Upcoming Trips",
            modifier = Modifier
                .testTag("upcoming_trips")
                .padding(30.dp),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 22.sp
        )
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
        ) {
            ScreenCard(cardValue = "Dates & Dinners")
            ScreenCard(cardValue = "Beaches & Sand")
        }
    }

}

@Composable
fun ScreenCard(
    cardValue : String,
){


    Card(
        shape = RoundedCornerShape(15.dp),
        colors = CardDefaults.elevatedCardColors(
            containerColor = Color.Blue
        ),
        modifier = Modifier
            .height(200.dp)
            .testTag("screen_card")
    ) {
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .height(220.dp)
        ){
            Text(
                text = cardValue,
                modifier = Modifier
                    .padding(15.dp),
                color = Color.White,
                fontSize = 18.sp
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AndroidLargePreview() {
    InterviewDemo1Theme {
        AndroidLarge()
    }
}