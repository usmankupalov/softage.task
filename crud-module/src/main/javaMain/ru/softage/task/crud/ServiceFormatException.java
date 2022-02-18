package ru.softage.task.crud;

import ru.softage.task.api.Code;

import static ru.softage.task.api.Code.FORMAT_ERROR;


public class ServiceFormatException extends ServiceException {
    public ServiceFormatException(String description) {
       super(FORMAT_ERROR, description);
    }

    public ServiceFormatException( String description, Throwable cause) {
        super(FORMAT_ERROR, description, cause);
    }



}
