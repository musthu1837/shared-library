def mavenDeploy(Map file) {
 
 sh "sudo cp ${ file.war } /opt/tomcatwebapps/"

}
return this
