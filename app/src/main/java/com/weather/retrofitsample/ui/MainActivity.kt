package com.weather.retrofitsample.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.weather.retrofitsample.viewmodel.DustViewModel
import com.weather.retrofitsample.R

class MainActivity : AppCompatActivity() {

    private val dustViewModel by viewModels<DustViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dustViewModel.communicateNetWork(setUpDustParameter())
        observeDustData()
    }

    private fun observeDustData(){
        dustViewModel.dustData.observe(this){
            it?.let {
                Log.e("Parsing Dust ::", it.toString())
            }
        }
    }

    private fun setUpDustParameter(): HashMap<String, String>{

        return hashMapOf(
            "serviceKey" to "DUST_DECODING_SERVICE_KEY", // OPEN API 의 인증키 중 Decoding된 것을 사용
            "returnType" to "json",
            "numOfRows" to "100",
            "pageNo" to "1",
            "sidoName" to "서울",
            "ver" to "1.0"
        )

    }
}