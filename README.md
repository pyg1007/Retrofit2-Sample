# Retrofit2-Sample

## Retrofit

- Retrofit is a networking library used to implement a type-safe REST client for Android.

## USE

Build.Gradle(Module: AppName)

```xml
dependencies {

    def retrofit_version = '2.9.0'
    implementation "com.squareup.retrofit2:retrofit:$retrofit_version"
    implementation "com.squareup.retrofit2:converter-gson:$retrofit_version"

    // network logging
    implementation 'com.squareup.okhttp3:okhttp:4.2.1'
    implementation 'com.squareup.okhttp3:logging-interceptor:4.2.1'
}
```

Coroutine inside ViewModel & Activity-ktx
```xml
dependencies {
    def arch_lifecycle_version = '2.3.1'
    implementation "androidx.lifecycle:lifecycle-viewmodel-ktx:$arch_lifecycle_version"

    def activity_version = "1.2.2"
    implementation "androidx.activity:activity-ktx:$activity_version"
}
```

## GSON

JSON 파일을 Mapping시켜주는 라이브러리

매핑시켜주기위해서 POJO클래스를 사용.

단, JSON의 Key값과 POJO클래스의 변수명은 동일해야함. 다르게 사용하고싶을 때 @SerializedName("name")을 이용

## Sample

이 샘플 프로젝트는 공공데이터 포털에서 제공하는 한국 환경공단_에어코리아_대기오염정보의 시도별 실시간 측정 정보 조회를 사용하여 화면에 표시하는 것이 아니라 로그로 결과를 볼 수있다.   

MVVM패턴으로 구성되어있으며 repository패턴은 사용하지 않고 있다.   

현재는 실행할 때마다 API에서 정보를 가져오지만, 실제로 사용할 때에는 Room이나 SQLite를 이용하여 내장디비에 저장하고, 디비에있는 값을 불러오는 것이 좋다.   

이 경우, repository패턴을 이용하고, repository에서는 API에서 값을 가져올지, 디비에있는 값을 사용할지에 대한 결정을 하면된다.(조건은 개발자 마음대로 설정한다.)   

문서를 읽어보면 numOfRows가 샘플에서는 100으로 설정되어있지만 더 늘릴수도 더 줄일수도 있다.   

[블로그 정리 링크](https://ryan94.tistory.com/31)