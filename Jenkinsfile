def sbt(commands) {
    sh 'sbt ' + commands
}

stage 'Compile'
node {
    checkout scm
    sbt 'clean compile test:compile'
    parallel 'compile main': {
        sbt 'compile'
    }, 'compile test': {
        sbt 'test:compile'
    }
}