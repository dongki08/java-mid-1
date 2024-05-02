package enumeration.test.http;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "Bad Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;

    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static HttpStatus findByCode(int code) {
        HttpStatus[] httpStatuses = HttpStatus.values();
        for (HttpStatus status : httpStatuses) {
            if(status.getCode() == code) {
                return status;
            }
        }
        return null;
    }

    public boolean isSuccess() {
        return code < 300 && code >= 200;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
