package com.weather.retrofitsample.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.weather.retrofitsample.Dust
import com.weather.retrofitsample.retrofit.NetWorkClient.dustNetWork
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

/**
 * RetrofitSample
 * Class: DustViewModel
 * Created by pyg10.
 * Created On 2021-05-01.
 * Description:
 */
class DustViewModel: ViewModel(){

    private val _dustData = MutableLiveData<Dust>()
    val dustData: LiveData<Dust>
        get() = _dustData

    fun communicateNetWork(param: HashMap<String, String>) = viewModelScope.launch(Dispatchers.IO){

        val responseData = dustNetWork.getDust(param)

        withContext(Dispatchers.Main) {
            _dustData.value = responseData
        }

    }

}