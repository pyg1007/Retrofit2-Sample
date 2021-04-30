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