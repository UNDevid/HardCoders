public class RequestDescription{

  private int idVideo;
  private int idEndpoint;
  private int requestsNumber;

  public RequestDescription() {
		super();
	}

	public RequestDescription(int idVideo, int idEndpoint, int requestsNumber) {
		super();
		this.idVideo = idVideo;
		this.idEndpoint = idEndpoint;
		this.requestsNumber = requestsNumber;
	}

  
	public int getIdVideo() {
		return idVideo;
	}

	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}

	public int getIdEndpoint() {
		return idEndpoint;
	}

	public void setIdEndpoint(int idEndpoint) {
		this.idEndpoint = idEndpoint;
	}

	public int getRequestsNumber() {
		return requestsNumber;
	}

	public void setRequestsNumber(int requestsNumber) {
		this.requestsNumber = requestsNumber;
	}


}
