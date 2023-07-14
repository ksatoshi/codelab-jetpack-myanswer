package dev.ksatoshi.composequadrant

import android.media.audiofx.AudioEffect.Descriptor
import android.os.Bundle
import android.support.v4.app.INotificationSideChannel.Default
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.ksatoshi.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                    ) {
                        Row(
                            modifier = Modifier.weight(1F),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ){
                            DescriptionWithText(
                                header = stringResource(id = R.string.text_compose_head),
                                text = stringResource(id = R.string.text_compose),
                                modifier = Modifier.weight(1F),
                                background = Color.Green
                            )
                            DescriptionWithText(
                                header = stringResource(id = R.string.image_compose_head),
                                text = stringResource(id = R.string.image_compose),
                                background = Color.Yellow,
                                modifier = Modifier.weight(1F)
                            )
                        }
                        Row(
                            modifier = Modifier.weight(1F),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center
                        ){
                            DescriptionWithText(
                                header = stringResource(id = R.string.row_compose_head),
                                text = stringResource(id = R.string.row_compose),
                                background = Color.Cyan,
                                modifier = Modifier.weight(1F)
                            )
                            DescriptionWithText(
                                header = stringResource(id = R.string.column_compose_head),
                                text = stringResource(id = R.string.column_compose),
                                background = Color.LightGray,
                                modifier = Modifier.weight(1F)
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun DescriptionWithText(header:String,text:String,background: Color,modifier: Modifier = Modifier){
    Column (
        modifier = modifier.background(color = background).padding(all = 16.dp).fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,

    ){
        Text(
            text = header,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DescriptionWithTextPreview(){
    DescriptionWithText(
        header = stringResource(id = R.string.text_compose_head),
        text = stringResource(id = R.string.text_compose),
        background = Color.Green
    )
}

@Preview(showBackground = true)
@Composable
fun DescriptionPreview(){
    Column(
    ) {
        Row(
            modifier = Modifier.weight(1F),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            DescriptionWithText(
                header = stringResource(id = R.string.text_compose_head),
                text = stringResource(id = R.string.text_compose),
                modifier = Modifier.weight(1F),
                background = Color.Green
            )
            DescriptionWithText(
                header = stringResource(id = R.string.image_compose_head),
                text = stringResource(id = R.string.image_compose),
                background = Color.Yellow,
                modifier = Modifier.weight(1F)
            )
        }
        Row(
            modifier = Modifier.weight(1F),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ){
            DescriptionWithText(
                header = stringResource(id = R.string.row_compose_head),
                text = stringResource(id = R.string.row_compose),
                background = Color.Cyan,
                modifier = Modifier.weight(1F)
            )
            DescriptionWithText(
                header = stringResource(id = R.string.column_compose_head),
                text = stringResource(id = R.string.column_compose),
                background = Color.LightGray,
                modifier = Modifier.weight(1F)
            )
        }
    }
}