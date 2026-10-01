package com.example.expenseTrackerApp.controller;

import com.example.expenseTrackerApp.model.User;
import com.example.expenseTrackerApp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/expenseTracker")
public class UserController {

    private final UserService userService;

    @PostMapping("/createExpense")
    public ResponseEntity<User> createExpense(User expense){
        return new ResponseEntity<>(userService.createExpense(expense), HttpStatus.CREATED);
    }

    @GetMapping("/getAllExpenses")
    public ResponseEntity<List<User>> getAllExpenses(){
        return ResponseEntity.ok(userService.getAllExpenses());
    }
}
