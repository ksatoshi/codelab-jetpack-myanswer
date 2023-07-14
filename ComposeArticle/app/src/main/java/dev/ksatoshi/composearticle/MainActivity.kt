package dev.ksatoshi.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.ksatoshi.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticleTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArticleWithImage(
                        header = stringResource(id = R.string.article_header),
                        text1 = stringResource(id = R.string.article_text_1),
                        text2 = stringResource(id = R.string.article_text_2)
                    )
                }
            }
        }
    }
}

@Composable
fun ArticleWithHeader(header :String,text1 :String,text2 :String, modifier :Modifier = Modifier){
    Column(modifier = modifier) {
        Text(
            text = header,
            fontSize = 24.sp,
            modifier = Modifier.padding(all = 16.dp)
        )
        Text(
            text = text1,
            modifier = Modifier.padding(start = 16.dp,end=16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = text2,
            modifier = Modifier.padding(all=16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Composable
fun ArticleWithImage(header :String,text1 :String,text2 :String, modifier :Modifier = Modifier){
    val image = painterResource(id = R.drawable.bg_compose_background)

    Column(modifier = Modifier) {
        Image(painter = image, contentDescription = null)
        ArticleWithHeader(header = header, text1 = text1, text2 = text2)
    }
}

@Preview(showBackground = true)
@Composable
fun TextAreaPreview(){
    ArticleWithImage(
        header = stringResource(id = R.string.article_header),
        text1 = stringResource(id = R.string.article_text_1),
        text2 = stringResource(id = R.string.article_text_2)
    )
}