package cheboksarov.blps_lab1.controller;

import cheboksarov.blps_lab1.model.Match;
import cheboksarov.blps_lab1.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/match")
@AllArgsConstructor
public class MatchController {
    private final MatchService matchService;

    @GetMapping
    public List<Match> findAllMatch(){
        return matchService.findAllMatch();
    }

    @PostMapping("save_match")
    public Match saveMatch(@RequestBody Match match){
        return matchService.saveMatch(match);
    }

}
