def call(Map file) {
 
 sh "sudo cp ${ file.war } /usr/share/tomcat/webapps"

}
