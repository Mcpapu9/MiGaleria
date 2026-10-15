package com.example.migaleria

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PantallaPrincipal()
        }
    }
}

@Composable
fun PantallaPrincipal() {

    val imagenes = listOf(
        R.drawable.hielo,
        R.drawable.hielo2,
        R.drawable.hielo3,
        R.drawable.hielo4,
        R.drawable.hielo5
    )

    val nombres = listOf(
        "Nieve",
        "Bloque de Hielo Puro",
        "Iceberg Cristalino",
        "Cubos de hielo",
        "Peluche de Cirno"
    )

    val descripciones = listOf(
        "Nieve del ártico.",
        "Bloque compacto con reflejos celestes y alta densidad.",
        "Bloque translúcido tallado por el viento y el agua.",
        "Cubos de hielo para enfriar tus bebidas.",
        "Fumo de Cirno 20cm, muy suave."
    )

    val precios = listOf(
        "$200 MXN",
        "$850 MXN",
        "$2,400 MXN",
        "$10 MXN",
        "$900 MXN"
    )

    var indice by remember { mutableStateOf(value = 0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(
                        colorResource(R.color.BlancoGlaciar),
                        colorResource(R.color.AzulHieloClaro),
                        colorResource(R.color.AzulProfundo)
                    )
                )
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "Mi Galería",
            color = colorResource(R.color.AzulProfundo),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        Image(
            painter = painterResource(id = imagenes[indice]),
            contentDescription = "Imagen del producto",
            modifier = Modifier
                .fillMaxWidth()
                .height(260.dp)
                .padding(horizontal = 16.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = nombres[indice],
            color = colorResource(R.color.AzulProfundo),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = descripciones[indice],
            color = colorResource(R.color.AzulProfundo),
            fontSize = 16.sp,
            modifier = Modifier.padding(horizontal = 24.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = precios[indice],
            color = colorResource(R.color.CianDestello),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))

        Row(modifier = Modifier.padding()) {
            Button(
                onClick = {
                    if (indice == 0) {
                        indice = imagenes.size - 1
                    } else {
                        indice -= 1
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.AzulArtico),
                    contentColor = colorResource(id = R.color.BlancoGlaciar)
                )
            ) {
                Text("Anterior")
            }

            Spacer(Modifier.width(40.dp))

            Button(
                onClick = {
                    if (indice == imagenes.size - 1) {
                        indice = 0
                    } else {
                        indice += 1
                    }
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = colorResource(id = R.color.AzulArtico),
                    contentColor = colorResource(id = R.color.BlancoGlaciar)
                )
            ) {
                Text("Siguiente")
            }
        }
    }
}

@Preview
@Composable
fun PreviewPantalla(){
    PantallaPrincipal()
}