package med.voll.api.pacientes;

import med.voll.api.medicos.Medico;

public record DadosListagemPacientes(String nome, String email, String cpf) {

    public DadosListagemPacientes(Paciente paciente) {
        this(paciente.getNome(), paciente.getEmail(), paciente.getCpf());
    }
}
