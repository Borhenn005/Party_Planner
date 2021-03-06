package com.example.partyplanner.model

class User()
{
    internal var id : String ?= null
    internal var name: String? = null
    internal var email: String? = null
    internal var password: String? = null
    internal var age : Int? = null
    internal var phone : String? = null


    // Getter id
    fun getId(): String? {
        return id
    }
    // Setter id
    fun setId(newId: String?) {
        id = newId
    }
    // Getter name
    fun getName(): String? {
        return name
    }
    // Setter name
    fun setName(newName: String?) {
        name = newName
    }

    // Getter email
    fun getEmail(): String? {
        return email
    }
    // Setter email
    fun setEmail(newEmail: String?) {
        email = newEmail
    }

    // Getter password
    fun getPassword(): String? {
        return password
    }
    // Setter password
    fun setPassword(newPassword: String?) {
        password = newPassword
    }

    // Getter age
    fun getAge(): Int? {
        return age
    }
    // Setter age
    fun setAge(newAge: Int?) {
        age = newAge
    }

    // Getter phone
    fun getPhone(): String? {
        return phone
    }
    // Setter phone
    fun setPhone(newPhoneNumber: String?) {
        phone = newPhoneNumber
    }


}


