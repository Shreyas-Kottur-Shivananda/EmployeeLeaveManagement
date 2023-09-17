package com.kottur.LeaveService.resource;

import com.kottur.LeaveService.model.Leaves;
import com.kottur.LeaveService.repository.LeavesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LeaveController {

    private final LeavesRepository leavesRepository;

    @PostMapping("/leave")
    public Leaves saveLeave(@RequestBody Leaves leave){
        return leavesRepository.addLeave(leave);
    }

    @GetMapping("/leave/{id}")
    public Leaves findLeaveById(@PathVariable("id") Long id){
        return leavesRepository.findLeaveById(id);
    }

    @GetMapping("/leaves")
    public List<Leaves> findAllLeaves(){
        return leavesRepository.findAllLeaves();
    }

    @GetMapping("/leaves/{id}")
    public List<Leaves> findAllLeavesByEmployee(@PathVariable("id") Long id){
        return leavesRepository.findLeavesByEmployee(id);
    }
}
