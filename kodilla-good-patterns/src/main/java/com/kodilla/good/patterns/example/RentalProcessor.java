package com.kodilla.good.patterns.example;

import java.time.LocalDateTime;

public class RentalProcessor {

    private InformationService informationService;
    private RentalService rentalService;
    private RentalRepository rentalRepository;

    public RentalProcessor(final InformationService informationService,
                           final RentalService rentalService,
                           final RentalRepository rentalRepository) {
        this.informationService = informationService;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public RentalDto process(final RentRequest rentRequest) {
        boolean isRented = rentalService.rent(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
        if(isRented) {
            informationService.inform(rentRequest.getUser());
            rentalRepository.createRental(rentRequest.getUser(), rentRequest.getFrom(), rentRequest.getTo());
            return new RentalDto(rentRequest.getUser(), true);
        } else {
            return new RentalDto(rentRequest.getUser(), false);
        }
    }
}




//    public RentalDto process(final User user, final LocalDateTime from, final LocalDateTime to) {
//        boolean isRented = rentalService.rent(user, from, to);
//        if(isRented) {
//            informationService.inform(user);
//            rentalRepository.createRental(user, from, to);
//            return new RentalDto(user, true);
//        } else {
//            return new RentalDto(user, false);
//        }
//    }