# sample-spotbugs-step

This project demonstrates how to use the SpotBugs Wercker Step to do a static code analysis on your Java project.

## Usage
The example `wercker.yml` below demonstrates how you can use the SpotBugs Wercker Step.
In this example, we run the SpotBugs static analysis against the target classes in target/classes.
SpotBugs step works with byte codes so make sure you build the project first before running SpotBugs step.
All the the parameters are required in this case, the output format, the output file and the classpath to the classes or jar file.

```
box:
  id: store/oracle/serverjre
  username: $DOCKER_USERNAME
  password: $DOCKER_PASSWORD
  tag: 8

build:
  steps:
    - wercker/spotbugs-step:
      format: -xml
      output: ./result.log
      classpath: target/classes
```
Before running wercker build, do the following exports:
```
export X_DOCKER_USERNAME="your docker username"
export X_DOCKER_PASSWORD="your docker password"
```
Make sure you have your project built:
```
mvn clean install
wercker build
```
When the build is finished, the output will be available in the file `result.log`, as requested.
