package oop.model

sealed class StringResult {
    // Success -> public string props
    data class Success(val name: String, val message: String): StringResult()

    // Error  -> public throwable props
    class Error(val error: Throwable): StringResult()
}
