public class CacheServer {

private int idCacheServer;
private int latencyCache;
private int cacheSize;
private List <Video> videoList = new List();

  public CacheServer(int id, int size, int latency){
    idCacheServer = id;
    cacheSize = size;
    latencyCache=latency;
  }
  public void insertVideo(Video newVideo){
    videoList.add(newVideo);

  }
	public int getIdCacheServer() {
		return idCacheServer;
	}

	public void setIdCacheServer(int idCacheServer) {
		this.idCacheServer = idCacheServer;
	}

	public int getLatencyCache() {
		return latencyCache;
	}

	public void setLatencyCache(int latencyCache) {
		this.latencyCache = latencyCache;
	}

	public int getCacheSize() {
		return cacheSize;
	}

	public void setCacheSize(int cacheSize) {
		this.cacheSize = cacheSize;
	}

	public List<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}

	@Override
	public String toString() {
		return "CacheServer [idCacheServer=" + idCacheServer + ", latencyCache=" + latencyCache + ", cacheSize=" + cacheSize + ", videoList=" + videoList + "]";
	}
}
