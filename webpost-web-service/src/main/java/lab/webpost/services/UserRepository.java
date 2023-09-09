package lab.webpost.services;

import org.springframework.data.jpa.repository.JpaRepository;
import lab.webpost.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    User findByUsername(String username);
}
