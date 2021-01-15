package exception;

/**
 * @Author: Ningxb
 * @Date: 2021-01-14 14:37
 * @description: ${description}
 */

public class BaseMvpException extends Exception {
    private static final long serivalVersionUID = -1L;

    private Integer errorCode;
    private Exception exception;
    private String errorMessage;


    public BaseMvpException(Integer errorCode){
        this.errorCode = errorCode;
    }

    public BaseMvpException(Integer errorCode,String errorMessage){
        this(errorCode);
        this.errorMessage = errorMessage;
    }

    public BaseMvpException(Exception e,Integer errorCode,String errorMessage){
        this(errorCode);
        this.errorMessage = errorMessage;
        this.exception = e;
    }

    public BaseMvpException(Exception e){
        this.exception = e;
    }

    public BaseMvpException(Exception e,Integer errorCode){
        this(e);
        this.exception = e;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
