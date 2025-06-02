package com.github.VertretungsplanCorp.KotlinCompat.vpkotlincompat

import io.ktor.client.*
import io.ktor.client.engine.okhttp.*
import io.ktor.client.plugins.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Server(url: String) {
  val client: HttpClient = HttpClient(OkHttp) { defaultRequest { url(url) } }
  suspend fun getPing() = client.get("/getping").toString()
}
