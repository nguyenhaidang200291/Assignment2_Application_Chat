package assignment2.application.chat.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment2.application.chat.entities.User;

public interface UserRepository extends JpaRepository<User, Long>
{

	Optional<User> findByEmail(String email);

}
