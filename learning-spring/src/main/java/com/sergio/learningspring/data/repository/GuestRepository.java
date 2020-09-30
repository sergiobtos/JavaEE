package com.sergio.learningspring.data.repository;

import com.sergio.learningspring.data.entity.Guest;
import com.sergio.learningspring.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
