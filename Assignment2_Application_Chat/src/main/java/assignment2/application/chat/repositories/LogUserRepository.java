package assignment2.application.chat.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import assignment2.application.chat.entities.LogUser;

public interface LogUserRepository extends JpaRepository<LogUser, String>
{

}
