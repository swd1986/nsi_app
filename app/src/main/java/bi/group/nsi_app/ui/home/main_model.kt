package bi.group.nsi_app.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bi.group.nsi_app.model.User
import kotlinx.coroutines.launch

class main_model : ViewModel() {

    fun getAllUsers(): MutableLiveData<List<User>> {
        val users = MutableLiveData<List<User>>()
        viewModelScope.launch {
            //users.postValue(repo.getAllUsers())
        }
        return users
    }

    fun fillDB()  = viewModelScope.launch {
        //repo.fillDB()
    }

}