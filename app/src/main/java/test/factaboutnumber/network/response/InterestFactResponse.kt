package test.factaboutnumber.network.response

data class InterestFactResponse(
    val text: String,
    val number: Int,
    val found: Boolean,
    val type: String
)