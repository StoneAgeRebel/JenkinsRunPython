def call(String python_script = "dummy"){
    echo "running Python"
    echo python_script
    def files = findFiles(glob: "*.*")
//    def files = findFiles(python_script)
    echo files

}