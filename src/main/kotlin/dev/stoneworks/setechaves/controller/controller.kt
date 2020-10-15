package dev.stoneworks.setechaves.controller

import dev.stoneworks.setechaves.model.Segredo
import dev.stoneworks.setechaves.repository.SegredoRepository
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@Api(value="Sete Chaves - API")
@RestController
@RequestMapping("/api/segredos")
class SegredoController {

    @Autowired
    lateinit var segredoRepository: SegredoRepository

    @ApiOperation(value="Retorna lista de segredos.")
    @GetMapping
    fun lista(): List<Segredo> {
        return segredoRepository.findAll().toList()
    }

    @ApiOperation(value="Insere novo segredo.")
    @PostMapping
    fun add(@RequestBody segredo: Segredo): Segredo{
        return segredoRepository.save(segredo)
    }

    @ApiOperation(value="Exclui segredo por Id.")
    @DeleteMapping("{id}")
    fun delete(@PathVariable id: Long) {
        if (segredoRepository.existsById(id)) {
            segredoRepository.deleteById(id)
        }
    }
}