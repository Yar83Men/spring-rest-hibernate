package rest.exception_handling;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeGlobalExeptionHandler {

    // Обработчик запросов id работника
    @ExceptionHandler
    public ResponseEntity<EmployeeExeption> handlerExeption(NoSuchEmployeeExeption exeption) {
        EmployeeExeption data = new EmployeeExeption();
        data.setInfo(exeption.getMessage());

        return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
    }

    // Обработчик всех ошибок
    @ExceptionHandler
    public ResponseEntity<EmployeeExeption> handlerExeption(Exception exeption) {
        EmployeeExeption data = new EmployeeExeption();
        data.setInfo(exeption.getMessage());

        return new ResponseEntity<>(data, HttpStatus.BAD_REQUEST);
    }
}

