package bi.group.nsi_app.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class main_model : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Это тестовый фрагмент для изучения"
    }
    val text: LiveData<String> = _text
}