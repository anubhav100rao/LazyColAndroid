package com.example.lazycolandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazycolandroid.model.Person
import com.example.lazycolandroid.repository.PersonRepository
import com.example.lazycolandroid.ui.theme.LazyColAndroidTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColAndroidTheme {
                // A surface container using the 'background' color from the theme
                val repository = PersonRepository()
                val getAllData = repository.getAllData()

                val sections = listOf("A", "B", "C", "D", "E", "F")
                LazyColumn(
                    contentPadding = PaddingValues(12.dp),
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    sections.forEach { section: String ->
                        stickyHeader { 
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.Blue)
                                    .padding(12.dp),
                                text = "Section $section",
                                textAlign = TextAlign.Center,
                                color = Color.White
                            )
                        }
                        items(10) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.Cyan)
                                    .padding(12.dp),
                                text = "Item $it from Section $section",
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                    items(items = getAllData) { person: Person ->
                        CustomItem(person = person)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LazyColAndroidTheme {
        Greeting("Android")
    }
}