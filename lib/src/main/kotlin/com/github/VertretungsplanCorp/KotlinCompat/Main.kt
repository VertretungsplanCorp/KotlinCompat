package com.github.VertretungsplanCorp.KotlinCompat.vpkotlincompat

import io.ktor.client.HttpClient
import io.ktor.client.engine.okhttp.OkHttp
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.request.get

// This is the Server class that handles all the requests.
// The parameter url sets the url of the api.
class Server(url: String) {
  val client: HttpClient = HttpClient(OkHttp) { defaultRequest { url(url) } }

  suspend fun getPing() = client.get("/ping").toString()
}
