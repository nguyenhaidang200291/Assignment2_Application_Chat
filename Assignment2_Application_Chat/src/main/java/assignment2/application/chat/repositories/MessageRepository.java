package assignment2.application.chat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import assignment2.application.chat.entities.Message;


public interface MessageRepository extends JpaRepository<Message, Integer>{

}
