package com.example.lazycolandroid.repository

import com.example.lazycolandroid.model.Person

class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                firstName = "Anubhav",
                lastName = "Kumar Rao",
                age = 20
            ),
            Person(
                id = 1,
                firstName = "Adarsh",
                lastName = "Kumar Rao",
                age = 21
            ),
            Person(
                id = 2,
                firstName = "Sachin",
                lastName = "Raghuwanshi",
                age = 22
            ),
            Person(
                id = 3,
                firstName = "Michael",
                lastName = "Brown",
                age = 23
            ),
            Person(
                id = 4,
                firstName = "Robert",
                lastName = "Davis",
                age = 24
            ),
            Person(
                id = 5,
                firstName = "Jenifer",
                lastName = "Miller",
                age = 25
            ),
            Person(
                id = 6,
                firstName = "Sarah",
                lastName = "Lopez",
                age = 26
            ),
            Person(
                id = 7,
                firstName = "Charles",
                lastName = "Wilson",
                age = 27
            ),
            Person(
                id = 8,
                firstName = "Daniel",
                lastName = "Taylor",
                age = 28
            ),
            Person(
                id = 9,
                firstName = "Mark",
                lastName = "Lee",
                age = 29
            ),
        )
    }
}