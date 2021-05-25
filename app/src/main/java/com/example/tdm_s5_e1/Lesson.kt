package com.example.td4_exo4

import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

data class Lesson(var _module:Module, var _date: Date) {
    var module=_module
    var dateL=_date
    fun timeInterval():String{
        val formatter = DateTimeFormatter.ofPattern("MM-dd HH:mm")
        val formatted = dateL.toString()
        return formatted+""
    }
}
object DataProvider{
    val data:List<Lesson>
        get() {
            val dataList =ArrayList<Lesson>()
            val lesson1:Lesson= Lesson(Module("BDA","2", Enseignant("Amrouche","Karima")),Date(2021,2,22,9,0))
            val lesson2:Lesson= Lesson(Module("ANAD","2", Enseignant("Imloul","Karima")),Date(2021,2,23,11,0))
            val lesson3:Lesson= Lesson(Module("TDM","2", Enseignant("Batata","Sofiane")),Date(2021,2,24,9,0))
            dataList.add(lesson1)
            dataList.add(lesson2)
            dataList.add(lesson3)
            return dataList
        }
}