# rules_spring_demoapp

External demo apps for testing *rules_spring*.

Navigate into our examples directories:

- [Hello World](examples/helloworld): bare bones example
- [Demo App](examples/demoapp): demonstrates how to use various features in the rule

### Sync with Upstream

**Upgrade to Latest Version**

This example is intended to always be on the latest version of *rules_spring*.
This upgrade is done manually, using the public instructions on rules_spring.
- [MODULE.bazel](MODULE.bazel)

**Code Copy**

The examples in this repo are copies of the examples in rules_spring, with some code modifications
  to reference `springboot()` as an external repo.

  We have a copybara script for the code copying.

```
# install copybara
# cd into the copybara directory

# set JAVA_HOME to JDK21
JAVA_HOME=/Users/mbenioff/dev/tools/jdk/temurin/jdk-21.0.5+11/Contents/Home

java -jar copybara.jar migrate ~/dev/rules_spring_demoapp/copy.bara.sky --force

```