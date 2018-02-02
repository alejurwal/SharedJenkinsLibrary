#!/bin/groovy
import src.*

Map Builds = [:]
//builds = [:]

def call()
{
    builds.add("testElement")
    def build = new standardBuild()
}
