
//Class for the object for JobInfo.groovy
class JobNameInfo implements Serializable {
  string remotePath;
  string jobUrl;
  
  @NonCPS
  def getJobURL(){
    return jobURL;
  }
  //Get the remote path for trigger remote and copy artifact remote
  /*@NonCPS
  def getRemotePath(){
    return this.remotePath;
  }
  //Get the jenkins job url
  
  //GEt the short job name without folder full path
  @NonCPS
  def getShortName(){
    int index = remotePath.lastIndexOf("/");
    if(index != -1){
      return remotePath.substring(index);
    }else{
      return remotePath;
    }
  }*/
}
