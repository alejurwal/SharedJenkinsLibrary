//testing3
appID = "wibac"
appName = "accounts"
appComponentVersionKeys = "accounts_appVersion"
appReleaseFileSystemRoot = "/workerfs/release/OBP/ACCOUNTS/"
approvalEnvironments = "QA_MT2"
prodEnvironments = "QA_MT2"

def getAppID() {
    return appID;
}

def getAppName() {
    return appName;
}
def getAppComponentVersionKeys() {
    return appComponentVersionKeys
}
def appReleaseFileSystemRoot() {
    return appReleaseFileSystemRoot
}
def approvalEnvironments() {
    return approvalEnvironments
}
def prodEnvironments() {
    return prodEnvironments
}

return this;
