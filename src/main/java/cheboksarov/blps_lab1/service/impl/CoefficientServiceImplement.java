package cheboksarov.blps_lab1.service.impl;

import cheboksarov.blps_lab1.exceptions.CoefficientNotFoundException;
import cheboksarov.blps_lab1.model.Coefficient;
import cheboksarov.blps_lab1.repository.CoefficientRepository;
import cheboksarov.blps_lab1.service.CoefficientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CoefficientServiceImplement implements CoefficientService {
    private CoefficientRepository coefficientRepository;
    @Override
    public Coefficient findById(Long coeff_id) throws CoefficientNotFoundException {
        Optional<Coefficient> coeffOp = coefficientRepository.findById(coeff_id);
        if (coeffOp.isPresent()){
            return coeffOp.get();
        }
        throw new CoefficientNotFoundException(String.format("No Coefficient with this coeff_id: %d", coeff_id));
    }

    @Override
    public Coefficient saveCoefficient(Coefficient coefficient) {
        return coefficientRepository.save(coefficient);
    }
}
