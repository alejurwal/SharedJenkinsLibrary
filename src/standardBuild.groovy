#!/usr/bin/groovy
/*
Map allBuilds = [:]

standardBuild() {
    echo "Created standardBuild instance"
    allBuilds = [:]
}
*/
def api; 
def lib;


def execute()
{
    node ('linux')
    {
        
       for (build in standardBuildSpec.builds)
       {
           echo "hello"
        }
    }
}
