package bi.group.nsi_app.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bi.group.nsi_app.model.Order
import bi.group.nsi_app.model.User
import com.example.android.marsphotos.network.MarsApi
import kotlinx.coroutines.launch

class main_model : ViewModel() {

    fun getAllUsers(): MutableLiveData<List<Order>> {
        val users = MutableLiveData<List<Order>>()

            viewModelScope.launch {
            try {
                users.postValue(MarsApi.retrofitService.getPhotos())
                Log.e("swd","Success!")
            } catch (e: Exception) {
                Log.e("swd", "Failure: ${e.message}")
            }

        }
        return users
    }

    fun fillDB()  = viewModelScope.launch {
        //repo.fillDB()
    }

}