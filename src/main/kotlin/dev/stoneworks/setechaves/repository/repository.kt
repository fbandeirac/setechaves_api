package dev.stoneworks.setechaves.repository

import dev.stoneworks.setechaves.model.Segredo
import org.springframework.data.repository.CrudRepository

interface SegredoRepository : CrudRepository<Segredo, Long>