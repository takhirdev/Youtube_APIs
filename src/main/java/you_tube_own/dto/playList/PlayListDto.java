package you_tube_own.dto.playList;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import you_tube_own.dto.chanel.ChanelDto;
import you_tube_own.dto.profile.ProfileDto;
import you_tube_own.dto.video.VideoDto;
import you_tube_own.enums.PlayListStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PlayListDto {
    private String id;
    private String name;
    private String description;
    private PlayListStatus status;
    private String chanelId;
    private String channelName;
    private ChanelDto chanel;
    private Long profileId;
    private ProfileDto profile;
    private int orderNumber;
    private LocalDateTime createdDate;
    private Long videoCount;
    private List<VideoDto> videoList;
    private Integer totalViewCount;
}
