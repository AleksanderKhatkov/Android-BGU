package by.example.adaptorapp.entity

data class Person(
    val firstName: String,
    val lastName: String,
    val photoUrl: String
)


object PersonList{

    fun provideList()= arrayListOf<Person>(
        Person("Alex","Pupkin","https://www.publicdomainpictures.net/pictures/270000/velka/avatar-people-person-business-u.jpg"),
        Person("Vasya","Pupkin","https://cdn.pixabay.com/photo/2013/07/13/10/07/man-156584_1280.png"),
        Person("Petya","Pupkin","https://artfiles.alphacoders.com/723/72348.jpg"),
        Person("Alex","Pupkin","https://www.publicdomainpictures.net/pictures/270000/velka/avatar-people-person-business-u.jpg"),
        Person("Vasya","Pupkin","https://cdn.pixabay.com/photo/2013/07/13/10/07/man-156584_1280.png"),
        Person("Petya","Pupkin","https://artfiles.alphacoders.com/723/72348.jpg"),
        Person("Alex","Pupkin","https://www.publicdomainpictures.net/pictures/270000/velka/avatar-people-person-business-u.jpg"),
        Person("Vasya","Pupkin","https://cdn.pixabay.com/photo/2013/07/13/10/07/man-156584_1280.png"),
        Person("Petya","Pupkin","https://artfiles.alphacoders.com/723/72348.jpg")
    )



}