package cheboksarov.blps_lab1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Match {
    @Id
    @GeneratedValue
    private Long match_id;
    private String hosts;
    private String guests;
}
