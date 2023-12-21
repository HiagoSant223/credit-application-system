package dio.credit.application.system.model

data class Custumer(
        var fistName: String = "",
        var lastName: String = "",
        val cpf: String,
        var email: String = "",
        var password: String = "",
        var address: dio.credit.application.system.model.Address = Address(),
        var credits: List<Credit> = mutableListOf(),
        val id: Long? = null
)
