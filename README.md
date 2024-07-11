# spring-boot-multi-module

This project shows the way how multi-modules can be used with Spring-Boot and Maven. The root pom is used to inheritance the Spring-Boot Version to the Projects. Three different Projects are accessing the same shared service. The shared service has its own component injected to the Dependency Container.
