package com.example.primerapp

import android.app.Person
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.primerapp.ui.theme.PrimerAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PersonalData(name = "Fabrizzio")
        }
    }

    @Composable
    private fun PersonalData(name: String){
        MaterialTheme{
            Column(modifier = Modifier.padding(16.dp)){
                Image(
                    painter = painterResource(id = R.drawable.imagenfoto),
                    contentDescription = "Mi foto",
                    modifier = Modifier.height(180.dp)
                )
                Text(text="Mi nombre es: $name", style = MaterialTheme.typography.titleLarge)
                Text(text="Curso: Móviles")
                Text(text="e-mail: fabrizziocastro2612@gmail.com")
            }
        }

    }

    @Preview
    @Composable
    private fun PreviewPersonalData(){
        PersonalData(name = "Fabrizzio Castro")
    }

}

