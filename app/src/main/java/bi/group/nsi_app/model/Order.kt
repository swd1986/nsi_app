package bi.group.nsi_app.model

import com.squareup.moshi.Json

data class Order(
    val order_id: String,
    val creation_date: String,
    val user_1c: String,
    val db_name: String,
    val order_name: String,
    val type: String,
    val status_value: String,
    val status_type: String,
    val responce_value: String
    //@Json(name = "img_src") val imgSrcUrl: String
)