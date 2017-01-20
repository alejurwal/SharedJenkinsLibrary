import groovy.transform.Field;


//Class for the object for JobInfo.groovy
class JobNameInfo{
  String remotePath;
  String jobUrl;
  JobNameInfo(String remotePath, String jobURL){
    remotePath = remotePath;
    jobURL = jobURL;
  }

  /**Get the remote path for trigger remote and copy artifact remote*/
  String getRemotePath(){
    return remotePath;
  }
  /**Get the jenkins job url */
  String getJobURL(){
    return jobURL;
  }
  /**GEt the short job name without folder full path */
  String getShortName(){
    int index = remotePath.lastIndexOf("/");
    if(index != -1){
      return remotePath.substring(index);
    }else{
      return remotePath;
    }
  }
}

/**This file holds global string constants for jobs in jenkins
Contains the remotejob path, url and shortname in the JobNameInfo class

can access this in pipeilne by calling JenkinsInfo.SEQUOIA.getJobURL();
**/

@groovy.transform.Field m1InstanceID = "4da607053bc6907ec492da2c4d24f79b"
@groovy.transform.Field m2InstanceID = "cf9d1fec90aede714f9259d679a706eb"


@Field final JobNameInfo SEQUOIA_FVT_PERSONAL = new JobNameInfo(
  "jenkins://${m1InstanceID}/sequoia/test/sequoia-fvt-personal",
  "https://jenkins.swg.usma.ibm.com:8443/m1/job/sequoia/job/test/job/sequoia-fvt-personal"
);
@Field final JobNameInfo SEQUOIA_PERSONAL = new JobNameInfo(
  "jenkins://${m1InstanceID}/sequoia/test/sequoia-personal",
  "https://jenkins.swg.usma.ibm.com:8443/m1/job/sequoia/job/test/job/sequoia-personal"
);
@Field final JobNameInfo SEQUOIA = new JobNameInfo(
  "jenkins://${m1InstanceID}/sequoia/build/sequoia",
  "https://jenkins.swg.usma.ibm.com:8443/m1/job/sequoia/job/build/job/sequoia"
);
@Field final JobNameInfo SEQUOIA_STAB = new JobNameInfo(
  "jenkins://${m1InstanceID}/sequoia/build-stab/sequoia-stab",
  "https://jenkins.swg.usma.ibm.com:8443/m1/job/sequoia/job/build-stab/job/sequoia-stab"
);

@Field final JobNameInfo SELFSERVICE_SEQUOIA_BVT = new JobNameInfo(
  "jenkins://${m2InstanceID}/Verse/SupportingJobs/GRTE Self Service - Sequoia BVT",
  "https://jenkins.swg.usma.ibm.com:8443/m2/job/Verse/job/SupportingJobs/job/GRTE%20Self%20Service%20-%20Sequoia%20BVT/"
);
@Field final JobNameInfo SELFSERVICE_SEQUOIA_BVT_LOOP = new JobNameInfo(
  "jenkins://${m2InstanceID}/Verse/SupportingJobs/GRTE Self Service - Sequoia BVT Loop",
  "https://jenkins.swg.usma.ibm.com:8443/m2/job/Verse/job/SupportingJobs/view/SelfService/job/GRTE%20Self%20Service%20-%20Sequoia%20BVT%20Loop/"
);
@Field final JobNameInfo SELFSERVICE_RETURN_KARAF = new JobNameInfo(
  "jenkins://${m2InstanceID}/Verse/SupportingJobs/Self Service Return Karaf",
  "https://jenkins.swg.usma.ibm.com:8443/m2/job/Verse/job/SupportingJobs/view/SelfService/job/Self%20Service%20Return%20Karaf/"
);
@Field final JobNameInfo SELFSERVICE_DEPLOY_KARAF = new JobNameInfo(
  "jenkins://${m2InstanceID}/Verse/SupportingJobs/Self Service Deploy Karaf",
  "https://jenkins.swg.usma.ibm.com:8443/m2/job/Verse/job/SupportingJobs/job/Self%20Service%20Deploy%20Karaf/"
);
@Field final JobNameInfo FIND_DUPLICATE_BVTISSUES = new JobNameInfo(
  "jenkins://${m2InstanceID}/Admin/Admin Find Duplicate bvt_issues",
  "https://jenkins.swg.usma.ibm.com:8443/m2/job/Admin/view/RTCTools/job/Admin%20Find%20Duplicate%20bvt_issues/"
);
