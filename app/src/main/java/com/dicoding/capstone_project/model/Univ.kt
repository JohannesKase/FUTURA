package com.dicoding.capstone_project.model

import android.os.Parcel
import android.os.Parcelable

data class Univ(
    var nameUni: String?,
    var namaJurusan: String?
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nameUni)
        parcel.writeString(namaJurusan)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Univ> {
        override fun createFromParcel(parcel: Parcel): Univ {
            return Univ(parcel)
        }

        override fun newArray(size: Int): Array<Univ?> {
            return arrayOfNulls(size)
        }
    }
}