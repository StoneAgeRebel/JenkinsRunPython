def call(String python_script = "dummy"){
    echo "running Python"
    echo python_script
    def files = findFiles(glob: "*.*")
//    def files = findFiles(python_script)
//    println(files.type)
    println(files)
    println(files[0])
    echo "files = ${files}"

}