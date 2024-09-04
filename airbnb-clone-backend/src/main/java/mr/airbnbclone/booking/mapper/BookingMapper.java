package mr.airbnbclone.booking.mapper;

import mr.airbnbclone.booking.application.dto.BookedDateDTO;
import mr.airbnbclone.booking.application.dto.NewBookingDTO;
import mr.airbnbclone.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
