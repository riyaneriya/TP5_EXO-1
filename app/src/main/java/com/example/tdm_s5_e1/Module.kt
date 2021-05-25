package com.example.td4_exo4

import java.io.Serializable

class Module( _intutile:String, _dureeTotale:String,_enseignant:Enseignant):Serializable {
    val intutile=_intutile
    val duree=_dureeTotale
    val ens=_enseignant
}