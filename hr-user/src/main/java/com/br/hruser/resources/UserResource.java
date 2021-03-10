package com.br.hruser.resources;

import com.br.hruser.entities.User;
import com.br.hruser.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) throws InterruptedException {
        User user = repository.findById(id).get();
        return ResponseEntity.ok(user);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findById(@RequestParam String email) throws InterruptedException {
        User user = repository.findByEmail(email);
        return ResponseEntity.ok(user);
    }
}
