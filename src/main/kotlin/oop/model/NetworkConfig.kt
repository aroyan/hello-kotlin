package oop.model
// Network config object [Singleton?]
object NetworkConfig: NetworkInfoProvider {
    const val baseUrl = "https://example.com"
    const val userAgent = "Postman-Client"
    override fun getNetworkDetails(): String {
        return "$baseUrl $userAgent"
    }
}