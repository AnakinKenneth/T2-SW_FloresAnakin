package pe.edu.cibertec.T2_SW_Flores_Anakin.service;

import pe.edu.cibertec.T2_SW_Flores_Anakin.model.bd.Medico;
import pe.edu.cibertec.T2_SW_Flores_Anakin.model.dto.MedicoDto;

import java.util.List;

public interface IMedicoService {
    Medico guardarMedico(Medico ciudad, MedicoDto ciudadDto);
    List<Medico> listarMedico();
    void eliminarMedico(int idmedico);
}
