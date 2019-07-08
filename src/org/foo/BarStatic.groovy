package org.foo

static def doAnShLsStatic() {
    sh 'ls -la'
    return this
}

