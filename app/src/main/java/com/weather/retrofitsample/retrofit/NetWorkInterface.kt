package com.weather.retrofitsample.retrofit

import com.weather.retrofitsample.Dust
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * RetrofitSample
 * Class: NetWorkInterface
 * Created by pyg10.
 * Created On 2021-05-01.
 * Description:
 */
interface NetWorkInterface {

    @GET("getCtprvnRltmMesureDnsty") //시도별 실시간 측정정보 조회 주소
    suspend fun getDust(@QueryMap param: HashMap<String, String>): Dust

}