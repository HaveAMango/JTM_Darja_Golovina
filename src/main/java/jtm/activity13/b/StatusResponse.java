package jtm.activity13.b;

public class StatusResponse {

    public StatusResponse(boolean result, String string) {
		// TODO Auto-generated constructor stub
	}
	private Boolean success;
    public StatusResponse() {
		super();
	}
	@Override
	public String toString() {
		return "StatusResponse [success=" + success + ", message=" + message + "]";
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;

    /*
        TODO
        1. Generate getters and setters
        2. Generate toString
        3. Generate two constructors - one with both fields as parameters,
        other default constructor (with no parameters, that does not set any values to fields)
     */
}
