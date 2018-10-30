#!/usr/bin/env groovy

node('master') {
    stage('build') {
        git url: 'https://github.com/alexandrov-d/bootci.git'

        sh "echo 'hello world DIma'"
        sh "./mvnw package"
    }
}
