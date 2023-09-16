package lk.ijse.gdse61.aad.projectmanagementtool.util;

import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class ResponseUtil {
    private int code;
    private String message;
    private Object data;

    public ResponseUtil(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
