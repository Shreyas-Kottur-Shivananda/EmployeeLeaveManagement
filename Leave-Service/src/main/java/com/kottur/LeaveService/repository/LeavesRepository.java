package com.kottur.LeaveService.repository;

import com.kottur.LeaveService.exception.LeaveNotFoundException;
import com.kottur.LeaveService.model.Leaves;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class LeavesRepository {

    private List<Leaves> leaves = new ArrayList<>();

    public Leaves addLeave(Leaves leave){
        leaves.add(leave);
        return leave;
    }

    public Leaves findLeaveById(Long id){
        return leaves.stream().filter(leave->leave.id().equals(id)).findFirst().orElseThrow(()->new LeaveNotFoundException("leave not found with id"+id));
    }

    public List<Leaves> findAllLeaves(){
        return leaves;
    }

    public List<Leaves> findLeavesByEmployee(Long id){
        return leaves.stream().filter(leave->leave.employeeId().equals(id)).toList();
    }
}
