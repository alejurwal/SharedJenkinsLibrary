
//Class for the object for JobInfo.groovy
class JobNameInfo{
  string remotePath;
  string jobUrl;
  JobNameInfo(remotePathParam, jobURLParam){
    this.remotePath = remotePathParam;
    this.jobUrl = jobURLParam;
  }
  @NonCPS
  def getJobURL(){
    return this.jobURL;
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
