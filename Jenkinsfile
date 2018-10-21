#!/usr/bin/env groovy
node('master') {
    stage('say-something') {
        sh "echo 'hello world DIma'"
    }
    stage('build') {
        mvn package
    }
}
