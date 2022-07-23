package bi.group.nsi_app.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import bi.group.nsi_app.model.User
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

        val u = ArrayList<User>();

        u.add(user1)
        u.add(user2)

        viewModelScope.launch {
            users.postValue(u)
        }
        return users
    }

    fun fillDB()  = viewModelScope.launch {
        //repo.fillDB()
    }

}