package com.example.Restourant.Service;

import com.example.Restourant.DTO.ReservationDto;
import com.example.Restourant.Model.Reservation;
import com.example.Restourant.Model.Restourant;
import com.example.Restourant.Model.User;
import com.example.Restourant.Repository.ReservationRepository;
import com.example.Restourant.Repository.RestourantRepository;
import com.example.Restourant.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.example.Restourant.Model.AppUserRole.USER;

@Service
public class ReservationService {

    ReservationRepository reservationRepository;
    RestourantRepository restourantRepository;
    UserRepository userRepository;

    public ReservationService(ReservationRepository reservationRepository,RestourantRepository restourantRepository
            ,UserRepository userRepository){
        this.reservationRepository = reservationRepository;
        this.restourantRepository= restourantRepository;
        this.userRepository=userRepository;
    }

    public void save(Reservation reservation) {
        reservationRepository.save(reservation);
    }

    public List<Reservation> getReservations() {
        return reservationRepository.findAll();
    }

    public void createReservation(Reservation reservation1){
        //User user= new User(USER,"3","FEFE",null,false);
        //userRepository.save(user);
        //Restourant restourant=new Restourant("efefe","21312","343",null);
        //restourantRepository.save(restourant);
        //Reservation reservation=new Reservation("343",restourant,user);
        reservationRepository.save(reservation1);
    }

    public void deleteReservation(Long id){
        reservationRepository.deleteById(id);
    }

    public Optional<Reservation> getReservationById(Long id){
        return reservationRepository.findById(id);
    }
}

