package com.switchfully.teamteam.parkshark.service.parking_spots;

import com.switchfully.teamteam.parkshark.domain.ParkingSpot;
import com.switchfully.teamteam.parkshark.domain.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ParkingSpotService {

    private ParkingSpotRepository parkingSpotRepository;

    @Autowired
    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public ParkingSpot createParkingSpot(ParkingSpot parkingSpotToCreate) {
        return parkingSpotRepository.save(parkingSpotToCreate);
    }

    public ParkingSpot findParkingSpotById(String id) {
        if (parkingSpotRepository.findById(id).isPresent()) {
            return parkingSpotRepository.findById(id).get();
        }
        return null;
    }

    public ParkingSpot stopParking(ParkingSpot parkingSpot) {
        parkingSpot.setStopSession(LocalDateTime.now());
        return parkingSpot;
    }

    public List<ParkingSpot> findAllParkingSpots() {
        return parkingSpotRepository.findAll();
    }
}
