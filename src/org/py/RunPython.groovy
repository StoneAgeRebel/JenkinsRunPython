#!/usr/bin/groovy
package org.py;

def runPython(python_interp, python_script, debug=false) {
    def pythonInt = new File("$python_interp")
    def pythonScript = new File("$python_script")
    if (debug){
        println("DEBUG")
        println("pythonScript = $pythonScript.absolutePath")
//        pythonScript.absolutePath
    }

    if(!pythonInt.exists()){
        throw new FileNotFoundException("Unable to find $python_interp")
    }

    if(!pythonScript.exists()){
        throw new FileNotFoundException("Unable to find '$python_script'")
    }

    if (pythonInt.exists() && pythonScript.exists()){
        def processBuilder = new ProcessBuilder("$pythonInt.path $python_script".split(" "))
        processBuilder.redirectErrorStream(true)
        def process = processBuilder.start()
        process.inputStream.eachLine { println(it) }
    }
}
return this;
//runPython("/usr/local/bin/python3", "helloWorld.py", true)
//runPython("/usr/local/bin/python3", "--version")
