public class MainApp{
  public List <Video> videosList;
  public List <Endpoint> endpointsList;
  public static List <RequestDescription> requestDescriptions;
  public List <CacheServer> cacheServers;

  private static sortVideos(List <Video> listofVideos){

  }
  public static void main(){
    FileUtils.read_file();
    // sortVideos for each endopoint add a list to the endpoint.
    sortVideos(videosList);
    sortEndpoints(endpointsList);
    Endpoint tempEndpoint;
    List <Video> tempListVideo;
    for(int i=0; i<endpointsList.size(); i++){
      tempEndpoint = endpointsList.get(i);
      tempListVideo = tempEndpoint.getRequestedVideo();
      int sizeTempVideo = tempListVideo.size();
      Video tempVideo;
      CacheServer tempCacheServer;
      for (int j=0; j<sizeTempVideo; j++){
        tempVideo=tempListVideo.get(j);
        tempCacheServer=tempEndpoint.getFreeMegabyte(tempVideo.getSize());
        if(tempCacheServer!=null){
          tempEndpoint.getFreeMegabyte(tempVideo.getSize()).insertVideo(tempVideo);
        }
      }
    }

  }
}
