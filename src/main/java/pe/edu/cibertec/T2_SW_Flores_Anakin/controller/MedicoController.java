package pe.edu.cibertec.T2_SW_Flores_Anakin.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Medico;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.dto.MedicoDto;
import pe.edu.cibertec.T2_SW_Flores_Anakin.service.MedicoService;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Controller
@RequestMapping(path = "/api/v1/medico")
public class MedicoController {
    private MedicoService medicoService;
    @GetMapping("")
    public ResponseEntity<List<Medico>> listarMedico(){
        List<Medico> medicoList = new ArrayList<>(medicoService.listarMedico());
        if(medicoList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(medicoList, HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<Medico> registrarMedico(
            @RequestBody MedicoDto medicoDto
    ){
        Medico nuevoMedico = new Medico();
        Medico result = medicoService.guardarMedico(nuevoMedico, medicoDto);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Medico> actualizarMedico(
            @PathVariable Integer id,
            @RequestBody Medico medicoDto
    ){
        Medico nuevoMedico = medicoService.obtenerMedicoxId(id)
                .orElseThrow(() -> new ResourceNotFoundException("el medico con Id" +
                        + id + " no existe"));
        Medico result = medicoService.guardarMedico(nuevoMedico, medicoDto);
        return new ResponseEntity<>(
                result,
                HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMedico(@PathVariable Integer id) {
        Medico medico = medicoService.obtenerMedicoxId(id)
                .orElseThrow(() -> new ResourceNotFoundException("el medico con Id " + id + " no existe"));
        medicoService.eliminarMedico(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}