package org.d3if0121.mobpro2.model
import com.squareup.moshi.Json

data class Harian(
    val key: Long,
    @Json(name = "jumlah_positif") val jumlahPositif : Value
)
