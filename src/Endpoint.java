
public class Endpoint {

	private int id;
	private int ld;
	private int K;
	private List <Video> requestedVideo;
  //List of cacheServers has to be ordered.
  private List <CacheServer> cacheServers;
	public Endpoint(int id, int ld, int k) {
		super();
		this.id = id;
		this.ld = ld;
		K = k;
    requestedVideo = new List<Video>();
    cacheServers = new List<CacheServer>();
	}
  public void setRequestedVideo(List <Video> listofVideos){
    this.requestedVideo = listofVideos;
  }
  public List <Video> getRequestedVideo(){
    RequestDescription tempRequest;
    for(int i = 0; i<MainApp.requestDescriptions.size();i++){
      tempRequest=MainApp.RequestDescriptions.get(i);
      if(id==tempRequest.getIdEndpoint){
        for(int j=0;j<requestedVideo.size();j++){
          if(requestedVideo.get(j).getId()==tempRequest.getIdVideo()){
            requestedVideo.get(j).settempRequestsNumber(tempRequest.getRequestsNumber());
          }
        }
      }
    }
    Collections.sort(requestedVideo, new Comparator<Video>()) {
                @Override
                public int compare(Video lhs, Video rhs) {
                    // -1 - less than, 1 - greater than, 0 - equal, all inversed for descending
                    return lhs.getRequestsNumber > rhs.getRequestsNumber ? -1 : (lhs.getRequestsNumber < rhs.getRequestsNumber ) ? 1 : 0;
                }
            });
    return requestedVideo;
  }
  public CacheServer getFreeMegabyte(int requestMegabytes){
   if (!cacheServers.isEmpty()){
     CacheServer tempCacheSerer;
     for(int i = 0; i<cacheServers.size(); i++){
       tempCacheServer=cacheServers.get(i);
       if(tempCacheServer.getFreeMegabyte()>=requestMegabytes){
         return tempCacheServer;
       }
     }
     return null;
   }

  }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLd() {
		return ld;
	}
	public void setLd(int ld) {
		this.ld = ld;
	}
	public int getK() {
		return K;
	}
	public void setK(int k) {
		K = k;
	}

  public int getAvailableCache(){
    //Ritorna la cacheServer con la latenza minore e con mb disponibili.

    return 0;
  }

	@Override
	public String toString() {
		return "Endpoint [id=" + id + ", ld=" + ld + ", K=" + K + "]";
	}

}
