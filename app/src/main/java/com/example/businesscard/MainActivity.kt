package com.example.businesscard

import android.graphics.ColorFilter
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D5)
                ) {
                    Business()
                }
            }
        }
    }
}

@Composable
fun Business() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image, contentDescription = null, modifier = Modifier
                .height(86.dp)
                .width(100.dp)
                .background(Color.Black)
                .padding(5.dp)
        )
        Text(
            text = stringResource(R.string.my_name),
            fontSize = 38.sp,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(15.dp)
        )
        Text(
            text = stringResource(R.string.my_title),
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(bottom = 200.dp))
//        Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
//        ContactRow(text = stringResource(R.string.my_phone_number), textBlur = 5.dp, icon = Icons.Rounded.Phone)
        ContactRow(text = stringResource(R.string.my_phone_number), icon = Icons.Rounded.Phone)
//        Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
        ContactRow(text = stringResource(R.string.twitter_handle) , icon = Icons.Rounded.Share)
//        Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
        ContactRow(text = stringResource(R.string.my_email), icon = Icons.Rounded.Email)
//        Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
    }

}

@Composable
//fun ContactRow(text: String, icon: ImageVector, textBlur: Dp = 0.dp) {
fun ContactRow(text: String, icon: ImageVector) {
    Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(6.dp)) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF054B0E),
            modifier = Modifier.weight(0.5f)
        )
        Text(text = text, color = Color.Black, modifier = Modifier
            .weight(1f)
//            .blur(textBlur)
                )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = Color(0xFFD2E8D5)
    ) {
    BusinessCardTheme {
        Business()
    }
    }
}