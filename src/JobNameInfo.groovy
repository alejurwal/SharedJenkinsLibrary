#!/bin/groovy
import src.*

//Map allBuilds = [:]
builds = [:]

def call()
{
    builds.add("testElement")
    def build = new standardBuild()
}
