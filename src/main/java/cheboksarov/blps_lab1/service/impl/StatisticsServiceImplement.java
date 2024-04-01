package cheboksarov.blps_lab1.service.impl;

import cheboksarov.blps_lab1.exceptions.StatisticsNotFoundException;
import cheboksarov.blps_lab1.model.Statistics;
import cheboksarov.blps_lab1.repository.StatisticsRepository;
import cheboksarov.blps_lab1.service.StatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class StatisticsServiceImplement implements StatisticsService {
    private StatisticsRepository statisticsRepository;
    @Override
    public Statistics findById(Long stat_id) throws  StatisticsNotFoundException{
        Optional<Statistics> statOp = statisticsRepository.findById(stat_id);
        if (statOp.isPresent()){
            return statOp.get();
        }
        throw new StatisticsNotFoundException(String.format("No Statistic with this stat_id: %d", stat_id));
    }

    @Override
    public Statistics save(Statistics statistics) {
        return statisticsRepository.save(statistics);
    }
}
