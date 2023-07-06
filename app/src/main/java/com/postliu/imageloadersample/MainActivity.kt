package com.postliu.imageloadersample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.postliu.imageloadersample.ui.theme.ImageLoaderSampleTheme
import com.seiko.imageloader.rememberImagePainter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImageLoaderSampleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LazyColumn(modifier = Modifier.fillMaxSize()) {
                        items(AppData.defaultList) {
                            ListItem(leadingContent = {
                                Image(
                                    painter = rememberImagePainter(url = it.iconUrl),
                                    contentDescription = null
                                )
                            }, headlineContent = {
                                Text(text = it.time)
                            })
                        }
                    }
                }
            }
        }
    }
}