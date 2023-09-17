package com.kottur.LeaveService.exception;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LeaveNotFoundException extends RuntimeException {

    private final String message;
}
