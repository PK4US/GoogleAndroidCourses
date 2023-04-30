package com.pk4us.googleandroidcourses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.pk4us.googleandroidcourses.jetpackcomposeforandroiddevelopers.composeessentials.MySootheApp
import com.pk4us.googleandroidcourses.jetpackcomposeforandroiddevelopers.composeessentials.WellnessScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background
            ) {
//                MyApp(modifier = Modifier.fillMaxSize())

//                MySootheApp()

                WellnessScreen()
            }
        }
    }
}