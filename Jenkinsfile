def sbt(commands) {
    sh './sbt ' + commands
}

stage 'Compile'
node {
    checkout scm
    sbt 'clean compile test:compile'
}