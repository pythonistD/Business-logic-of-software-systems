package cheboksarov.blps_lab1.service.impl;

import cheboksarov.blps_lab1.model.Match;
import cheboksarov.blps_lab1.repository.MatchRepository;
import cheboksarov.blps_lab1.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class MatchServiceImplement implements MatchService {

    private final MatchRepository matchRepository;

    @Override
    public List<Match> findAllMatch() {
        return matchRepository.findAll();
    }

    @Override
    public Match saveMatch(Match match) {
        return matchRepository.save(match);
    }

    @Override
    public Match findById(Long id) {
        return null;
    }

    @Override
    public Match updateMatch(Long id) {
        return null;
    }

    @Override
    public void deleteMatch(Long id) {

    }

}
