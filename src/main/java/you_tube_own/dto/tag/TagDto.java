package you_tube_own.dto.tag;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class TagDto {
    private String id ;

    @NotBlank(message = "Tag name is required")
    private String name ;

    private LocalDateTime createdDate;
}
