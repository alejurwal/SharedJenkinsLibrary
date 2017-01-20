
//Class for the object for JobInfo.groovy
public class JobNameInfo implements Serializable {
  def remotePath;
  def jobUrl;
  JobNameInfo(remotePathParam, jobURLParam){
    this.remotePath = remotePathParam;
    this.jobUrl = jobURLParam;
  }

  /**Get the remote path for trigger remote and copy artifact remote*/
  def getRemotePath(){
    return remotePath;
  }
  /**Get the jenkins job url */
  def getJobURL(){
    return jobURL;
  }
  /**GEt the short job name without folder full path */
  def getShortName(){
    int index = remotePath.lastIndexOf("/");
    if(index != -1){
      return remotePath.substring(index);
    }else{
      return remotePath;
    }
  }
}
