package com.naveen.androidjetpacklayouts.customRow

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.naveen.androidjetpacklayouts.model.Person

@Composable
fun CustomPersonItem(person: Person){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(18.dp)

    ) {
        Text(text = "ID: ".plus(person.id.toString()), color = Color.White)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(text = "Name: ".plus(person.firstName).plus(" ").plus(person.lastName),
                fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "Age: ".plus(person.age.toString()),
                fontSize = 20.sp, fontWeight = FontWeight.Normal)
        }
    }

}


@Preview(showBackground = true)
@Composable
fun CustomPersonItemPreview(){
    CustomPersonItem(Person("Naveen","Kumar",20,1))
}

