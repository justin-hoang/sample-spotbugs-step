# sample-spotbugs-step

This project demonstrates how to use the SpotBugs Wercker Step to do a static code analysis on your Java project.

## Usage
The example `wercker.yml` below demonstrates how you can use the SpotBugs Wercker Step.
In this example, we run the SpotBugs static analysis against the target classes in build/classes.
All the the parameters are required in this case, the output format, the output file and the classpath to the classes or jar file.

```
box:
  id: store/oracle/serverjre
  username: $DOCKER_USERNAME
  password: $DOCKER_PASSWORD
  tag: 8

regular-test:
  steps:
    - justin-hoang/spotbugs-step:
      format: -xml
      output: ./result.log
      classpath: build/classes
```

When the build is finished, the output will be available in the file `result.log`, as requested.
