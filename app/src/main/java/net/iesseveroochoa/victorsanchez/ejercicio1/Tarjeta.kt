package net.iesseveroochoa.victorsanchez.ejercicio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.iesseveroochoa.victorsanchez.ejercicio1.ui.theme.Ejercicio1Theme


class Tarjeta : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color(0xFF073042)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .height(120.dp)
                .width(150.dp)
        )
        Text(
            text = stringResource(R.string.name),
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.title),
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3ddc84)
        )
        ContactInformation(
            icon = Icons.Filled.Phone,
            text = "+11 (123) 444 555 666",
            modifier = Modifier.padding(top = 16.dp)
        )
        ContactInformation(
            icon = Icons.Filled.Share,
            text = "@VictorSanchez"
        )
        ContactInformation(
            icon = Icons.Filled.Email,
            text = "victor@google.com"
        )
    }
}

@Composable
fun ContactInformation(icon: ImageVector, text: String, modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 64.dp),
        verticalAlignment = Alignment.Bottom
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF3ddc84),
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = text,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Ejercicio1Theme() {
        BusinessCard()
    }
}