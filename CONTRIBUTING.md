# Introduction

Thank you for considering contributing to PyClippy! We're actively developing this plugin, and would love your contributions and advice as we go along. Because we expect to be moving at a quick pace, please email tadas [at] solutionloft.com if you want to get involved in building features or contributing substantial pieces of code so we can discuss a plan of action for getting you in our development flow.

After we've released a beta version of the plugin, we'll take more time to formalize a code of conduct, style guidelines, and the like without needing the overhead of an email-based discussion.

If you have design advice, feature requests (keeping scope within reason), small bugs/bugfixes, or other comments to contribute, feel free to raise Issues!

# Product Management

Please use the standard GitHub issue tracker to raise any suggestions, feature requests, etc. If we decide to
add the issue to the development roadmap, we'll create an issue in our [JIRA board](https://solutionloft.atlassian.net/projects/PYC/issues),
and development may commence with the commit message scheme described below.

# Commit Messages

Because we integrate with JIRA to track our development progress, please prepend ALL commit messages with the appropriate
ticket from our [JIRA board](https://solutionloft.atlassian.net/projects/PYC/issues). E.g. if you're working on
PYC-6 Maven Integration, your commit messages should look something like:

"PYC-6 Added maven skeleton"  
"PYC-6 Included PyClippy metadata in maven"  
"PYC-6 Added JxBrowser to maven"  

# Local Development Setup

We recommend the following setup:
* Write PyClippy code on IntelliJ IDEA Ultimate
* Test functionality by pointing your run configuration at PyCharm Ultimate
* Have IntelliJ IDEA Community Edition (CE) source code checked out in case you need to do in-depth debugging

All development should be done with Java 8 (at least JDK 1.8.0_151).

Steps to follow for setting up your development environment:
1) [Download](http://www.oracle.com/technetwork/java/javase/downloads/index.html) JDK 8, at minimum Java SE 8u151.
2) [Download](https://www.jetbrains.com/pycharm/download/) PyCharm (preferably Professional, but CE is OK too)
3) [Download](https://www.jetbrains.com/idea/download/) both IDEA Ultimate and IDEA CE. Ultimate (preferred) for development,
CE for debugging.
4) [Check out and build the source code for IDEA CE](http://www.jetbrains.org/intellij/sdk/docs/basics/checkout_and_build_community.html)
5) [Configure the IntelliJ Platform SDK](http://www.jetbrains.org/intellij/sdk/docs/basics/getting_started/setting_up_environment.html#configuring-intellij-platform-sdk)
6) Fire up IDEA for development, and VCS checkout from repository this PyClippy repository
7) Depending on your versions, directories, you may need to to adjust the "Plugin (PyCharm)" and "Plugin (IntelliJ CE)"
run configurations (dropdown arrow -> Edit Configurations...) so that they point to the correct JREs (PyCharm's JRE
and the *non-source-code* JRE of IDEA CE).
8) At this point, you should be able to run the Plugin (PyCharm) run configuration and see PyClippy show up in the
right toolbar.

Useful projects to download the source for to use as reference:
* [StackInTheFlow](https://github.com/vcu-swim-lab/stack-intheflow) Feature-filled version of what we're doing, but pointing directly
at StackOverflow's API.
* [IntelliJ's Included Plugins](https://github.com/JetBrains/intellij-plugins) Huge repository of examples, very useful.
* [mongo4idea](https://github.com/dboissier/mongo4idea) Well-written IDEA plugin worth referencing for an alternative
to the out-of-the-box included ones.

Useful bookmarks:
* [IntelliJ Platform SDK](http://www.jetbrains.org/intellij/sdk/docs/welcome.html)
* [Plugin Developer Gitter (i.e. IRC)](https://gitter.im/IntelliJ-Plugin-Developers/Lobby?source=orgpage)
* [Plugin Developer Forums](https://intellij-support.jetbrains.com/hc/en-us/community/topics/200366979-IntelliJ-IDEA-Open-API-and-Plugin-Development)
* [IntelliJ Support Community](https://intellij-support.jetbrains.com/hc/en-us/community/topics)

# Architecture Notes

See plugin.xml if you want to toggle between being able to run locally on PyCharm versus IDEA CE.


# Contribution License Agreement (CLA)

We have no CLA for contributors to sign; contributions to PyClippy are governed by the "license in = license out" model of Apache 2.0.
