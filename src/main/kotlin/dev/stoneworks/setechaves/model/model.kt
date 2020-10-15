package dev.stoneworks.setechaves.model

import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Segredo(@Id
        @GeneratedValue
        val id: Long = 0L,
        val conteudo: String = "",
        val data: LocalDate = LocalDate.now())