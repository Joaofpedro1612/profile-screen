package com.example.myapplication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material.icons.filled.Whatshot
import androidx.compose.material.icons.outlined.StarBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Box(

                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)

            ) {
                Image(
                    painterResource(id = R.drawable.backgroundcard),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .matchParentSize()

                )
                Column(
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier
                    .fillMaxSize()

                ) {

                    Row (
                        modifier = Modifier
                            .fillMaxWidth()

                    ){
                        Button(
                            onClick = {},



                        ) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = ""
                            )
                        }
                        Text(
                            text = "",

                        )
                    }

                    Column {

                        Text(
                            text = ""
                        )
                        Text(
                            text = ""
                        )
                    }

                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 10.dp, vertical = 10.dp)
                    ){
                        Button(
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            onClick = {},
                            modifier = Modifier
                                .width(85.dp)
                                .height(55.dp)

                        ) {
                            Column(
                                horizontalAlignment = (Alignment.CenterHorizontally)
                            ) {

                                    Icon(
                                        imageVector = Icons.Default.Email,
                                        contentDescription = ""
                                    )
                                Text(
                                    text = "Email"
                                )


                            }
                        }
                        Button(
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            onClick = {},
                            modifier = Modifier
                                .width(85.dp)
                                .height(55.dp)

                        ) {
                            Column(
                                horizontalAlignment = (Alignment.CenterHorizontally)) {
                                    Icon(
                                        imageVector = Icons.Default.Phone,
                                        contentDescription = ""
                                    )
                                Text(
                                    text = "Email"
                                )

                            }
                        }
                        Button(
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            onClick = {},
                            modifier = Modifier
                                .width(85.dp)
                                .height(55.dp)

                        ) {
                            Column (
                                    horizontalAlignment = (Alignment.CenterHorizontally)
                            ){
                                Icon(
                                    imageVector = Icons.Filled.Whatsapp,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Email"
                                )

                            }
                        }
                        Button(
                            shape = androidx.compose.foundation.shape.RoundedCornerShape(6.dp),
                            onClick = {},
                            modifier = Modifier
                                .width(85.dp)
                                .height(55.dp)

                        ) {
                            Column(
                                horizontalAlignment = (Alignment.CenterHorizontally)) {
                                Icon(
                                    imageVector = Icons.Outlined.StarBorder,
                                    contentDescription = ""
                                )
                                Text(
                                    text = "Email"
                                )

                            }
                        }
                    }
                }
            }
        }

        Column {}
        Column {}
        Column {}
        Column {
            Row { }
        }
    }

}


@Composable
@Preview
private fun ProfileScreenPreview() {
    ProfileScreen()
}