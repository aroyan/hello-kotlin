package async

import okhttp3.OkHttpClient
import okhttp3.Request

fun main() {

val client = OkHttpClient()

val request = Request.Builder()
    .url("https://restcountries.com/v3.1/name/deutschland")
    .get()
    .build()

    try {
        val response = client.newCall(request).execute()
        println(response.body?.string())
    } catch (error: Throwable) {
        println(error.message)
    }

}
