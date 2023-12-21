package dio.credit.application.system.model

import dio.credit.application.system.model.enummeration.Status
import java.math.BigDecimal
import java.time.LocalDate
import java.util.UUID

data class Credit (
        val creditCode: UUID = UUID.randomUUID(),
        val creditValue: BigDecimal = BigDecimal.ZERO,
        val dayFistInstallment: LocalDate,
        val numberOfInstallment: Int = 0,
        val status: Status = Status.IN_PROGRESS,
        val customer: Custumer? = null,
        val id: Long? = null
)
