package com.kottur.EmployeeService.leaveClient;

import com.kottur.EmployeeService.model.Leaves;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import java.util.List;

@HttpExchange
public interface LeaveClient {
    @GetExchange("/leaves/{id}")
    public List<Leaves> findAllLeavesByEmployee(@PathVariable("id") Long id);
}
