def call(String python_script = "dummy"){
    echo "running Python"
    echo python_script
    def files = findFiles(glob: "**/*.*")
//    def files = findFiles(python_script)
//    println(files.type)
    echo "files = ${files}"
    println(files)
//    println(files.getPath())
    println(files[0])
    echo "getPath ${files[0].path}"
    println(files[0].getPath())
    echo "getName ${files[0].name}"
    println(files[0].getName())

}