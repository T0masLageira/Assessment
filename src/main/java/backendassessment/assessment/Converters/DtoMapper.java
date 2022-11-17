package backendassessment.assessment.Converters;

public interface DtoMapper <Tmodel, Tdto> {

    public Tdto ModelToDto(Tmodel model);
    public Tmodel DtoToModel(Tdto dto);
}

