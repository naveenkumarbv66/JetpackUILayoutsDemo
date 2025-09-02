package com.naveen.androidjetpacklayouts.repository

import com.naveen.androidjetpacklayouts.model.Person

class PersonRepository {

    fun getPersons(): List<Person>{
        return listOf(
            Person("Naveen","KumarNaveem", 20,21),
            Person("Navee","KumarNavee",30,22),
            Person("Nave","KumarNave",40,23),
            Person("Nav","KumarNav",50, 24),
            Person("Na","KumarNa",60,25),
            Person("N","KumarN",70,26),
            Person("Kumar","NaveenKumar",80,27),
            Person("Kuma","NaveenKuma",75,28),
            Person("Kum","NaveenKum",65,29),
            Person("Ku","NaveenKu",55,30,),
            Person("K","NaveenKu",45,31),
            Person("Naveen Kumar","NaveenK",35,32),
        )
    }
}