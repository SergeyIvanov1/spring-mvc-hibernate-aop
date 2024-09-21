package ru.intensive.spring.mvc_hibernate_aop.exception_handling;

public class NoSuchStudentException extends RuntimeException{

    public NoSuchStudentException(String message) {
        super(message);
    }
}
