package org.foo

class BarStatic {
    static def doAnShLsStatic(script) {
        script.sh 'ls -la'
    }
}

// Used with Pipeline code:

// node {
//     echo 'Hello World'
//     def lib = library('libreria').org.foo
//     lib.BarStatic.doAnShLsStatic(this)
// }