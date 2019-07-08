package org.foo

def doAnShLs() {
    sh 'ls -la'
}

return this

// Used with pipeline code:

// @Library('libreria')
// import org.foo.Bar


// node {
//    echo 'Hello World'
//    def z = new Bar()
//    z.doAnShLs()
// }