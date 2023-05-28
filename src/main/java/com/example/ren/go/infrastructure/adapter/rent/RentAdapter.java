package com.example.ren.go.infrastructure.adapter.rent;
import com.example.ren.go.domain.entites.car.StatesCarEnum;
import com.example.ren.go.domain.entites.rent.Rent;
import com.example.ren.go.domain.service.rent.RentService;
import com.example.ren.go.exceptions.ThisCarIsRent;
import com.example.ren.go.infrastructure.dto.car.CarDTO;
import com.example.ren.go.infrastructure.dto.rent.RentDTO;
import com.example.ren.go.infrastructure.mapper.rent.RentMapper;
import com.example.ren.go.infrastructure.repository.car.CarRepository;
import com.example.ren.go.infrastructure.repository.rent.RentRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

@Service
@AllArgsConstructor
@Slf4j
public class RentAdapter implements RentService {

    private final RentRepository rentRepository;
    private final CarRepository carRepository;
    private final RentMapper rentMapper;


    @Override
    public  void rent(Rent rent) throws ThisCarIsRent {
        Optional<CarDTO> carDTOOptional = carRepository.findById(rent.getIdCar());
        CarDTO carDTO = carDTOOptional.get();
        if (carDTO.getStatesCar().equals(StatesCarEnum.RENTED)){
            throw new ThisCarIsRent("Rent");
        }else {
            carDTO.setStatesCar(StatesCarEnum.RENTED);
            carRepository.save(carDTO);
            long days = ChronoUnit.DAYS.between(rent.getDepartureDate(), rent.getEntryDate());
            rent.setPrice(carDTO.getBasePrice()*days );
            log.info(days+"");
            rentRepository.save(rentMapper.toDto(rent));
        }



        





    }

    @Override
    public void closeRent(Long id) {
        Optional<RentDTO> rentDTOOptional = rentRepository.findById(id);
        RentDTO rentDTO = rentDTOOptional.get();
        rentDTO.setRentClosed(true);
        Optional<CarDTO> carDTOOptional = carRepository.findById(rentDTO.getIdCar());

        CarDTO carDTO = carDTOOptional.get();
        carDTO.setStatesCar(StatesCarEnum.NOT_RENTED);

        carRepository.save(carDTO);


        rentRepository.save(rentDTO);

    }
}
