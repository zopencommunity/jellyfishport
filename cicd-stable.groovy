node('linux') {
  stage ('Poll') {
    checkout([
      $class: 'GitSCM', branches: [[name: '*/main']], extensions: [],
      userRemoteConfigs: [[url: 'https://github.com/zopencommunity/jellyfishport.git']]])
  }
  stage('Build') {
    build job: 'Port-Pipeline', parameters: [
      string(name: 'PORT_GITHUB_REPO', value: 'https://github.com/zopencommunity/jellyfishport.git'),
      string(name: 'PORT_DESCRIPTION', value: 'Fast Python library for approximate and phonetic matching of strings with Rust core'),
      string(name: 'BUILD_LINE', value: 'STABLE'),
      booleanParam(name: 'PUBLISH_PYTHON_WHEEL', value: true)
    ]
  }
}
