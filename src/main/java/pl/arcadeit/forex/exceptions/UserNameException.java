package pl.arcadeit.forex.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UserNameException extends RuntimeException {
    public UserNameException(String message) {
        super(message);
    }
}
