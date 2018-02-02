#!/bin/groovy
import src.*

Map Builds = [matthew: 30, mark:25, luke: 40]
//builds = [:]

def call()
{
    builds.add("testElement")
    def build = new standardBuild()
}
