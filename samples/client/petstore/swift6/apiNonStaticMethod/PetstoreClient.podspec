Pod::Spec.new do |s|
  s.name = 'PetstoreClient'
  s.ios.deployment_target = '12.0'
  s.osx.deployment_target = '10.13'
  s.tvos.deployment_target = '12.0'
  s.watchos.deployment_target = '4.0'
  s.version = '1.0.0'
  s.source = { :git => 'git@github.com:OpenAPITools/openapi-generator.git', :tag => 'v1.0.0' }
  s.authors = ''
  s.license = 'Proprietary'
  s.homepage = 'https://github.com/openapitools/openapi-generator'
  s.summary = 'PetstoreClient'
  s.source_files = 'Sources/PetstoreClient/**/*.swift'
  s.dependency 'Alamofire', '~> 5.10'
  s.dependency 'PromiseKit/CorePromise', '~> 8.1'
  s.dependency 'RxSwift', '~> 6.8'
end
