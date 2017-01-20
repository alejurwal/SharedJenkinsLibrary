
//Class for the object for JobInfo.groovy
class JobNameInfo{
  def remotePath;
  def jobUrl;
  JobNameInfo(remotePathParam, jobURLParam){
    this.remotePath = remotePathParam;
    this.jobUrl = jobURLParam;
  }
def getJobURL(){
    return jobURL;
  }
  /**Get the remote path for trigger remote and copy artifact remote*/
  /*def getRemotePath(){
    return remotePath;
  }
  //Get the jenkins job url
  
  //GEt the short job name without folder full path
  def getShortName(){
    int index = remotePath.lastIndexOf("/");
    if(index != -1){
      return remotePath.substring(index);
    }else{
      return remotePath;
    }
  }*/
}
