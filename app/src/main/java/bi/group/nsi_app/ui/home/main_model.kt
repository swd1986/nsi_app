package bi.group.nsi_app.ui.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.marsphotos.network.MarsApi
import kotlinx.coroutines.launch

class main_model : ViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        value = "Это тестовый фрагмент для изучения"
//    }
//    val text: LiveData<String> = _text

    // The internal MutableLiveData that stores the status of the most recent request
    private val _status = MutableLiveData<String>()

    // The external immutable LiveData for the request status
    val status: LiveData<String> = _status

    init {
        getMarsPhotos()
    }

    private fun getMarsPhotos() {
        Log.d("swd", "getMarsPhotos");
        viewModelScope.launch {
            try {
                val listResult = MarsApi.retrofitService.getPhotos()
                _status.value = "Success: ${listResult.size} order retrieved"
                Log.d("swd", _status.value.toString());
            } catch (e: Exception) {
                _status.value = "Failure: ${e.message}"
                Log.d("swd", _status.value.toString());
            }
        }
    }


}