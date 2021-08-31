# AndroidLibraryTemplate

First, ensure that you have a `gradle.properties` file in `~/.gradle/` (or Windows equivalent) with the following info.
```groovy
GITHUB_USER=yourusername
GITHUB_PERSONAL_ACCESS_TOKEN=yourtoken
```

## Usage
```groovy
   allprojects {
        repositories {
            google()
            mavenCentral()
            maven {
                name = "GithubPackages"
                url = uri("https://maven.pkg.github.com/BetweenTwoBits/AndroidLibraryTemplate")
                credentials {
                    username = project.properties['GITHUB_USER']
                    password = project.properties['GITHUB_PERSONAL_ACCESS_TOKEN']
                }
            }
        }
   }
   dependencies {
        implementation 'com.github.BetweenTwoBits:AndroidLibraryTemplate:x.x.x'
   }
```
