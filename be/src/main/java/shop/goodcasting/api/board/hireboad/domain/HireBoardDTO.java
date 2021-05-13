package shop.goodcasting.api.board.hireboad.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class HireBoardDTO {
    private long hireBoardId;
    private String title;
    private String contents;

}
