package cheboksarov.blps_lab1.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Coefficient{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long coeff_id;
    private Float hosts_wins;
    private Float guests_wins;
    private Float total_one;
    private Float total_two;
    private Float total_three;

}
