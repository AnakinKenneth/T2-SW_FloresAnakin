package pe.edu.cibertec.T2_SW_Flores_Anakin.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Medico;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.dto.MedicoDto;
import pe.edu.cibertec.T2_SW_Flores_Anakin.repository.MedicoRepository;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class MedicoService implements IMedicoService {

    private MedicoRepository medicoRepository;
    @Override
    public Medico guardarMedico(Medico Medico, MedicoDto medicoDto) {
        medico.setDescripcion(medicoDto.getNomMedico());
        medico.setDescripcion(medicoDto.getApeMedico());
        medico.setDescripcion(medicoDto.getfechNacMedico());
        Jurisdiccion jurisdiccion = new Jurisdiccion();
        jurisdiccion.setIdjurisdiccion(medicoDto.getIdjurisdiccion());
        medico.setJurisdiccion(jurisdiccion);
        return medicoRepository.save(medico);
    }

    @Override
    public List<Medico> listarMedico() {
        return medicoRepository.findAll();
    }

    @Override
    public void eliminarMedico(int idmedico) {
        medicoRepository.deleteById(idmedico);
    }
}
