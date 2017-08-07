#!/usr/bin/groovy
package org.py;

def runPython(script, python_interp, python_script) {
    def pythonInt = new File("$python_interp")
    def pythonScript = new File("$script.env.WORKSPACE", "$python_script")
    if(!pythonInt.exists()){
        throw new FileNotFoundException("Unable to find $python_interp")
    }

    if(!pythonScript.exists()){
        throw new FileNotFoundException("Unable to find '$python_script'")
    }

    if (pythonInt.exists() && pythonScript.exists()){
        def processBuilder = new ProcessBuilder("$pythonInt.path $pythonScript.absolutePath".split(" "))
        processBuilder.redirectErrorStream(true)
        def process = processBuilder.start()
        process.inputStream.eachLine { println(it) }
    }
}
return this;
