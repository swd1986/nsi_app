package bi.group.nsi_app.model

import com.squareup.moshi.Json

data class Order(
    val order_id: String,
    val creation_date: String
    //@Json(name = "img_src") val imgSrcUrl: String
)