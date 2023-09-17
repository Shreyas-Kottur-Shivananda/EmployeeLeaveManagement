package com.kottur.LeaveService.model;

public record Leaves(Long id, Long employeeId, String type, String startDate, String endDate) {

}
