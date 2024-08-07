package you_tube_own.dto.comment;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import you_tube_own.enums.ReactionType;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CommentLikeDto {
    private String id;
    private Long userId;
    private String commentId;
    private ReactionType reaction;
    private LocalDateTime createdDate;
}
