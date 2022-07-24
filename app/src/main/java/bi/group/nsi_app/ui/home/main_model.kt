package bi.group.nsi_app.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bi.group.nsi_app.model.User
import com.example.android.marsphotos.network.MarsApi
import kotlinx.coroutines.launch

class main_model : ViewModel() {

    fun getAllUsers(): MutableLiveData<List<User>> {
        val users = MutableLiveData<List<User>>()

        val user1 = User(
            fName = "fName",
            lName = "lName",
            id = 0,
            score = 1
        )

        val user2 = User(
            fName = "fName2",
            lName = "lName2",
            id = 1,
            score = 2
        )

        val user3 = User(
            fName = "fName3",
            lName = "lName3",
            id = 2,
            score = 3
        )

        val u = ArrayList<User>();

        u.add(user1)
        u.add(user2)
        u.add(user3)

        viewModelScope.launch {
            try {
                val listResult = MarsApi.retrofitService.getPhotos()
                Log.e("swd","Success: ${listResult.size} Mars photos retrieved")
            } catch (e: Exception) {
                Log.e("swd", "Failure: ${e.message}")
            }

            users.postValue(u)
        }
        return users
    }

    fun fillDB()  = viewModelScope.launch {
        //repo.fillDB()
    }

}