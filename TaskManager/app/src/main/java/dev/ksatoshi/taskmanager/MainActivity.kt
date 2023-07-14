package dev.ksatoshi.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.ksatoshi.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingTaskCompleteWithImage(
                        head = stringResource(id = R.string.complete_text1),
                        text = stringResource(id = R.string.complete_text2) 
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingTaskCompleteWithText(head: String,text:String,modifier: Modifier = Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text=head,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text=text,
            fontSize = 16.sp
        )
    }
}

@Composable
fun GreetingTaskCompleteWithImage(head:String,text:String,modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.ic_task_completed)

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = image, contentDescription = null)
        GreetingTaskCompleteWithText(head = head, text = text)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingTaskCompletePreview(){
    TaskManagerTheme() {
        GreetingTaskCompleteWithImage(
            head = stringResource(id = R.string.complete_text1),
            text = stringResource(id = R.string.complete_text2)
        )
    }
}