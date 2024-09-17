package mr.airbnbclone.listing.application.dto.sub;

import mr.airbnbclone.listing.application.dto.vo.DescriptionVO;
import mr.airbnbclone.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
        ) {
}
