package cheboksarov.blps_lab1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Statistics {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long stat_id;
    private Integer score;
    private Integer yCards;
    private Integer rCards;
    private Integer penalties;
    private Integer shotsOnTarget;
    private Integer cornerKicks;
}
