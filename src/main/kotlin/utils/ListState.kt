package utils


sealed class ListStatus {
    data class Success(val data: Boolean) : ListStatus()
    sealed class Error : ListStatus() {
        data class InvalidList(val meesage: String) : Error()
        data class EmptyList(val meesage: String) : Error()
    }

}
