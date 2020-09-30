package com.sergio.learningspring;

import com.sergio.learningspring.data.entity.Guest;
import com.sergio.learningspring.data.entity.Reservation;
import com.sergio.learningspring.data.entity.Room;
import com.sergio.learningspring.data.repository.GuestRepository;
import com.sergio.learningspring.data.repository.ReservationRepository;
import com.sergio.learningspring.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningSpringApplication.class, args);
	}

}
