package com.map.demo.service;
import java.util.List; // Added import statement
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.map.demo.model.User;
import com.map.demo.repository.UserRepo;

@Service
public class UserService {
    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
        this.userRepo = userRepo;
    }
    
    public User postUser(User user) {
        return userRepo.save(user);
    }
    
    public List<User> getAll() {
        return userRepo.findAll();
    }
    
    public User getUserById(int id) {
        return userRepo.findById(id).orElse(null);
    }
    
    public Page<User> getAllWithPagination(Pageable pageable) {
        return userRepo.findAll(pageable);
    }
}
