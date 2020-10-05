package pl.arcadeit.forex.exception.stock;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExchangeCodeException extends RuntimeException {
    public ExchangeCodeException(String message) {
        super(message);
    }
}