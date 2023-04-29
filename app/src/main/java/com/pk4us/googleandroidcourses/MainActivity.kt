package com.pk4us.googleandroidcourses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.pk4us.googleandroidcourses.jetpackcomposeforandroiddevelopers.composeessentials.MyApp
import com.pk4us.googleandroidcourses.ui.theme.MyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}