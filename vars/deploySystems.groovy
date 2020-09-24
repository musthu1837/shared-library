def mavenDeploy(Map file) {
 sh "sudo rm -rf /opt/tomcat/webapps/${file.war}"
 sh "sudo cp ${file.war} /opt/tomcat/webapps/"

}
return this
