package lab.webpost.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lab.webpost.domain.User;

@RestController
@RequestMapping("/users") 
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/validate/{username}")
    public ResponseEntity<User> getUserByUsername(@PathVariable String username) {
        
        User user = userRepository.findByUsername(username);

        if (user != null) {
            
            return new ResponseEntity<>(user, HttpStatus.OK);
        } else {
            
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}

