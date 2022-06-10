package com.dicoding.capstone_project.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Univ(
    var nameUni: String,
    var namaJurusan: String
) : Parcelable