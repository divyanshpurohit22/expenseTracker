package com.example.expenseTrackerApp.service;

import com.example.expenseTrackerApp.model.User;
import com.example.expenseTrackerApp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public User createExpense(User expense){
        return userRepository.save(expense);
    }

    public List<User> getAllExpenses(){
        return userRepository.findAll();
    }
}
