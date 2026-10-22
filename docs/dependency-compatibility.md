# Dependency Compatibility

**Verification date:** 2026-10-22. Sources are official unless marked.

## Levels of "Java version" (do not mix them up)

| Level | Phase 1 | Phase 2 | Phase 3 |
|---|---|---|---|
| Source style | Java 8 idioms | Java 17 features where useful | Java 21 features where useful |
| `maven.compiler.release` | 17 (Boot minimum) | 17 | 21 |
| Build JDK | 21 | 21 | 21 |
| Runtime JDK | 21 | 21 | 21 |

Phase 1 is **not** a genuine Java 8 runtime: Spring Boot 3.5, 4.0 and 4.1 all require Java 17 or later.

## Matrix

| Component | Min Java | Selected | Evidence / reason |
|---|---|---|---|
| JDK | n/a | 21 LTS | Boot 4.1 supports 17 up to 26. [Boot 4.1 requirements](https://docs.spring.io/spring-boot/4.1/system-requirements.html); [Oracle roadmap](https://www.oracle.com/java/technologies/java-se-support-roadmap.html) |
| Spring Boot | 17 | 4.1.1 | Latest stable per the docs above. 4.2.0-M2 is a preview and excluded. |
| Spring Framework | 17 | 7.0.9+ (managed) | Required by Boot 4.1 |
| Maven | n/a | 3.6.3+ required; wrapper version: _fill from `maven-wrapper.properties`_ | Official requirement |
| Tomcat (embedded) | n/a | 11.0.x, Servlet 6.1 | Boot 4.1 requirements |
| Hibernate ORM | 17 | 7.4.5.Final (managed) | [Boot 4.1.1 BOM source](https://github.com/spring-projects/spring-boot/blob/v4.1.1/platform/spring-boot-dependencies/build.gradle) |
| Hibernate Validator | 17 | 9.1.3.Final (managed) | same |
| Jakarta Validation API | n/a | 3.1.1 (managed) | [Boot 4.1.1 coordinates](https://docs.spring.io/spring-boot/4.1/appendix/dependency-versions/coordinates.html) |
| H2 | n/a | 2.4.240 (managed) | same |
| Flyway (PostgreSQL exercise) | n/a | 12.4.0 (managed) | BOM source above |
| Jackson | n/a | Jackson 3 default (`tools.jackson`) | [Boot 4.0 migration guide](https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-4.0-Migration-Guide) |
| Spring Data JPA | n/a | managed, _fill from dependency:tree_ | not retrieved |
| Thymeleaf | n/a | managed, _fill from dependency:tree_ | not retrieved |
| PostgreSQL JDBC | n/a | managed, _fill from dependency:tree_ | not retrieved |
| JUnit 5 / Mockito / AssertJ / Testcontainers | n/a | managed, _fill from dependency:tree_ | not retrieved |

No version is pinned in the poms for "managed" rows. Boot's BOM chooses compatible versions.

## Compatibility evidence per stage

| Stage | Evidence so far |
|---|---|
| Phase 0 | Documentation only. **Not yet confirmed by a local build.** |
| Phase 1, 2, 3 | To be filled from your `./mvnw verify` output at each tag. |

## Starter names (from the Boot 4.0 migration guide)

Main: `spring-boot-starter-webmvc`, `-data-jpa`, `-validation`, `-thymeleaf`, `-restclient`.
Test: `-webmvc-test`, `-data-jpa-test`, `-restclient-test`, plus `spring-boot-starter-test`.
Test annotation changes: `@MockBean` → `@MockitoBean`; `@SpringBootTest` needs `@AutoConfigureMockMvc` for MockMvc.
Package moves for `@WebMvcTest` and `@DataJpaTest`: **not confirmed**, check at the first slice test.

## Known gaps

- Boot 3.5 EOL date (30 June 2026) is from a third party ([HeroDevs](https://www.herodevs.com/blog-posts/spring-boot-3-5-is-officially-end-of-life-here-is-what-that-means-for-teams-still-running-it)); confirm on spring.io.
- Oracle lists Java 17 premier support as "September 2026 (or later)". Irrelevant for learning, relevant if you run production on 17.
