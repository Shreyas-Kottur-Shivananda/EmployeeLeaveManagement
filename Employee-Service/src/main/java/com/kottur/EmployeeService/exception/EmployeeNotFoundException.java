package com.kottur.EmployeeService.exception;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class EmployeeNotFoundException extends RuntimeException{

    private final String message;
}
