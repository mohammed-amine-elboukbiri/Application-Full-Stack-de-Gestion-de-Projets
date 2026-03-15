package ma.fst.projet_full_stack_2.dto.reporting;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DashboardDto {
    private long totalProjets;
    private long totalPhases;
    private long totalEmployes;
    private long totalOrganismes;
    private long phasesTerminees;
    private long phasesNonFacturees;
    private long phasesFactureesNonPayees;
    private long phasesPayees;
}