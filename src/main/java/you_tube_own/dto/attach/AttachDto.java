package you_tube_own.dto.attach;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AttachDto {
    private String id;
    private String originalName;
    private String path;
    private Long size;
    private String type;
    private LocalDateTime createdData;
    private String url;
}
