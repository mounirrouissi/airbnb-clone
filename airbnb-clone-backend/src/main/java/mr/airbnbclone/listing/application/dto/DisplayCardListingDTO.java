package mr.airbnbclone.listing.application.dto;

import mr.airbnbclone.listing.application.dto.sub.PictureDTO;
import mr.airbnbclone.listing.application.dto.vo.PriceVO;
import mr.airbnbclone.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
