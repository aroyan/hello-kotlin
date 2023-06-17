package oop.model

class SearchController {
    private var query: String = ""

    init {
        MAX_RESULTS
    }

    // Similar to static keyword in Java
    companion object {

        private const val MAX_RESULTS = 30
        fun create(initialQuery: String): SearchController {
            val controller = SearchController()
            controller.query = initialQuery
            return controller
        }
    }
}