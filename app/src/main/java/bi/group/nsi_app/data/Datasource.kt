package bi.group.nsi_app.data

import android.util.Log
import bi.group.nsi_app.R
import bi.group.nsi_app.model.Affirmation
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import java.io.Console

class Datasource {
    private val BASE_URL = "https://android-kotlin-fun-mars-server.appspot.com"

    fun test(){
        Log.d("swd", "Retrofit init");
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

    }

    fun loadAffirmations(): List<Affirmation> {

        test();

        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2),
            Affirmation(R.string.affirmation3),
            Affirmation(R.string.affirmation4),
            Affirmation(R.string.affirmation5),
            Affirmation(R.string.affirmation6),
            Affirmation(R.string.affirmation7),
            Affirmation(R.string.affirmation8),
            Affirmation(R.string.affirmation9),
            Affirmation(R.string.affirmation10)
        )
    }
}