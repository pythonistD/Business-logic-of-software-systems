package cheboksarov.blps_lab1.controller.exceptionAdvice;

import cheboksarov.blps_lab1.exceptions.CoefficientNotFoundException;
import cheboksarov.blps_lab1.exceptions.MatchNotFoundException;
import cheboksarov.blps_lab1.exceptions.StatisticsNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MatchNotFoundException.class)
    public ResponseEntity handleMatchNotFoundException(MatchNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage() , HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(StatisticsNotFoundException.class)
    public ResponseEntity handleStatisticsNotFoundException(StatisticsNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(CoefficientNotFoundException.class)
    public ResponseEntity handleCoefficientNotFoundException(CoefficientNotFoundException ex){
        return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
    }
}
