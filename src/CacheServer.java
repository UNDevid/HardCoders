import java.util.*;

public class CacheServer {

private int idCacheServer;
private int latencyCache;
private int cacheSize;
private ArrayList<Video> videoList;

  public CacheServer(int id, int size, int latency, ArrayList<Video> videoList){
    idCacheServer = id;
    cacheSize = size;
    latencyCache=latency;
    videoList = new ArrayList<>();
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

	public ArrayList<Video> getVideoList() {
		return videoList;
	}

	public void setVideoList(ArrayList<Video> videoList) {
		this.videoList = videoList;
	}

	@Override
	public String toString() {
		return "CacheServer [idCacheServer=" + idCacheServer + ", latencyCache=" + latencyCache + ", cacheSize=" + cacheSize + ", videoList=" + videoList + "]";
	}
}
