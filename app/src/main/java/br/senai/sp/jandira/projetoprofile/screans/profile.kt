package br.senai.sp.jandira.projetoprofile.screans

import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowColumnScopeInstance.align

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.projetoprofile.R

@Composable

fun TelaProfile(){


Box(
    modifier = Modifier
        .fillMaxSize()
){

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(320.dp)
            .clip(RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp))
    ){
        Image(
            painter = painterResource(R.drawable.background),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
        )
        Column (
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 48.dp, start = 20.dp, end = 20.dp, bottom = 15.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.seta),
                    contentDescription = "",
                    modifier = Modifier
                        .size(20.dp)
                )
                Text(
                    text = "Details",
                    color = Color.White,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 135.dp)
                )

            }
            Card (
                shape = CircleShape,
                modifier = Modifier
                    .size(80.dp)
            ) {  }
            Text(
                text = "Jenny Wilson",
                color = Color.White,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(top = 9.dp, bottom = 3.dp)
            )
            Text(
                text = "Sr. UI/UX Designer",
                color = Color.White,
                fontSize = 12.sp,
                modifier = Modifier
                    .padding(top = 5.dp, bottom = 8.dp)
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp)
                    .padding(top = 16.dp, bottom = 16.dp, start = 20.dp, end = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween
                //space around, space evenly,
            ) {
                Card (
                    modifier = Modifier
                        .width(80.dp)
                        .border(1.dp, Color.White, shape = RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)

                ){
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.mail),
                            contentDescription = "",
                            modifier = Modifier
                                .size(23.dp)
                        )
                        Text(
                            text = "Email",
                            color = Color.White,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Card (
                    modifier = Modifier
                        .width(80.dp)
                        .border(1.dp, Color.White, shape = RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)

                ){
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.call),
                            contentDescription = "",
                            modifier = Modifier
                                .size(23.dp)
                        )
                        Text(
                            text = "Call",
                            color = Color.White,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Card (
                    modifier = Modifier
                        .width(80.dp)
                        .border(1.dp, Color.White, shape = RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)

                ){
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.whats),
                            contentDescription = "",
                            modifier = Modifier
                                .size(23.dp)
                        )
                        Text(
                            text = "Whatsapp",
                            color = Color.White,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

                Card (
                    modifier = Modifier
                        .width(80.dp)
                        .border(1.dp, Color.White, shape = RoundedCornerShape(12.dp)),
                    colors = CardDefaults.cardColors(containerColor = Color.Transparent)

                ){
                    Column (
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(R.drawable.star),
                            contentDescription = "",
                            modifier = Modifier
                                .size(23.dp)
                        )
                        Text(
                            text = "Favorite",
                            color = Color.White,
                            fontSize = 11.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                    }
                }

            }
        }

    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(550.dp)
            .align(Alignment.BottomCenter)
    ){

        //primeira caixa

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(15.dp)
        ) {

                Row (
                    modifier = Modifier
                        .padding(top = 20.dp, start = 20.dp),
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(R.drawable.mailpurple),
                        contentDescription = "",
                        modifier = Modifier
                            .size(23.dp)

                    )
                    Text(
                        text = "Email",
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(5.dp)
                    )
                }
                Column (
                    modifier = Modifier
                        .padding(start = 40.dp)
                        .fillMaxWidth()
                ) {
                    Text(
                        text = "Official",
                        color = Color.Gray,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 2.dp)
                    )
                    Text(
                        text = "michael.mitc@example.com",
                        fontSize = 13.sp
                    )
                    Text(
                        text = "Personal",
                        color = Color.Gray,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 2.dp)
                    )
                    Text(
                        text = "michael@example.com",
                        fontSize = 13.sp
                    )
                }
            HorizontalDivider(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 13.dp, bottom = 16.dp),
                color = Color.Gray
            )

            //Segunda caixa

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.callpurple),
                    contentDescription = "",
                    modifier = Modifier
                        .size(23.dp)

                )
                Text(
                    text = "Phone number",
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(5.dp)
                )
            }
            Column (
                modifier = Modifier
                    .padding(start = 40.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Mobile",
                    color = Color.Gray,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .padding(top = 5.dp, bottom = 2.dp)
                )
                Text(
                    text = "(209) 555-0104",
                    fontSize = 13.sp
                )
            }
            HorizontalDivider(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 13.dp, bottom = 16.dp),
                color = Color.Gray
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.teampurple),
                    contentDescription = "",
                    modifier = Modifier
                        .size(23.dp)

                )
                Text(
                    text = "Team",
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(5.dp)
                )
            }
            Column (
                modifier = Modifier
                    .padding(start = 40.dp)
            ) {
                Text(
                    text = "Project Operation Team",
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(top = 7.dp)
                )
            }

            HorizontalDivider(
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 13.dp, bottom = 16.dp),
                color = Color.Gray
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(R.drawable.profilepurple),
                    contentDescription = "",
                    modifier = Modifier
                        .size(23.dp)

                )
                Text(
                    text = "Leads by",
                    color = Color.Black,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .padding(5.dp)
                )
            }
            Column (
                modifier = Modifier
                    .padding(start = 40.dp)
            ) {
                Text(
                    text = "Darrel Steward",
                    fontSize = 13.sp,
                    modifier = Modifier
                        .padding(top = 7.dp)
                )
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 50.dp)
            ){
//                Button(
//                    onClick = {},
//                    modifier = Modifier
//                        .width(20.dp)
//                        .height(10.dp),
//                    shape = RoundedCornerShape(10.dp),
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = Color(0xffFFC23D)
//                    ),
//                    border = BorderStroke(1.2.dp, Color(0xff3347B0))
//                ) { }
                Spacer(modifier = Modifier.width(20.dp))
                Button(
                    onClick = {},
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .width(220.dp)
                        .height(35.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "",
                        tint = Color(0xffCC5DE8),
                        modifier = Modifier
                            .padding(end = 20.dp),

                    )
                    Text(
                        text = "Add to contact",
                        color = Color(0xFFCC5DE8)
                    )

                }

                Spacer(modifier = Modifier.width(26.dp)) // Espaço horizontal entre os botões

                Button(
                    onClick = {},
                    border = BorderStroke(1.dp, Color.Gray),
                    modifier = Modifier
                        .width(70.dp)
                        .height(35.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Icon(
                        imageVector = Icons.Filled.Share,
                        contentDescription = "",
                        tint = Color(0xffCC5DE8),
                        modifier = Modifier

                        )

                }
            }


        }



    }

}


}



@Preview(showSystemUi = true)
@Composable
private fun TelaProfilePreview() {
    TelaProfile()

}