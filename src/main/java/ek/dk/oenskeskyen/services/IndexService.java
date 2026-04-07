package ek.dk.oenskeskyen.services;

import ek.dk.oenskeskyen.models.User;
import ek.dk.oenskeskyen.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IndexService {
    private final UserRepository repo;

    public IndexService(UserRepository repo) {
        this.repo = repo;
    }

    public List<User> getAllUsers() {
        return repo.findAll();
    }
}
