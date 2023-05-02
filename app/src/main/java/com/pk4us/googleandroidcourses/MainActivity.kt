package com.pk4us.googleandroidcourses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.pk4us.googleandroidcourses.jetpackcomposeforandroiddevelopers.composeessentials.Home
import com.pk4us.googleandroidcourses.ui.theme.MyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                MyApp(modifier = Modifier.fillMaxSize())

//                MySootheApp()

//                WellnessScreen()

                    Home()
                }
            }
        }
    }
}